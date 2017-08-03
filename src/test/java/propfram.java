import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class propfram {

public static void main(String[] args) {
		
	File file = new File("D:/SOFT/geckodriver-v0.16.1-win64/geckodriver.exe");
	System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
		FirefoxDriver ff = new FirefoxDriver();
		ff.get("http://propertiesindia.com/");
		ff.manage().window().maximize();
		
		WebElement element = ff.findElement(By.xpath("//iframe[@src='search/about.php']");
		
		ff.switchTo().frame(element);
		
		ff.findElement(By.xpath("//input[@id='bar_category' and @class='checkBoxRadioBtn']")).click();
		System.out.println(ff.findElement(By.xpath("//input[@id='bar_category' and @class='checkBoxRadioBtn']")).isSelected());
		
		ff.switchTo().defaultContent();
	
		
		
		
	}
	
	
	
}
