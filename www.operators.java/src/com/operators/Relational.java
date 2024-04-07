package com.operators;

public class Relational {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 10;
		
		boolean f = a>b;
		System.out.println(f);
		
		//bitwise and or
		
		System.out.println(true&true);
		System.out.println(true&false); 
		System.out.println(false&false);
		
		System.out.println(true | false);
		System.out.println(true | false); 
		System.out.println(false | false);
		
		//short circuit 
		System.out.println(true&&false); 
		System.out.println(false&&false);
		
		String d = (a>b)? "a is greater" : "b is greater";
		System.out.println(d);
		
		
	}

}
