package Day28th;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CSS_absolutepath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:/SOFT/geckodriver-v0.13.0-win64/geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
		
		WebDriver ff = new FirefoxDriver();
		ff.get("https://www.allahabadbank.in/english/emi_calculator.aspx");
		// enter amount
		
		//ff.findElement(By.cssSelector("html>body>form>div[3]>div[1]>div:nth-of-type(2)>span>div>div:nth-of-type(2>div:nth-of-type(1)>div:nth-of-type(3)>input"));
	
		//ff.findElement(By.cssSelector("input[id='one']")).sendKeys("20000");
		ff.findElement(By.cssSelector("div.frmbody>div.drow:nth-of-type(1) input")).sendKeys("20000");
		
		//enter rate
		
		ff.findElement(By.cssSelector("input[name='interest']")).sendKeys("10");
		
		//enter tenure
		
		ff.findElement(By.cssSelector("input#three")).sendKeys("120");
		ff.findElement(By.name("B1")).click();
		
		String output = ff.findElement(By.id("four")).getAttribute("value");
		System.out.println(output);
		
		//close app
		
		ff.close();

	}

}
