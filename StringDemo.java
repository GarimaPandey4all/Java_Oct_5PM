package com.tcs.java.string;

public class StringDemo {
	
	public static void main(String[] args) {
		
		String name = "Ram"; // 1 or 0
		String name2 = "Ram";
		//String name3 = new String("Ram").intern(); // 1 or 2
		String name3 = new String("Ram");
		String name4 = new String("Ram");
		
		System.out.println(name == name2);
		System.out.println(name == name3);
		System.out.println(name3 == name4);
		
		String t = "Hello";
		String y = t;
		System.out.println(y == t);
		t = t + "How are you";
//		Immutable - String doesn't change existing or original objects, it can create new memory or objects 
//		all the time.
		System.out.println(y == t);		
		
	}

}
