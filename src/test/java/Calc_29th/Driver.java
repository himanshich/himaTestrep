package Calc_29th;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import bsh.ParseException;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter first nuber");
		String fnum = scanner.next();
		int ifnum = Integer.parseInt(fnum);
		
		System.out.println("Plese enter second no.");
		     String snum = scanner.next();
		     int isnum = Integer.parseInt(snum);
		     
		     SimpleCalc sim1 = new SimpleCalc();
		     System.out.println(sim1.Add(ifnum, isnum));
		     System.out.println(sim1.Multiply(ifnum, isnum));
		     System.out.println(sim1.ktog(ifnum));
		     
		     // scitific cal
		     
		     System.out.println("Please enter base");
		     String bas = scanner.next();
		      double dbas = Double.parseDouble(bas);
		      System.out.println("enter power no.");
		      String pow = scanner.next();
		      double dpow = Double.parseDouble(pow);
		     
		     ScientificCalc sc = new ScientificCalc();
		     
		     System.out.println(sc.Add(ifnum, isnum));
		     System.out.println(sc.Multiply(ifnum, isnum));
		     System.out.println(sc.powers(dbas,dpow));
		     
		     
		     
		     
		
		
		

	}

}
