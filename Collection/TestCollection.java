package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	
	public static void main(String[] args) {
		
		Collection c = new ArrayList();  /// collection interface and arraylist class hai//
		
		c.add(23);
		c.add("helo");
		c.add(23.34);
		c.add(true);
//		
//		System.out.println("c.size : " + c);
//		System.out.println(c.contains(23)); // check avalibility membership
//		
		for(Object o : c) {
			System.out.println(o);
			
		}
		
		System.out.println(c.remove(23));
		System.out.println(c);
		System.out.println(c.contains(23.34));
		System.out.println(c.size()+ "size ");
		
	}

}
