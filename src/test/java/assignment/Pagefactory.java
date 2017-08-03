package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pagefactory extends Keywords {
	
	@FindBy(id="one")
	public WebElement txt_amount;
	
	@FindBy(name="interest")
	public WebElement txt_rate;
	
	@FindBy (id="three")
	public WebElement txt_tenure;
	
	@FindBy (name="B1")
	public WebElement btn_tenure;
	
	@FindBy (id="four")
	public WebElement txt_Emi;
	
	public  Pagefactory (WebDriver Driver) {
		
		PageFactory.initElements(Driver, this);
		
		
	}
	
	public void enterDetails(String a, String b, String c){
		
		enterVal(txt_amount,a);
		enterVal(txt_rate,b);
		enterVal(txt_tenure,c);
		clickEvent(btn_tenure);
		
	}

	
	}

	

	
	
	
	


