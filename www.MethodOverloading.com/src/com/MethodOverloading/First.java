package com.MethodOverloading;

public class First {
	
	public void m1() {
		System.out.println(" no parametetrs");
	}

	public void m1(int a) {
		System.out.println("parameters with int");
	}
	
	public void m1(String a) {
		System.out.println("parameters with string");
		
	}
	
	
	public static void main(String[] args) {
		
		First f = new First();
		f.m1(10);
		f.m1("kbp");
		f.m1();

	}

}

//compile time polymorphism
// this is method overloading - same method or function name but different parameters
//there is no inheritance
