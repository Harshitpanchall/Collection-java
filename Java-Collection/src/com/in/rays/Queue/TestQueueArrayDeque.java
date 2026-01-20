package com.in.rays.Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class TestQueueArrayDeque {
	
public static void main(String[] args) {
	
	Queue q = new ArrayDeque();
	
	q.add("ram");
	q.add("sita");
	q.add(23);
	q.add(245);
//	
//	System.out.println(q);
//	System.out.println("first element :" + q.peek());
//	
//	System.out.println(q.poll());
//	System.out.println(q);
	
	while(!q.isEmpty()) {
		System.out.println(q.poll());
	}
	System.out.println(q);
	
}

}
