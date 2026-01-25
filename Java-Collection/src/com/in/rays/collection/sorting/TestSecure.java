package com.in.rays.collection.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class TestSecure {
	public static void main(String[] args) {
		
		Secure s1 = new Secure("harshit", 20000);
		Secure s2 = new Secure("rohit", 22000);
		Secure s3 = new Secure("shram", 23000);
		
		ArrayList l = new ArrayList();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		
		l.forEach(System.out::println);
		
		Collections.sort(l);
		
		
		
	}

}
