import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class actionss {

	
		public static void main(String[] args) throws InterruptedException  {
			
			File file = new File("D:/SOFT/geckodriver-v0.16.1-win64/geckodriver.exe");
			System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
			FirefoxDriver ff = new FirefoxDriver();
			ff.get("https://www.burbank.com.au/victoria");
			ff.manage().window().maximize();
			ff.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			
			WebElement about = ff.findElement(By.id("p_lt_ctl01_Submenunav_lblaboutburbank"));
			WebElement testimonial = ff.findElement(By.xpath("//li[@id='p_lt_ctl01_Submenunav_about_testimonials_clients']//span[1]"));
			
			Actions act = new Actions(ff);
			
			act.moveToElement(about).perform();
			Thread.sleep(2000);
			act.moveToElement(testimonial).click().build().perform();
			
			
			
			act.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.chord(Keys.CONTROL,"a")).build().perform();
			
			
			
			}
		
		
		
		
	}


