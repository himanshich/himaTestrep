package Day4_normal;
import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Htmltable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:/SOFT/geckodriver-v0.13.0-win64/geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
		
		WebDriver ff = new FirefoxDriver();
		ff.get("http://www.homeloanshub.com/mortgage-calculator/");
		ff.manage().window().maximize();
		
		 String year = "4";
		 
		 int exp_months = Integer.parseInt(year)*12;
			
		ff.findElement(By.name("principal")).sendKeys("10000");
		ff.findElement(By.name("interest")).sendKeys("10");
		ff.findElement(By.id("tenure")).sendKeys(year);
		ff.findElement(By.className("btn1")).click();
		
		//List<WebElement> ele = ff.findElements(By.xpath("//div[@id='emiresults']/table[@class='tabstyle']/tbody/tr"));
		//int size2 = ele.size();
		
		//String text = ff.findElement(By.xpath("//div[@id='emiresults']/table[@class='tabstyle']/tbody/tr["+ size2 +"]/td[2]")).getText();
		
		
		int Exp_month=Integer.parseInt(year)*12;
		
		String text = ff.findElement(By.xpath("//div[@id='emiresults']/table[@class='tabstyle']/tbody//td[text()="+Exp_month+"]/td[2]")).getText();
		
	//	  List<WebElement> fd = ff.findElements(By.xpath("//div[@id='emiresults']/table[@class='tabstyle']/tbody/tr"));
    	  List<WebElement> fd = ff.findElements(By.xpath("//div[@id='emiresults']/table[@class='tabstyle']/tbody/tr"));

		  int size = fd.size();
		  
		 //System.out.println(ff.findElement(By.xpath("//div[@id='emiresults']/table[@class='tabstyle']/tbody/tr["+ size + "]/td[2]")).getText());
		 System.out.println(ff.findElement(By.xpath("//div[@id='emiresults']/table[@class='tabstyle']/tbody/tr["+ size +  "]/td[2]")).getText());

		  
		 for(int i = 1 ; i<size;i++){
				
				String months = ff.findElement(By.xpath("//div[@id='emiresults']/table[@class='tabstyle']/tbody/tr[" + (i+1) +  "]/td[1]")).getText();
				System.out.println(months);
				
				if(Integer.parseInt(months)==exp_months){
					
					String output = ff.findElement(By.xpath("//div[@id='emiresults']/table[@class='tabstyle']/tbody/tr[" + (i+1) +  "]/td[2]")).getText();
					
					System.out.println("EMI is " + output);
					break;
					
				}
						
			}
	}

}

