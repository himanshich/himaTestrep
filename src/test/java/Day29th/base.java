package Day29th;
import org.openqa.selenium.firefox.FirefoxDriver;
public class base {
	
	FirefoxDriver ff;
	
	 void launch_app(String url){
		 
		   ff = new FirefoxDriver();
		   ff.get(url);
		   ff.manage().window().maximize();
		
		 
		 
	 }
	 
	 void close_App () {
		 
		// ff.close();
		 ff.quit();
		 
	 }
	 
	
	

}
