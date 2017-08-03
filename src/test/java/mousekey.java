
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class mousekey {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		File file = new File("D:/SOFT/geckodriver-v0.16.1-win64/geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
		FirefoxDriver ff = new FirefoxDriver();
		ff.get("https://www.burbank.com.au/victoria");
		WebElement about = ff.findElement(By.xpath("//span[contains(text(),'About Burbank')]"));
		WebElement testimonial = ff.findElement(By.xpath("//span[contains(text(),'Testimonials ')]"));
		
		Actions act = new Actions(ff);
		act.moveToElement(about);
		Thread.sleep(2000);
		act.moveToElement(testimonial).click().build().perform();
		
		act.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.chord(Keys.CONTROL,"a")).build().perform();
		
		
		
	}

}
