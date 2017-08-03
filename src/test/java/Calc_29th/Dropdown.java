package Calc_29th;

import java.util.List;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//File file = new File("D:/SOFT/geckodriver-v0.13.0-win64/geckodriver.exe");
		File file = new File("D:/SOFT/geckodriver-v0.16.1-win64/geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
		
		WebDriver ff = new FirefoxDriver();
		ff.get("https://www.carwale.com/");
		ff.manage().window().maximize();

		
ff.findElement(By.id("btnYes")).click();
		
		WebElement usedcars = ff.findElement(By.xpath("//li[@data-tabs='usedCars']"));
		usedcars.click();
		
		List<WebElement> lst = ff.findElements(By.xpath("//ul[@id='minPriceList']/li"));
		
//		System.out.println(lst.get(2).getText());
//		String searchString="3 Lakh;6 Lakh;12 Lakh";
		
		int row = lst.size();
		
		for(int i = 0;i<row;i++){
						
			System.out.println(lst.get(i).getText());
			if(lst.get(i).getText().equals("12 Lakh ")){
				
				
				lst.get(i).click();
				break;
				
			}
			
			
		}
		System.out.println("-----------------------------");
		
		
		for(WebElement xyz : lst){
			
			System.out.println(xyz.getText());			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
