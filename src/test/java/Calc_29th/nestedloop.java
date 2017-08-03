package Calc_29th;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class nestedloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		File file = new File("D:/SOFT/geckodriver-v0.13.0-win64/geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
		
		WebDriver ff = new FirefoxDriver();
		ff.get("https://www.carwale.com/");
		ff.manage().window().maximize();
		

		ff.findElement(By.id("btnYes")).click();
		
		WebElement usedcars = ff.findElement(By.xpath("//li[@data-tabs='usedCars']"));
		usedcars.click();
		
		
//		System.out.println(lst.get(2).getText());
		String searchString="3 Lakh;6 Lakh;12 Lakh;48 Lakh";
		
//		int row = lst.size();



		String[] option = searchString.split(";");

		for(int i=0;i<option.length ;i++){			
		
			String x=option[i];
			System.out.println(x);
			List<WebElement> ele = ff.findElements(By.xpath("//ul[@id='minPriceList']/li[contains(text(),'" + x + "')]"));
//			if(ff.findElements(By.xpath("//ul[@id='minPriceList']/li[contains(text(),'" + x + "')]")).size()>0)
			if (ele.size() > 0){
				
				System.out.println("passed as value " + x + " is found");
				
			}else{
				System.out.println("Failed as value " + x + " is not found");
				
			}
			
		
		}
	}

}
