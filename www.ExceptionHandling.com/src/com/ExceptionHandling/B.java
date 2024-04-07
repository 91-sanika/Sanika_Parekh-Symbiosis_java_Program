package com.ExceptionHandling;

public class B {

	public static void main(String[] args) {
		
		int b []= {10,20,30};
		System.out.println(b[0]);
		System.out.println(b[1]);
		try {
		System.out.println(b[3]);
		} 
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds");
	}
		catch(Exception e){
			System.out.println("data is not avilable");
		}
		finally {
			System.out.println("next code");
		}
	}
	}
