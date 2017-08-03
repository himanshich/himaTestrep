package mayClass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class Day5 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		 List<String> a1 = new ArrayList<String>();
		 a1.add("orange");
		 a1.add("banana");
		 a1.add("mango");
		 a1.add("apple");
		 a1.add("grapes");
		 
		// System.out.println(a1.contains("mango"));
		 
		 List<String> v1 = new ArrayList<String>();
		 
		 v1.add("orange");
		 v1.add("papaya");
		 v1.add("mango");
		 v1.add("apple");
		 v1.add("kiwi");
		 
		 Iterator<String> it = v1.iterator();
		 while(it.hasNext()){
			 
			 String val = it.next();
			 
			 if (a1.contains(val)==false){
				 
				 System.out.println(val);			 
			 } 
			 
			 
		 }
	}

}
