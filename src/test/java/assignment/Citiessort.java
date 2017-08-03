package assignment;
import java.util.List;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class Citiessort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:/SOFT/geckodriver-v0.13.0-win64/geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
		
		WebDriver ff = new FirefoxDriver();
		ff.get("http://www.mapsofindia.com/maps/cities/cities-in-india.html");
		ff.manage().window().maximize();
		
		ff.findElement(By.linkText(linkText))

	}

}
