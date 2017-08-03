package Day1;

import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alertcheck {
	
public static void main(String[] args) {
		
	
	File file = new File("D:/SOFT/geckodriver-v0.16.1-win64/geckodriver.exe");
	System.setProperty("webDriver.gecko.driver", file.getAbsolutePath());
		FirefoxDriver ff = new FirefoxDriver();
		ff.get("https://bookshopofindia.com/booknotfound.asp");
		ff.manage().window().maximize();
		
		ff.findElement(By.name("btnSubmit")).click();
		
		Alert a1 = ff.switchTo().alert();
		a1.dismiss();
		
		ff.switchTo().defaultContent();
		
		
		
		
	}
	

}
