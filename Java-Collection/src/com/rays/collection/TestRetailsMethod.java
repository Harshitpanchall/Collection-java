package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestRetailsMethod {
	public static void main(String[] args) {
		
		Collection c1 = new ArrayList();
		
		c1.add(23);
		c1.add("ram");
		c1.add(true);
		
		System.out.println(c1);
		System.out.println(c1.size());
		
		Collection c2 = new ArrayList();
		
		c2.add(24);
		c2.add("sao");
		c2.add(false);
		
		System.out.println(c2);
		System.out.println("c2 size : " + c2.size());
		
		c1.addAll(c2);
		System.out.println(c1);
		
		System.out.println(c1.retainAll(c2));
		System.out.println(c1);
	}

}
