package com.Test;

public class Calculator {

	public void addition1(int a, int b) {
		System.out.println("addition of two elelments");
		System.out.println(a+b);
	}
	
	public void addition2(int c, int d) {
		System.out.println("addition of two elelments");
		System.out.println(c+d);
	}
	
	public void substraction(int e,int f) {
		System.out.println("substraction of two elelments");
		System.out.println(e-f);
	}
	
	public void Multiplication(int g,int h) {
		System.out.println("Multiplication of two elelments");
		System.out.println(g*h);
	}
	
	public void Division(int i , int j) {
		System.out.println("Division of two elelments");
		System.out.println(i/j);
	}
	
	
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.addition1(10, 11);
		c.addition2(89, 98);
		c.substraction(10,5);
		c.Multiplication(56, 45);
		c.Division(45, 5);
		}
	

}
