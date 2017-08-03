package Day1;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CopyOfEmiCalDay1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub//C:\Users\sarah\AppData\Local\Google\Chrome\Application
		
		File file = new File("D:/SOFT/geckodriver-v0.13.0-win64/geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
		
		WebDriver Driver = new FirefoxDriver();
		Driver.get("http://www.google.com");
	}

}
