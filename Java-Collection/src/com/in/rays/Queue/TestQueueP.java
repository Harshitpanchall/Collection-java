package com.in.rays.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestQueueP {
	public static void main(String[] args) {
	
	Queue q = new PriorityQueue();
	
	q.add("ram");
	q.add(23);
	q.add(24);
	System.out.println(q);
	
//	try {
//		
//		q.add(3);
//		
//	}catch(RuntimeException e) {
//		System.out.println("HELO" + 2);
//		
//	}
	}	

}
