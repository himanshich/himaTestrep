
public class driverException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=6;
		int b=0;
			int c;	
		
		exception_try ey = new exception_try();
		
		try{
			System.out.println(ey.div(a, b));
			
			}catch(NullPointerException e){
				
				System.out.println("null"+e.getMessage());
				
			}catch(ArithmeticException e){
				
				System.out.println("Arith"+ e.getMessage());
				
			}catch(Exception e){
				
				System.out.println("default"+e.getMessage());
			}finally{
				
				System.out.println("bye");
				
			}
		
		c=a+b;
		System.out.println(c);
	}

}
