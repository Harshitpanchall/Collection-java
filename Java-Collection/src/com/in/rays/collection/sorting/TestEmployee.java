package com.in.rays.collection.sorting;

import java.util.ArrayList;
import java.util.List;

public class TestEmployee {
	public static void main(String[] args) {
		
		Employee e1 = new Employee("harshit", 23, 100000);
		Employee e2 = new Employee("utkarsh", 34, 2000);
		Employee e3 = new Employee("amit", 22, 2300);
		Employee e4 = new Employee("lokash", 12, 100);
		Employee e5 = new Employee("harshit", 34, 20100);
		Employee e6 = new Employee("harshit", 55, 20000000);
		
		List<Employee> l = new ArrayList<Employee>();
		
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		l.add(e5);
		l.add(e6);
		
		l.forEach(System.out::println);
		
	}

}
