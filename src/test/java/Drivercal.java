import java.util.Scanner;


public class Drivercal {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter first no.");
		 String fnum = scanner.next();
		 
		 int num1 = Integer.parseInt(fnum);
		 
		 System.out.println("Please enter second no.");
		 String mnum = scanner.next();
		 int num2 = Integer.parseInt(mnum);
		 
		 simplecalc smp = new simplecalc();
		 
		System.out.println(smp.add(num1, num2)); 
		System.out.println(smp.mul(num1, num2));
		
		
		 
		
		
		
		
	}

}
