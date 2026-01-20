package com.in.rays.Set;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
	
	public static void main(String[] args) { //// does not use in duplicate value
		///// or null value only one;
	
		Set s = new HashSet();
		
		s.add(null);
		s.add(null);
		s.add('a');
		s.add('a');
		s.add('b');
		s.add('c');
		s.add(23);
		s.add(23);
		
		
		System.out.println(s);///// 
		
	}

}
