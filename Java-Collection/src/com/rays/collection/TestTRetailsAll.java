package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestTRetailsAll {
	public static void main(String[] args) {
		
		Collection c1 = new ArrayList();
		
		c1.add(23);
		c1.add("ram");
		c1.add(12.23);
		c1.add(true);
		
		System.out.println(c1);
		System.out.println("c1 size : " + c1.size());
		
		System.out.println("..................................");
		
		Collection c2 = new ArrayList();
		
		c2.add(23);
		c2.add("ran");
		c2.add(23.3);
		c2.add(false);
		
		System.out.println("c2 size : " + c2.size());
		
		c1.addAll(c2);
		System.out.println(c1);
		
		System.out.println(c1.retainAll(c2));
		System.out.println(c1);
		
		c1.removeAll(c2);
		System.out.println(c1);
		
		System.out.println("is empty : " + c1.isEmpty());
		c1.clear();
		System.out.println(c1);
		
		System.out.println(c2);
		
		
	}

}
