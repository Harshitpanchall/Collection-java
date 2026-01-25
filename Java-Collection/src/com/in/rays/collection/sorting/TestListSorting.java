package com.in.rays.collection.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class TestListSorting {
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add('a');
		list.add('b');
		list.add('c');
		list.add('d');
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.shuffle(list); // charater new on your console put
		System.out.println(list);
		
	}

}
