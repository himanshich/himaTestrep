package EMIassinment;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;

@Test(dataProvider="emical")
public class EMIDataprovider {
		FirefoxDriver ff ;
				
	public void calemi(Map<String,String >hm){
		
			File file = new File("D:/SOFT/geckodriver-v0.16.1-win64/geckodriver.exe");
			System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
			
			 ff = new FirefoxDriver();
			ff.get("https://www.allahabadbank.in/english/emi_calculator.aspx");
			ff.manage().window().maximize();
		
		String a =hm.get("Amount");
		String b=hm.get("rate");
		String c=hm.get("tenure");
		String val=hm.get("exp");
		
		ff.findElement(By.id("one")).sendKeys(a);
		ff.findElement(By.name("interest")).sendKeys(b);
		ff.findElement(By.name("instalment")).sendKeys(c);
		ff.findElement(By.name("B1")).click();
		String albval = ff.findElement(By.id("four")).getAttribute("value");
		
		System.out.println(albval);
		
		if(Double.parseDouble(val) == Double.parseDouble(albval)){
			
			System.out.println("Expected and actual are equal-:" + "Expected=: " +albval+ "actual=: " +val );
		} else {
			
			System.out.println("Expected and actual are not equal" + "Expected=: " +albval+ "actual=: " +val );
		}
		
		ff.close();
	}
	
	

	

@DataProvider(name="emical")
public Iterator<Object[]> cal_emi() throws Exception{
	
	ExcelRW rw = new ExcelRW("C:\\Users\\sarah\\Desktop\\EMI.xlsx");
	int row = rw.getRowcount("Sheet1");
	int col = rw.getColcount("Sheet1");
	
	List<Object[]> ls = new ArrayList<Object[]>();
	
	for(int iRow=1;iRow<=row;iRow++){
		
		Object[] obj = new Object[1];
		
	Map<String, String> hm = new HashMap< String , String >();
	
	for(int jCol=0;jCol< col;jCol++){
		
		String key = rw.readCellValue("Sheet1", 0, jCol);
		
		String val = rw.readCellValue("Sheet1", iRow, jCol);
		
		System.out.println("KEY is:"  + key +  " val is :"  + val );
		
		hm.put(key, val);
		
		
		
	}
	
	obj[0]=hm;
	ls.add(obj);
	
		
	}
	

return ls.iterator();
	
	
}


}