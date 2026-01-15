package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestAddAll {
	public static void main(String[] args) {
		
		Collection c1 = new ArrayList();
		
		c1.add(23);
		c1.add("ram");
		c1.add(true);
		c1.add(23.34);
		
		System.out.println( "Collection :"+"c1 :" + c1);
		System.out.println(c1);
		System.out.println(c1.size());
//		System.out.println(c1.removeAll(c1));
		System.out.println(c1.containsAll(c1));
		
		System.out.println("..................................................");
		
	Collection c2 = new ArrayList();
	
	c2.add(24);
	c2.add("ram");
	System.out.println("size :" + c2.size());
	
	c2.addAll(c1);
	System.out.println(c2);
	}

}
