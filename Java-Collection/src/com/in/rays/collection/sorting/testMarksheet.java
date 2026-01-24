package com.in.rays.collection.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class testMarksheet {
	public static void main(String[] args) {

		Marksheet m1 = new Marksheet("harshit", "105", 67);
		Marksheet m2 = new Marksheet("utkarsh", "104", 34);
		Marksheet m3 = new Marksheet("rohit", "102", 56);
		Marksheet m4 = new Marksheet("harsh", "103", 44);
		Marksheet m5 = new Marksheet("anup", "101", 55);

		ArrayList l = new ArrayList();

		l.add(m1);
		l.add(m2);
		l.add(m3);
		l.add(m4);
		l.add(m5);

		l.forEach(System.out::println);

		Collections.sort(l);

		System.out.println("---------");

		l.forEach(System.out::println);
	}

}
