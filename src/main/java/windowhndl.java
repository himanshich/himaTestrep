import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.firefox.FirefoxDriver;


public class windowhndl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirefoxDriver ff = new FirefoxDriver();
		ff.get("http://in.rediff.com/");
		ff.manage().window().maximize();
		
		String whandle = ff.getWindowHandle();
		
		System.out.println(whandle);
		Set<String> handles = ff.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		
		while(it.hasNext()){
			
			String hadle = it.next();
			System.out.println(hadle);
			if(!whandle.equals(hadle)){
				
				ff.switchTo().window(hadle);
				System.out.println(ff.getTitle());
				
				
				
			}
			
			
		}
		
		
		
		
		
		
	}

}
