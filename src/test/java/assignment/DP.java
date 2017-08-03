package assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.testng.annotations.DataProvider;

import EMIassinment.ExcelRW;

public class DP {
	
	@DataProvider(name="Emical")
		public static Iterator<Object[]> DP_func() throws Exception{
			
			List<Object[]> ls = new ArrayList<Object[]>();
			
			ExcelRW rw = new ExcelRW("C:\\Users\\sarah\\Desktop\\EMI.xlsx");
			int iRow = rw.getRowcount("Sheet1");
			int cal  = rw.getColcount("Sheet1");
			for(int i=1;i<=iRow;i++){
				
				Object[] obj=new Object[1];
				Map<String, String> hm = new HashMap<String,String>();
				for(int j=0;j<cal;j++){
					
					String key = rw.readCellValue("Sheet1", 0, j);
					String value = rw.readCellValue("Sheet1", iRow, j);
					
					 hm.put(key, value);
				}
				
				obj[0]=hm;
				ls.add(obj);													
				}
				
			
				return ls.iterator();
				
				
			}
			

			
			
		
		
		
		
		
	}
	


