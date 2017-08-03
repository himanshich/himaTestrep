import java.io.File;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;


public class javaexecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	File file = new File("D:/SOFT/geckodriver-v0.16.1-win64/geckodriver.exe");
   System.setProperty("webdriver.gecko.driver",file.getAbsolutePath());
	FirefoxDriver ff = new FirefoxDriver();
	ff.get("http://www.google.com");
	ff.manage().window().maximize();
	ff.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	WebElement element = ff.findElement(By.xpath("//input[@name='q']"));
	JavascriptExecutor js=( (JavascriptExecutor)ff);
	
	js.executeScript("arguments[0].value='him';", element);
	
	
	
	
	
	
	
	
	}
}