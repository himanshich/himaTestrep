package Day1;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CopyOfEmiCalDay2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub//C:\Users\sarah\AppData\Local\Google\Chrome\Application
		
		//File file = new File("D:/SOFT/geckodriver-v0.13.0-win64/geckodriver.exe");
		File file = new File("D:/SOFT/geckodriver-v0.16.1-win64/geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
		
		WebDriver ff = new FirefoxDriver();
		ff.get("https://www.allahabadbank.in/english/emi_calculator.aspx");
		
//		Enter amount
		ff.findElement(By.id("one")).sendKeys("20000");
		
//		Enter rate
		ff.findElement(By.id("two")).sendKeys("10");
		
//		enter tenure
		ff.findElement(By.id("three")).sendKeys("120");
		
//		Click on calculate
		ff.findElement(By.name("B1")).click();		
		
//		Extract EMI	
		String output = ff.findElement(By.id("four")).getAttribute("value");
		System.out.println(output);
		
		
	
//		System.out.println(ff.findElement(By.id("four")).getAttribute("value"));
		
		
//		Close application
		ff.close();
	}

}
