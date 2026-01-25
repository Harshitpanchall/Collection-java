package com.in.rays.collection.Comparable.sorting;

public class Employee implements Comparable<Employee>{
	String name; //// comparable is attribute use in sorting 
	int age;
	double salary;
	
	public Employee(String name, int age, double salary) {
		
		this.name = name ;
		this.age = age;
		this.salary = salary;
		
	}
	
		public String toString() {
			return "name : " + name + " " + "age : " + age + " " + "salary : " + salary;
			
		}

		@Override
		public int compareTo(Employee o) {
			return this.age - o.age;
		}

}
