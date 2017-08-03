package assignment;

import java.io.File;






import javax.swing.Spring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;



public class Temrature  {

	private static String result;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		File file = new File("D:/SOFT/geckodriver-v0.13.0-win64/geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
		
		WebDriver ff = new FirefoxDriver();
		ff.get("http://www.unit-conversion.info/temperature.html");
		ff.manage().window().maximize();
		
		ff.findElement(By.xpath("//select[@id='field_D1']/option[@value='0']")).click();
		ff.findElement(By.id("T1")).clear();
		ff.findElement(By.id("T1")).sendKeys("40");
					
		ff.findElement(By.xpath("//select[@id='field_D2']/option[@value='1']")).click();
		 String result = ff.findElement(By.id("T2")).getAttribute("value");
				
		Tempformula temp = new Tempformula();
		            double val = temp.celtof();
		           
		

	}

}

