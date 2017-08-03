package Calc_29th;

import java.io.File;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class dropdownpractice {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		File file = new File("D:/SOFT/geckodriver-v0.16.1-win64/geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
		
		
		FirefoxDriver fd = new FirefoxDriver();
		
		fd.get("https://www.carwale.com/");
		fd.manage().window().maximize();
		fd.findElement(By.xpath("//li[@data-tabs='usedCars']")).click();
				
		fd.findElement(By.id("usedCarsList")).sendKeys("Bangalore");
		fd.findElement(By.xpath("//span[@id='upDownArrow']")).click();
		List<WebElement> list = fd.findElements(By.xpath("//ul[@id='minPriceList']/li"));
		
		int row = list.size();
		
		for(int i=0;i<row;i++){
			
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equalsIgnoreCase("12 Lakh")){
				
				list.get(i).click();
				
				break;
			}
			
		}
		
		for(WebElement xyz:list){
			
			System.out.println(xyz.getText());
			
		}

		
		
		
	}

}
