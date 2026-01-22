package com.in.rays.collection.sorting;

import java.util.ArrayList;
import java.util.Iterator;

public class TestEmployee {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee("harshit Panchal",1, 23000.00);
		Employee e2 = new Employee("Amit Tiwari",2, 24000.00);
		Employee e3 = new Employee("ammita pandey",3, 93000.00);
		Employee e4 = new Employee("rani",4, 13000.00);
		Employee e5 = new Employee("utkarsh Tiwari",5, 2000.00);
		Employee e6 = new Employee("anshul singh",6, 2110.00);
		
		ArrayList list = new ArrayList();
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		
		list.forEach(System.out::println);
		
		Iterator it = list.iterator();
//		list.add(e6);
		
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
		
		
	}

}
