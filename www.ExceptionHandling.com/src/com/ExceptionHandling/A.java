package com.ExceptionHandling;

public class A {

	public static void main(String[] args) {
		try {
		int a =10;
		int b =0;
		int c=a/b;
		System.out.println(c);
		}catch(Exception e) {
			System.out.println("cant divide by zero");
		}
	}

}
