package com.Arrays;

public class B {

	public static void main(String[] args) {
	
		int a[]= {10,20,30}; // it cannot add any additional information
		int b[]= new int[4];
		b[0]=60;
		b[1]=70;
		b[2]=80;
		b[3]=90;
		
		for(Object arr: b) {
			System.out.println(arr);
		}
		
		

	}

}
