package Day28th;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class closevsquit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:/SOFT/geckodriver-v0.13.0-win64/geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
		
		WebDriver ff = new FirefoxDriver();
		ff.get("http://in.rediff.com");
		ff.manage().window().maximize();
		
		ff.close();
		
		
		//ff.quit();

	}

}
