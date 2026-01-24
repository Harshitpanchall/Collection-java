package com.in.rays.collection.sorting;

public class Marksheet implements Comparable<Marksheet> {

	private String name;
	private String rollno;
	private int phy;

	public Marksheet(String name, String rollno, int phy) {
		this.name = name;
		this.rollno = rollno;
		this.phy = phy;

	}

	public String toString() {
		return "name: " + name + " rollno: " + rollno + " phy: " + phy;

	}

	@Override
	public int compareTo(Marksheet o) {
		// return o.rollno.compareTo(this.rollno);
		// return this.phy - o.phy;
		return o.name.compareTo(this.name);
	}

}
