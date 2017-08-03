package assinment2;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Emiverification {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		File file = new File("D:/SOFT/geckodriver-v0.13.0-win64/geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
		
		WebDriver ff = new FirefoxDriver();
		ff.get("https://www.allahabadbank.in/english/emi_calculator.aspx");
		ff.manage().window().maximize();
		ff.findElement(By.id("one")).sendKeys("10000");
		ff.findElement(By.name("interest")).sendKeys("10");
		ff.findElement(By.name("instalment")).sendKeys("36");
		ff.findElement(By.name("B1")).click();
		String albval = ff.findElement(By.id("four")).getAttribute("value");
		
		String albhandle = ff.getWindowHandle();
		
		ff.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
		ArrayList<String> tabs = new ArrayList<String> (ff.getWindowHandles());
		 
		ff.switchTo().window(tabs.get());
		
//		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN); 
	//	ff.findElement(By.linkText("http://www.unionbankofindia.co.in/EMICal.aspx")).sendKeys(selectLinkOpeninNewTab);
		
		ff.get("http://www.unionbankofindia.co.in/EMICal.aspx");
		ff.manage().window().maximize();
		String unihandle = ff.getWindowHandle();
			
		ff.findElement(By.name("loanamount")).sendKeys("10000");
		ff.findElement(By.id("rate")).sendKeys("10");
		ff.findElement(By.id("pmonths")).sendKeys("36");
		ff.findElement(By.id("Button1")).click();
		String unival = ff.findElement(By.id("EMI")).getAttribute("value");
		
		if (unival.equals(albval)){
			
			System.out.println("both are equal");
			System.out.println(unival);
			
					
		}
		
		System.out.println("Both emi are not equal");
		
		
		
		
		
		
		
		
		
		
		
	}

}
