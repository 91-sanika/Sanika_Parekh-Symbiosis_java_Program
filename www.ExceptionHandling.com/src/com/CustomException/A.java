package com.CustomException;

public class A {

	public static void main(String[] args) {
		try {
			//line
			throw new Sanika();
			//bug code
		}catch(RuntimeException e) {
			System.out.println("handled");
		}

	}

}
