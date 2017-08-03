package Day1;

import java.io.File;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert {

	


		
		public static void main(String[] args) {
			
			
			File file = new File("D:/SOFT/geckodriver-v0.16.1-win64/geckodriver.exe");
			System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
			FirefoxDriver ff = new FirefoxDriver();
			ff.get("https://bookshopofindia.com/booknotfound.asp");
			ff.manage().window().maximize();
			
			
			
			
			
		
	}

		







	
	
}
