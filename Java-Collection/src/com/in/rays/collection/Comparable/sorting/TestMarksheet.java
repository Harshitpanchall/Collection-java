package com.in.rays.collection.Comparable.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class TestMarksheet {
	public static void main(String[] args) {
		
		Marksheet m1 = new Marksheet("harshit", 34, 45);
		Marksheet m2 = new Marksheet("utkarsh", 44, 55);
		Marksheet m3 = new Marksheet("amit", 67, 56);
		Marksheet m4 = new Marksheet("rohit", 34, 57);
		
		ArrayList<Marksheet> a = new ArrayList<Marksheet>();
		
		a.add(m1);
		a.add(m2);
		a.add(m3);
		a.add(m4);
		
		Collections.sort(a);
		
		a.forEach(System.out::println);
	}

}
