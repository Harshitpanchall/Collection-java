package com.in.rays.collection.sorting;

import java.util.LinkedList;

public class TestStudent {
	
	public static void main(String[] args) {
		
		Student s1 = new Student("harshit Panchal", 23, 23000.00);
		Student s2 = new Student("amit Tiwari", 33, 13000.00);
		Student s3 = new Student("ammita Pandey", 43, 93000.00);
		Student s4 = new Student("harshit mishra", 13, 43000.00);
		Student s5 = new Student("harsh shukla", 20, 83000.00);
		Student s6 = new Student("rohit Pandey", 14, 34000.00);
		
		LinkedList list = new LinkedList();
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		System.out.println(list);
		
		list.forEach(System.out::println);
		
	}

}
