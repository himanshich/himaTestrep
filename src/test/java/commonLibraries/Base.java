package commonLibraries;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Base {
	public WebDriver ff;
	public Logger Log;
	public ExtentTest startTest;
	public String browser_type;
	public static ExtentReports eReports;
	
	@BeforeSuite
	public void prerequisite(){		
	eReports = new ExtentReports("D:\\Selenium\\MyReports\\Reports_" + getdtime() + ".html" );
	
	
		}
	
	
	@Parameters({"browser"})
	@BeforeMethod
	public void launchApp(){
				
		
		File file = new File("D:/SOFT/geckodriver-v0.16.1-win64/geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
		
		 ff = new FirefoxDriver();
		
		
		ff.get("http://books.rediff.com/");
		ff.manage().window().maximize();
		ff.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		
		
	}
	
	
	@AfterMethod
	
	public void tearDown(ITestResult result)
	{
		if(result.getStatus()==ITestResult.SUCCESS){
			startTest.log(LogStatus.PASS,"Test Completion","passed the test case"+startTest.addScreenCapture(imagePath));
			
		}else if (result.getStatus()==ITestResult.FAILURE){
			startTest.log(LogStatus.FAIL,"Test completion",result.getThrowable()+startTest.addScreenCapture(getscreen()));
			
		}
				
		eReports.endTest(startTest);
		eReports.flush();
		ff.quit();
		
		
	}
	
//	public void tearDown(ITestResult result) throws Exception{	
//		if(result.getStatus()==ITestResult.SUCCESS){
//			startTest.log(LogStatus.PASS, "Test Completion","Passed the testcase" + startTest.addScreenCapture(getscreen()));
//		}else if(result.getStatus()==ITestResult.FAILURE){
//			startTest.log(LogStatus.FAIL, "Test Completion",result.getThrowable() +  startTest.addScreenCapture(getscreen()));
//		}
//		
//		eReports.endTest(startTest);
//		eReports.flush();
//		ff.quit();
//	}
//	
	//get the date and time stamp
	 
//		 public String getdtime(){
//			Date date = new Date();
//			SimpleDateFormat dformat = new SimpleDateFormat("dd-MMM-yyyy hh-mm-ss");
//			String dte = dformat.format(date);
//			return dte;
//		 }
		
        public String getdtime(){
		
		Date date = new Date();
		SimpleDateFormat dFormat = new SimpleDateFormat("dd-mmm-yyy hh-mm-ss");
		 String dte=dFormat.format(date);
		 return dte;
		
		
	}
	
//			get screenshot
		 public String getscreen() throws Exception{
			 TakesScreenshot imgcapture=(TakesScreenshot)ff;
				File screen = imgcapture.getScreenshotAs(OutputType.FILE);
				String fpath= "E:\\MayReports\\screenshot\\snap_" + getdtime() + ".png";
				FileUtils.copyFile(screen, new File(fpath));	 
		 		return fpath;
	}

		 
		 
		 public String getElementScreen(WebElement ele) throws Exception{
			 	TakesScreenshot imgcapture=(TakesScreenshot)ff;
				File screenshot = imgcapture.getScreenshotAs(OutputType.FILE);
				BufferedImage  fullImg = ImageIO.read(screenshot);

				// Get the location of element on the page
				Point point = ele.getLocation();

				// Get width and height of the element
				int eleWidth = ele.getSize().getWidth();
				int eleHeight = ele.getSize().getHeight();

				// Crop the entire page screenshot to get only element screenshot
				BufferedImage eleScreenshot= fullImg.getSubimage(point.getX(), point.getY(),
				    eleWidth, eleHeight);
				ImageIO.write(eleScreenshot, "png", screenshot);
				String path="D:\\Selenium\\MyReports\\Screenshot_" + getdtime() + ".png";
				// Copy the element screenshot to disk
				FileUtils.copyFile(screenshot, new File(path));
				return path;
		 }
		 
		 
//		 common validation
		 
//		 validation with screenshot on page level
		 public void cvContains(String Actual,String Expected,String Stepname) throws Exception{
		 if(Actual.contains(Expected)){
				Log.info("Passed the Step" + Stepname);
				startTest.log(LogStatus.PASS, Stepname,"Passed the Step" + Stepname);
				
			}else{
				Log.error("Failed the Step " + Stepname + " as Actual is " + Actual + " and expected was " + Expected);
				startTest.log(LogStatus.FAIL, Stepname,"Failed the Step " + Stepname + " as Actual is " + Actual + " and expected was " + Expected + startTest.addScreenCapture(getscreen()));
//				Assert.fail();
			}
		 
		 }
		 
//		 validation with screenshot on element level
		 public void cvContains(String Actual,String Expected,String Stepname,WebElement ele) throws Exception{
			 if(Actual.contains(Expected)){
					Log.info("Passed the Step" + Stepname);
					startTest.log(LogStatus.PASS, Stepname,"Passed the Step" + Stepname);
					
				}else{
					Log.error("Failed the Step " + Stepname + " as Actual is " + Actual + " and expected was " + Expected);
					startTest.log(LogStatus.FAIL, Stepname,"Failed the Step " + Stepname + " as Actual is " + Actual + " and expected was " + Expected + startTest.addScreenCapture(getElementScreen(ele)));
//					Assert.fail();
				}
			 
			 }
			 
//		 Equals
//		 validation with screenshot on page level
		 public void cvEquals(String Actual,String Expected,String Stepname) throws Exception{
		 if(Actual.equals(Expected)){
				Log.info("Passed the Step" + Stepname);
				startTest.log(LogStatus.PASS, Stepname,"Passed the Step" + Stepname);
				
			}else{
				Log.error("Failed the Step " + Stepname + " as Actual is " + Actual + " and expected was " + Expected);
				startTest.log(LogStatus.FAIL, Stepname,"Failed the Step " + Stepname + " as Actual is " + Actual + " and expected was " + Expected + startTest.addScreenCapture(getscreen()));
//				Assert.fail();
			}
		 
		 }
		 
//		 validation with screenshot on element level
		 public void cvEquals(String Actual,String Expected,String Stepname,WebElement ele) throws Exception{
			 if(Actual.equals(Expected)){
					Log.info("Passed the Step" + Stepname);
					startTest.log(LogStatus.PASS, Stepname,"Passed the Step" + Stepname);
					
				}else{
					Log.error("Failed the Step " + Stepname + " as Actual is " + Actual + " and expected was " + Expected);
					startTest.log(LogStatus.FAIL, Stepname,"Failed the Step " + Stepname + " as Actual is " + Actual + " and expected was " + Expected + startTest.addScreenCapture(getElementScreen(ele)));
//					Assert.fail();
				}
			 
			 }
		 
}






