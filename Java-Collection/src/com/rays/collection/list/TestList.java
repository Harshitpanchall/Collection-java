package com.rays.collection.list;

import java.util.ArrayList;
import java.util.List;

public class TestList {
	public static void main(String[] args) {
	
		List l = new ArrayList();
		
		l.add(0, 23);
		l.add(1, "ram");
		l.add(2, 12);
		l.add(3, "ram");
		l.add(4, 23.3);
		l.add(5, "ram");
		l.add(6, true);
		
		System.out.println(l);
		System.out.println(l.size());
		
		System.out.println(l.get(0));
		System.out.println(l.set(1, "shyam"));
		System.out.println(l);
		System.out.println(l.contains("ram"));
		System.out.println(l);
		
		System.out.println(l.subList(1, 7));
		System.out.println(l.indexOf("ram"));
		System.out.println(l.lastIndexOf("ram"));
		System.out.println(l.removeAll(l));
		System.out.println(l);
		
		
	}
}