package Day28th;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class yahoosearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:/SOFT/geckodriver-v0.13.0-win64/geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
		
		WebDriver ff = new FirefoxDriver();
		ff.get("https://in.search.yahoo.com/");
		ff.findElement(By.tagName("input")).sendKeys("selenium");
		ff.findElement(By.className("sbb")).click();
		String result = ff.findElement(By.xpath("//span[contain(text(),'result')]")).getText();
		System.out.println(result);
		//System.out.println(ff.findElement(By.cssSelector("div.compPagination>span")).getText());
		
		//System.out.println("Second way:" + ff.findElement(By.cssSelector("div.compPagination>span")).getText());
		
		

	}

}
