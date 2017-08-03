package scripts;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;

import pageFactory.Pf_Cartpage;
import pageFactory.Pf_HomePage;
import pageFactory.Pf_LoginPage;
import pageFactory.Pf_Productsdetailpage;
import commonLibraries.Base;

public class Scenario_Cart extends Base{

	

	@Test(dataProvider="Dpglobal",dataProviderClass=dataProvider.Dp_RediffProj.class)
	//@Test(dataProvider="Dpglobal",dataProviderClass=dataProvider.Dp_RediffProj.class,groups={"qa"})
	public void addbook(Map<String,String> hm) throws Exception{
		
		Log = Logger.getLogger(Scenario_Cart.class);		
		startTest = eReports.startTest(hm.get("TC_ID") + "_" + hm.get("Order"));
//	create Page factor object for every class
		
		Pf_HomePage home = new Pf_HomePage(ff);
		Pf_LoginPage login = new Pf_LoginPage(ff);
		Pf_Productsdetailpage details = new Pf_Productsdetailpage(ff);
		Pf_Cartpage cart = new Pf_Cartpage(ff);
//		validat Home page title
		cvContains(ff.getTitle().toLowerCase(), "online bookstore", "Home page title Validation");
//		click on Signin
		home.caClick(home.lk_signIn);
		
		cvContains(ff.getTitle().toLowerCase(), "books online", "Login page title Validation");
//		enter user details
		login.enterLoginDetails(hm.get("Username"), hm.get("Password"));
		
//		validat Home page title
		cvContains(ff.getTitle().toLowerCase(), "online bookstore", "Home page title Validation");
		
		home.enterSearch(hm.get("searchbook"));
		
//		click on the first book	
		home.caClick(home.img_firstbook);
		
//		check the title of Product details page
		cvContains(ff.getTitle().toLowerCase(), hm.get("searchbook").toLowerCase(), "Product details page title Validation");
		details.caClick(details.btn_buynow);
		
//		Check the title of cart page
		cvContains(ff.getTitle().toLowerCase(), "shopping", "Product details page title Validation");
		
		ff.switchTo().frame(cart.frm_cart);
		
		cvContains(cart.caGetOuptut(cart.lbl_book).toLowerCase(),hm.get("searchbook").toLowerCase(),"Add book to cart validation", cart.lbl_book);
		
		ff.switchTo().defaultContent();
	}
		
//Delet book
	@Test(dataProvider="Dpglobal",dataProviderClass=dataProvider.Dp_RediffProj.class)
	public void deleBook(Map<String,String> hm) {
		
		
		
		 Log = Logger.getLogger(Scenario_Cart.class);
		  startTest = eReports.startTest(hm.get("TC_ID")+"_"+hm.get("Order"));
		  
		  Pf_HomePage home = new Pf_HomePage(ff);
			Pf_LoginPage login = new Pf_LoginPage(ff);
			Pf_Productsdetailpage details = new Pf_Productsdetailpage(ff);
			Pf_Cartpage cart = new Pf_Cartpage(ff);
		  cvContains(ff.getTitle().toLowerCase()," Online Book Shopping", "Home page title Validation");
		  
		  home.caClick(home.lk_signIn);
		  
		  cvContains(ff.getTitle().toLowerCase(),"Books Online", "Sign in page verfication");
		  
		  login.enterLoginDetails(hm.get("Username"), hm.get("Password"));
		  
		  cvContains(ff.getTitle().toLowerCase(), "online bookstore", "home page validation");
		  
		  // user name verification 
		  
		  String act = home.caGetOuptut(home.lbl_userName);
		  
		  cvEquals(act, hm.get("Username"), "Username on home page succssfully loged in");
		  
		//click on cart
		  	cart.caClick(cart.cart_link);
		  	
		  	cvContains(ff.getTitle().toLowerCase(), "rediff.com ! Shopping", "cart page or nox verification");
		  	
		  	
		  
		  
		  	
		  
		  
		
		
		WebElement output = ff.findElement(By.xpath("//span[contains(text(), String E)]"));
		}
		
	}
		
	
		
	
	
	
	
}
