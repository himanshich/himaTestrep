package Day5;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Multiplewindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:/SOFT/geckodriver-v0.13.0-win64/geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
		
		WebDriver ff = new FirefoxDriver();
		ff.get("http://in.rediff.com/");
		ff.manage().window().maximize();
		
		String parentwindow = ff.getWindowHandle();
		System.out.println(parentwindow);
		
		Set<String> allHandles = ff.getWindowHandles();
		
		Iterator<String> it = allHandles.iterator();
		
		while(it.hasNext()){
			
			String hndle = it.next();
			System.out.println(hndle);
			
			if (!parentwindow.equals(hndle)){
				
				ff.switchTo().window(hndle);
				System.out.println(ff.getTitle());
				ff.close();
				ff.switchTo().window(parentwindow);
				
				
				
				
			}
			
		}
		
		
		

	}

}
