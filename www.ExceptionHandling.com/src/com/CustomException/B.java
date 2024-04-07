package com.CustomException;

public class B {

	public static void main(String[] args) {
	try {
		throw new Parekh();
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("handled");
	}
	}

}
