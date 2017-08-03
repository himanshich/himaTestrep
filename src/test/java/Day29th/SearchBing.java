package Day29th;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchBing extends base{
	
	String Bingsearchandextract(String search){
	
		ff.findElement(By.tagName("input")).sendKeys(search);
		ff.findElement(By.id("sb_form_go")).click();
		return ff.findElement(By.className("sb_count")).getText();
		
		
		
	}
	
	
	
	
	
	
	
	

}
