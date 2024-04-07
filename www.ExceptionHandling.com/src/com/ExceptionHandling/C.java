package com.ExceptionHandling;

public class C {

	public static void main(String[] args) {
		try {
		String s = "Sanika";
		int b = Integer.parseInt(s);
		System.out.println(s);
		}catch(Exception e) {
			System.out.println("Cant convert String into Integer");
		}
	}

}
