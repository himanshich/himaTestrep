package Calc_29th;

import org.apache.poi.ss.formula.ptg.PowerPtg;

public class ScientificCalc extends Base {
	
	int Add(int a , int b)
	
	{
		
		int c= super.Add(a, b)+10;
		return c;
		
		
	}
	
	// power 
	
   double powers(double a , double b)
   
   {
	   return Math.pow(a, b);
	   
	   
	   
   }
		
	}


