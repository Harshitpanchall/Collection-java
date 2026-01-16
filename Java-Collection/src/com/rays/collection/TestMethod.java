package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestMethod {
	public static void main(String[] args) {
		
		Collection c1 = new ArrayList();
		
		c1.add(23);
		c1.add("ram");
		c1.add(23.3);
		c1.add(true);
		
		System.out.println("c1 size :" +c1.size());
		
		System.out.println(".......................................");
		
		Collection c2 = new ArrayList();
		
		c2.add(24);
		c2.add(23);
		c2.add("sai");
		c2.add(true);
		
		System.out.println("c2 size : " + c2);
		
		c1.addAll(c2);
		System.out.println(" addAll : " + c1);
		
		System.out.println(c1.contains(26));
		System.out.println(c1.contains(23)); // check the element
		
		System.out.println(c1.containsAll(c2));
		
		c1.retainAll(c2);    //// retilas value is common value c1 and c2 20 and 20
		System.out.println(c1);
	}

}
