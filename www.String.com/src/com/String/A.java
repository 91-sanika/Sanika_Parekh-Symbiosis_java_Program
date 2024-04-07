package com.String;

public class A {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		sb.append("Mumbai");
		
		sb.append("-Pune");
		sb.append("-Satara");
		sb.append(10);//autoboxing - primitive to object converstion
		System.out.println(sb);
		System.out.println("capacity:"+sb.capacity());
		
		StringBuffer sb1 = new StringBuffer();
		sb1.append("Sangali");
		sb1.append("-Karad");
        sb1.append("Kolhapur");
		
		sb.append(sb1);
		System.out.println("capacity:"+sb.capacity()); // initial capacity +1*2 
		System.out.println(sb);
		
	
		
		
		
		
	}
}