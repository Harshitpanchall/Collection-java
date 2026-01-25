package com.in.rays.collection.sorting;

public class Secure implements Comparable<Secure> {
	private String name;  /////attribute
	private int withdraw;
	
	public Secure(String name, int withdraw) {
		this.name = name;
		this.withdraw = withdraw;
		
	}
	
	public String toString() {
		return "name : " + name + " " + " withdraw : " + withdraw;
		
		
	}

	@Override
	public int compareTo(Secure o) {
//		return o.name.compareTo(this.name);
		return this.withdraw - o.withdraw;
	}
	
	

}
