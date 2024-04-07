package com.FilenotfoundException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class A {
	
	public void m1() throws RuntimeException,FileNotFoundException	{
		FileInputStream fs = new FileInputStream("D:\\my ppt or pdf");
		}	
	
	public void m2() throws FileNotFoundException {
		m1();
	}
	public void m3() {
		try {
			m2();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		public static void main(String[] args) {
			A ab = new A();
			ab.m3();
	}
}

