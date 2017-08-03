import java.io.File;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;




public class practice {

	
	
	public static void main(String[] args) {
		
		
		File file = new File("D:/SOFT/geckodriver-v0.16.1-win64/geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
			FirefoxDriver ff = new FirefoxDriver();
			ff.get("https://bookshopofindia.com/");
			ff.manage().window().maximize();
			
//			WebElement ele_book = ff.findElement(By.name("searchon"));
//			
//		   Select slc = new Select(ele_book);
//		   
//		   slc.selectByVisibleText("keyword");
//		   
		   
			
			
		}
		
		
		
		
	
		
		
		
		
		
		
	}

