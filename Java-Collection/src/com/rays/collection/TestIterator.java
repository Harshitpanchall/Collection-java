package com.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {
	public static void main(String[] args) {
		
		List l = new ArrayList();

		l.add(0, 23);
		l.add(1, 24);
		l.add(2, "tam");
		l.add(3, "shyam");
		l.add(4, 23.44);
		
		System.out.println(l);
		
		System.out.println(".................... iterator..................");
		
		Iterator it = l.iterator();
		
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
			it.remove();
			
			
		}
		
		System.out.println(l);

	}
}