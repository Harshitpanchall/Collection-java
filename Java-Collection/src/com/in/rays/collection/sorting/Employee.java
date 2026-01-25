package com.in.rays.collection.sorting;

public class Employee {
	
	private String name;
	private int age;
	private double salary;
	
	public Employee(String name, int age, double salary) {
		this.name = name;
		this.salary = salary;
		this.age = age;
		
	}
	
	public String toString() {
		return "name : " + name + " " + "salary : " + salary + " " + "age : " + age;
		
	}

}
