package com.constructor;

public class S {
	{
		System.out.println("Non static block");
	}
     
	//public S() {
//		System.out.println("Constructor");
	//}
	
   static{
		System.out.println("Static block");
	}
}
