package com.rays.collection.list;

import java.util.ArrayList;
import java.util.List;

public class TestList {
	public static void main(String[] args) {
	
		List l = new ArrayList();
		
		l.add(0, 34);
		l.add(1, 23.3);
		l.add(2, "kita");
		l.add(3, 34);
		l.add(4, "hars");
		
		System.out.println(l);
		System.out.println(l.contains(34));
		
		System.out.println(l.add(34));  // add karna  
		
		System.out.println(l.get(1)); /// get matlab ckeck karna
		
		System.out.println(l.set(0, 35)); /// old value updaye karna;
		
		System.out.println(l.retainAll(l));/// duplicate value dena;
		
		System.out.println(l.subList(1, 4));/// 1 to 7 print karna
		
		System.out.println(l.removeAll(l));
		System.out.println(l);
		
		
	}
}