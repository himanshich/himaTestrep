import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class assertss {

	@Test
	public void exampleasserts(){
		
		SoftAssert sf = new SoftAssert();
		//SoftAssert sf = new SoftAssert();
		FirefoxDriver ff = new FirefoxDriver();
		ff.get("https://www.allahabadbank.in/english/emi_calculator.aspx");
		
//		Forward traversing
//		ff.findElement(By.xpath("//div[@class='frmbody']/div[1]//input")).sendKeys("100000");
		
//		backward traversiong
		ff.findElement(By.xpath("//input[@name='principal']/../../../div[1]//input[1]")).sendKeys("10000");
		
		//Assert.assertEquals(actual, expected);
		sf.assertFalse(ff.getTitle().contains("allahabad bank"));
		
		
//		Assert.assertEquals(expected, actual);
	//	sf.assertFalse(ff.getTitle().contains("allahabad bank"));
		
//		Enter rate of Interest
		ff.findElement(By.name("interest")).sendKeys("10");
		
//		Enter duration
		ff.findElement(By.name("instalment")).sendKeys("120");
		
//		Click on calculate
		ff.findElement(By.name("B1")).click();
		String exp = "678";
//		Extract EMI
		
		String output = ff.findElement(By.id("four")).getAttribute("value");
		
//		sf.assertFalse(output.equals(exp));
		sf.assertFalse(output.equals(exp));
		// if inside statment not true or false 
		System.out.println(output);
		
		
		sf.assertAll();
		
	}
	
}
