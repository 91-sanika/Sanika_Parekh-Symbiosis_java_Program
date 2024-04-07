package com.MethodOverloading.staicmethod;

public class Demo {

	public static void m1() {
		System.out.println("no parameters");
	}
	
	public static void m1(int a) {
		System.out.println("Parameters with int");
	}
	
	public static void m1(String a) {
		System.out.println("Parameters with string");
	}
	
	public static void m1(float b) {
		System.out.println("parameters with float");
	}
	public static void main(String[] args) {
	 
		Demo.m1();
		Demo.m1(10);
		Demo.m1(3.2f);
		Demo.m1("KBP");

	}

}
// static method can overload