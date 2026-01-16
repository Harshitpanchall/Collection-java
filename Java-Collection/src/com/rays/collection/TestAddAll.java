package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestAddAll {

	public static void main(String[] args) {
		
		Collection c1 = new ArrayList();
		
		c1.add(23);
		c1.add(24);
		c1.add("ram");
		c1.add("ram");
		c1.add("object");
		c1.add(23.3);
		
		System.out.println("collection : " + c1);
		System.out.println("collectio : " + c1.size());
		
		System.out.println("....................................");
		
		Collection c2 = new ArrayList();
		
		c2.add(23);
		c2.add(24);
		c2.add(25);
		c2.add("ram");
		c2.add("ram");
		
		System.out.println("c2 collection + "+c1.size());
		
		c1.addAll(c2);
		System.out.println("collection is addAll are use : "+c1);
		
		System.out.println("collection contains : "+ c1.contains("ram"));
		System.out.println(c1);
		
		System.out.println(c2.remove("ram"));
		System.out.println(c2);
		
		System.out.println(c1.removeAll(c2));
		System.out.println(c1.isEmpty());
		c1.clear();
		System.out.println(c1);
		
		
		
	
	}

}
