package Day5;

public class Encapsulationtest {
	
	 private int age;
	 
	 // mouse over on age then click on get set u will get below functions

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	 
	private String agestat()
	{
		String status;
		if (age>18) {
			
			status="major";
			
		} else
			
		{
			status="minor";
		}
		
		
		return status;
		
		
	}
	 

}
