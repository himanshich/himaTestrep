package assignment;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Base {
	WebDriver ff ;
	ExtentReports eReports;
	ExtentTest startTest;
	public String browser_type;
	
	@BeforeSuite
	public void prerequisites(){ 
		
		 eReports = new ExtentReports("‪D:\\Selenium\\MyReports\\Reports_" +getDate() + ".html");
		
	}
	
	
	@BeforeMethod
	public void launch() throws Exception {
		
//		File ff = new File("D:/SOFT/geckodriver-v0.13.0-win64/geckodriver.exe");
		File ff = new File("D:/SOFT/geckodriver-v0.16.1-win64/geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", ff.getAbsolutePath());
	
		
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\settings.properties");
		System.out.println("FIS String");
		Properties prop = new Properties();
		
		prop.load(fis);
		
		ff.get(prop.getProperty("url"));
		
		ff.manage().window().maximize();
		
		System.out.println("URL Launch");
				
	}
	
	@AfterMethod
		public void TearDown(){
		
		eReports.endTest(startTest);
		eReports.flush();
		
		ff.close();
	}
	
	
	public void compaire(String exp_val, String act_val,String Stepname) throws Exception{
		
		if(exp_val.equals(act_val)){
			
			startTest.log(LogStatus.PASS, Stepname,"Passed the step" +Stepname );
			
		}else {
			
			startTest.log(LogStatus.FAIL,Stepname , "Test case fail as actual result is-:" +act_val + "and expected result is -: " + exp_val + startTest.addScreenCapture(screenshot()));
			
		}
		
		
					
		}
	
	public  String getDate(){
		
		Date date = new Date();
		
		SimpleDateFormat dFormat = new SimpleDateFormat("dd-mm-yyyy hh-ss");
		
		String dte = dFormat.format(date);
		return dte;
		
			}

	public String screenshot() throws Exception {
		
TakesScreenshot imgcapture=(TakesScreenshot)ff;		
      
File screen = imgcapture.getScreenshotAs(OutputType.FILE);

String fpath = "D:\\Selenium\\MyReports\\Screenshot";

FileUtils.copyFile(screen, new File(fpath));

return fpath;

	}

	
		
	}
