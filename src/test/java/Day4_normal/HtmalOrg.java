package Day4_normal;
import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HtmalOrg {
	
	public static void main(String[] args) {
		File file = new File("D:/SOFT/geckodriver-v0.16.1-win64/geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
		
		WebDriver ff = new FirefoxDriver();
		ff.get("http://www.homeloanshub.com/mortgage-calculator/");
		ff.manage().window().maximize();
		String years = "4";
		ff.findElement(By.name("principal")).sendKeys("10000");
		ff.findElement(By.name("interest")).sendKeys("10");
		ff.findElement(By.id("tenure")).sendKeys(years);
		
		ff.findElement(By.className("btn1")).click();
		
		List<WebElement> fd = ff.findElements(By.xpath("//div[@id='emiresults']/table[@class='tabstyle']/tbody/tr"));
		
		int size = fd.size();
		
		System.out.println(size);
//		One way
		//System.out.println("Easy output" + ff.findElement(By.xpath("//div[@id='emiresults']/table[@class='tabstyle']/tbody/tr[" + size +  "]/td[2]")).getText());
		
		int exp_months = Integer.parseInt(years) * 12;
		
//		Second way
		String output2 = ff.findElement(By.xpath("//div[@id='emiresults']/table[@class='tabstyle']/tbody//td[text() = '" + exp_months +"']/../td[2]" )).getText();
	System.out.println("Vague output " + output2);
		
//		third way
//		for(int i = 1 ; i<size;i++){
//			
//			String months = ff.findElement(By.xpath("//div[@id='emiresults']/table[@class='tabstyle']/tbody/tr[" + (i+1) +  "]/td[1]")).getText();
//			System.out.println(months);
//			
//			if(Integer.parseInt(months)==exp_months){
//				
//				String output = ff.findElement(By.xpath("//div[@id='emiresults']/table[@class='tabstyle']/tbody/tr[" + (i+1) +  "]/td[2]")).getText();
//				
//				System.out.println("EMI is " + output);
//				break;
//				
//			}
//					
		}
		
		
		
	}
	
}



