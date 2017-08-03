package Day1;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class emicalc_Relative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("D:/SOFT/geckodriver-v0.13.0-win64/geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
		
		WebDriver ff = new FirefoxDriver();
		ff.get("https://www.allahabadbank.in/english/emi_calculator.aspx");
		//enter amount
		//ff.findElement(By.xpath("//input[@id='one']")).sendKeys("2000");
		
		ff.findElement(By.xpath("//div[@class='frmbody']/div[@class='drow'][1]/div[3]/input")).sendKeys("10000");
		//enter rate
		//ff.findElement(By.xpath("//input[@name='interest']")).sendKeys("10");
		
		ff.findElement(By.xpath("//div[@class='frmbody']/div[@class='drow'][2]//input")).sendKeys("10");
		
		//enter tenure
		//ff.findElement(By.xpath("//input[@id='three']")).sendKeys("120");
		
		ff.findElement(By.xpath("//div[@class='frmbody']/div[@class='drow'][3]//input")).sendKeys("120");
		
		//click on cal
		//ff.findElement(By.xpath("//input[@name='B1']")).click();
		ff.findElement(By.xpath("//div[@class='frmbody']/div[@class='drow'][4]//input")).click();
		//extract emi
		String output = ff.findElement(By.xpath("//input[@id='four']")).getAttribute("value");
	     System.out.println(output);
	     //close app
	     ff.close();

	}

	
}
