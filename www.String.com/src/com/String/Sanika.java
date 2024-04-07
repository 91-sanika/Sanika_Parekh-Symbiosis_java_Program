package com.String;

public class Sanika {

	
	public static void main(String[] args) {
		String str="Sanika";
		String rev="";
		for(int i =0;i<str.length();i++) {
			rev = str.charAt(i)+ rev;
		}
		System.out.println("String Reverse is = " + rev);
	}

}
