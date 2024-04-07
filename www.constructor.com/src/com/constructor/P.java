package com.constructor;

public class P {

	public static void main(String[] args) {
		
		S obj = new S();
		S obj2 = new S();
	}

}

// in this scenario we can created different class in same package and then 
//1)we have created constructor 1st that is S
//2)we have static block
//3)we have non static block
//create object of that class in different class that is class p 
//and the sequence is static block then non static block then constructor