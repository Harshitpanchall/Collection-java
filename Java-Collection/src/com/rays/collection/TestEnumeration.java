package com.rays.collection;

import java.util.Enumeration;
import java.util.Vector;

public class TestEnumeration {
	
	public static void main(String[] args) {
		
	Vector v = new Vector();
	
	v.add(23);
	v.add(23.3);
	v.add("ram");
	v.add("ramm");
	v.add(26);
	
	System.out.println("vector : " + v);
	
	//// while enumeration ka use vector me kar sakte ha 
	
	///// same method rathi hai itertor jasi hoti hai
	
	Enumeration e = v.elements();
	
	while(e.hasMoreElements()) { //// enumeration me remove nhi kar sakte ha kya
		
		Object o = e.nextElement();
		System.out.println(o);
	}
	
	System.out.println(v);
	
	
		
	}
}
