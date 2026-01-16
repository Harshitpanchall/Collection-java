package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	
	public static void main(String[] args) {
		
		Collection c = new ArrayList(); // collection is reference type (parents interface = array is object
		//// subclass;
		c.add(23);
		c.add(24);
		c.add("ram");
		c.add("yam");
		c.add(24.4);
		c.add(23.34);
		
		System.out.println("collection : " + c);
		System.out.println("collection :" + c.size());
		
		System.out.println(c.add(c));
		
		System.out.println(c.contains(22)); 
		
		System.out.println(c.remove(23));
		
		System.out.println(c);
	}

}
