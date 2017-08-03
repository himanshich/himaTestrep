package mayClass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Arraylist {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		
		List<String> al = new ArrayList<String>();
		al.add("orange");
		al.add("mango");
		al.add("grapes");
		al.add("apple");
		al.add("mango");
		al.add("banana");
		al.add("pineapple");
//		check whether mango exist in list
		System.out.println(al.contains("mango"));
		
	//	al.remove("orange");
		//al.remove("pineapple");
		
//		remove all values of a list from another list including duplicates
		//List<String> rl = new ArrayList<String>();
		//rl.add("mango");
		//al.removeAll(rl);
		
		List<String> vl = new ArrayList<String>();
		vl.add("orange");
		vl.add("lemon");
		vl.add("mango");
		vl.add("pineapple");
		vl.add("apple");
		vl.add("dates");
		vl.add("peach");
		

		Iterator<String> it = vl.iterator();
		while(it.hasNext()){
			String val = it.next();
			if(al.contains(val)==false){
				
				System.out.println(val);
				
			}
		}
		
		
	}
}

	