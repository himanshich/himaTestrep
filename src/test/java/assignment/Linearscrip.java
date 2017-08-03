package assignment;

import java.io.File;
import java.util.Map;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class Linearscrip extends Base {
	
	Logger log=Logger.getLogger(Linearscrip.class);
		
	@Test(dataProvider="Emical",dataProviderClass=assignment.DP.class)
	public void operation(Map<String,String> mp) throws Exception{
	
		     startTest = eReports.startTest("TC01");
				log.info("Test Started");
				String a = mp.get("Amount").replace(".0", "");
				String b = mp.get("rate").replace(".0", "");
				String c = mp.get("tenure").replace(".0", "");
				String exp_val = mp.get("exp");
				System.out.println("amount" +a +"rate" +b  +"tenure" +c);
				log.info("expected value is-: " +exp_val);
				startTest.log(LogStatus.INFO, "Expected value is" +exp_val );
				Pagefactory pageEmi = new Pagefactory(ff);
				pageEmi.enterDetails(a, b, c);

	String  act_val= pageEmi.txt_Emi.getAttribute("val");
	log.info("Actual value is-:" +act_val);
	startTest.log(LogStatus.INFO, "Actual value is-:" +act_val);
	System.out.println("Test Report");
	compaire(act_val, exp_val, "EMI validation");
	System.out.println("COMPARISON");
	}
	




}