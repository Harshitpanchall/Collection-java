package com.in.rays.collection.sorting;

public class Student {
	
	private String name;
	private int roll;
	private double balance;
	
	public Student(String name, int roll, double balance) {
		this.name = name;
		this.balance = balance;
		this.roll = roll;
		
	}
	
	public String toString() {
		return "name :" + name + "roll : " + roll + "balance :" +  balance;
		
	}

}
