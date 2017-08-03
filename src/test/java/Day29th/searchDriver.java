package Day29th;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class searchDriver {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SearchYahoo sy= new SearchYahoo();
		sy.launch_app("http://search.yahoo.com");
		System.out.println(sy.searchandextract("selenium"));
		sy.close_App();
		
		//Bing
		
		
		SearchBing sb = new SearchBing();
		sb.launch_app("http://www.bing.com/");
		System.out.println(sb.Bingsearchandextract("selnium"));
		sb.close_App();
	}

}
