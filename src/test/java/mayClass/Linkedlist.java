package mayClass;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;


public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> al = new LinkedList<String>();
		al.add("orange");
		al.add("mango");
		al.add("grapes");
		al.add("apple");
		al.add("mango");
		al.add("banana");
		al.add("pineapple");
		
		
		for(String x : al){			
			System.out.println(x);			
		}
		
		
		
		
	}

}
