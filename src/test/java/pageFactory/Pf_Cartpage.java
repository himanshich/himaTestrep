package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonLibraries.CommonActions;

public class Pf_Cartpage extends CommonActions{

	@FindBy(xpath="//cite[@class='mid']/span[2]")
	public WebElement lbl_book;
	
	@FindBy(id="frmCart")
	public WebElement frm_cart;
	
	@FindBy(xpath="//span[contains(text(), +'+String+'+)]")
	public WebElement book_cart;
	
	@FindBy(xpath="//span[contains(text(),+'+String+'+)]/..//div[@class='cross']")
	public WebElement Book_del;
	
	@FindBy(className="top_cart_span")
	public WebElement cart_link;
	
	
	public Pf_Cartpage(WebDriver driver){		
		PageFactory.initElements(driver, this);		
	}
	
	
	public void deletMethod() {
		

		
		if(output.equals(exp)){
			
			ff.findElement(By.xpath("//span[contains(text(),'Flood and Fire')]/..//div[@class='cross']")).click();
		
		
	}
	
	
}
