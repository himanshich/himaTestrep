package EMIassinment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsr {
	
	void Main() throws IOException{
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\settings.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		String bytes ="ff;ch;ie";
		
		String[] br = bytes.split(";");
		
		for(int i=0;i<br.length; i++){
			
			WebDriver ff=null;
		if(br[i].equals("ff")){
			
			ff =new FirefoxDriver();
			
		}else if (br[i].equals("ch")){
			
			System.setProperty("Webdriver.crome.driver", System.getProperty("user.dir")+ "\\\\src\\test\\resources\\chromedriver.exe");
		}
			
			
			
			
		}
		
		}
	
	
	

}
