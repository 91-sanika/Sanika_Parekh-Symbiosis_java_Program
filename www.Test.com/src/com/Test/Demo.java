package com.Test;

public class Demo {
	
	public static void getdata(){
		System.out.println("I am static method");
	}
	
	public void putData() {
		System.out.println("I am non-static method");
	}

	public static void main(String[] args) {
		
		Demo.getdata();
		Demo d= new Demo();
		d.putData();
		}

}
