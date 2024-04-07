package com.String;

public class MyString1 {

	public static void main(String[] args) {
	
		String a = "Mumbai";
		String b = "Mumbai";
		String c = new String("Mumbai");
		String d = " ";
		System.out.println(a.charAt(0));
		System.out.println(a==b); // checks memory location
		System.out.println(a==c);
		System.out.println(a.equals(b)); // checks checks content
		System.out.println(a.equals(c));
		System.out.println(a.endsWith("i"));
		System.out.println(d.isEmpty());
		System.out.println(d.isBlank());
		System.out.println(a.contains(b));
		System.out.println(a.compareTo(b));
		System.out.println(a.contentEquals(b));
		System.out.println(a.length());
        System.out.println(a.charAt(2));
	}

}
