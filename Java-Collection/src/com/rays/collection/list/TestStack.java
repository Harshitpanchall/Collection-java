package com.rays.collection.list;

import java.util.Stack;

public class TestStack {
	public static void main(String[] args) {
		
		Stack s = new Stack();
		
		s.add("ram");  /// list in first out
		s.add(23);
		s.add(24);
		
		System.out.println(s.peek());
		
		System.out.println(s.pop());
		
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}
		
		
	}

}
