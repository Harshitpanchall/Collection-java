package com.rays.collection.list;

import java.util.Vector;

public class TestVector {
	
	public static void main(String[] args) {
		
		Vector v = new Vector();
		v.add(23);
		v.add("ram");
		v.add("sita");
		
		System.out.println(v.get(0));
		System.out.println(v.get(1));
		System.out.println(v.get(2));
	}

}
