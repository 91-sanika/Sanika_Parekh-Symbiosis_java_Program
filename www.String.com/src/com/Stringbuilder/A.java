package com.Stringbuilder;

public class A {

	public static void main(String[] args) {
		
		StringBuilder st = new StringBuilder();
		st.append("Mumbai");
		st.append(false);
		st.append("-Pune");
		st.append("-Delhi");
		System.out.println(st);
		
		st.insert(7, true);
		System.out.println(st);
		
	}

}
