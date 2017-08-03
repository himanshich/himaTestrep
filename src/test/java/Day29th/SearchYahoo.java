package Day29th;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchYahoo extends base {
	
	 String searchandextract(String serchoption){
		
		 ff.findElement(By.tagName("input")).sendKeys(serchoption);
		 ff.findElement(By.className("sbb")).click();
		 return ff.findElement(By.xpath("//span[contains(text(),'results')]")).getText();
		 
		 
		 
		 
		 
		 
		 
		 
		
		
		
		
		
	}
	

}
