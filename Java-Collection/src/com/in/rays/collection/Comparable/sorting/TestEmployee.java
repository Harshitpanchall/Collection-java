package com.in.rays.collection.Comparable.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class TestEmployee {
	public static void main(String[] args) {
		
		Employee e1 = new Employee("hatshit",23,230000);
		Employee e2 = new Employee("amit",12,230);
		Employee e3 = new Employee("rohit",24,130000);
		Employee e4 = new Employee("utkarsh",25,330000);
		Employee e5 = new Employee("aman",55,630000);
		Employee e6= new Employee("apppu",19,20000);
		
		ArrayList l = new ArrayList();
		
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		l.add(e5);
		l.add(e6);
		
		l.forEach(System.out::println);
		
		System.out.println("......................................");
		
		
		Collections.sort(l);
		
		l.forEach(System.out::println);
		
	}

}
