package com.in.rays.collection.Comparable.sorting;

public class Marksheet implements Comparable<Marksheet>{
	
	String name;
	int phy;
	int maths;
	
	public Marksheet(String name, int phy, int maths) {
		
		this.maths = maths;
		this.phy = phy;
		this.name = name;
		
	}
	
	public String toString() {
		return "name : " + name + " " + "phy : " + phy + " " + "maths : " + maths;
		
	}

	@Override
	public int compareTo(Marksheet o) {
		return this.phy - o.phy;
	}

}
