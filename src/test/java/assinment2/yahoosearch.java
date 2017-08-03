package assinment2;
import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class yahoosearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("D:/SOFT/geckodriver-v0.16.1-win64/geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
		
		WebDriver ff = new FirefoxDriver();
		ff.get("http://www.search.yahoo.com");
		ff.manage().window().maximize();

		ff.findElement(By.id("yschsp")).sendKeys("selenium");
		
		List<WebElement> list = ff.findElements(By.xpath("//ul[@id='yui_3_10_0_1_1486706087079_714']/li"));
		
		int size = list.size();
		
		
		
		for(int i=0; i<size; i++){
			
			
			String lst = ff.findElement(By.xpath("//ul[@id='yui_3_10_0_1_1486706087079_714']/li[i]")).getAttribute("data");
			
			System.out.println(lst);
			
			   
			
					
			
			
		}
		
	}

}
