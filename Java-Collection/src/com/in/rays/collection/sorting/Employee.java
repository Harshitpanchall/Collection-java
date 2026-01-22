package com.in.rays.collection.sorting;

public class Employee {
	
	private String name;
	private int id;
	private double balance;
	
	public Employee(String name, int id, double balance) {
		this.name = name;
		this.id = id;
		this.balance = balance;
		
	}
	
	public String toString() {
		return "name:" + name + "id :" + id + "balance :" + balance;
		
	}
	

}
