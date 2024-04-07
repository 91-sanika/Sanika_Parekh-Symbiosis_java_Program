package com.yt;

public class A {

	public static void main(String[] args) {
		byte a = 10;
		int d = a;
		System.out.println(d);
		
		int r = 140;
		byte rt = (byte) r;// gives error because we can not convert large size into small size 
		System.out.println(rt);
		
		float p = 89.8f;
		double e = p;
		System.out.println(e);
		
		short u = 3276;
		System.out.println(u);
		
		float b = 10.4f;
		System.out.println(b);
		
		double t = 20.6;
		System.out.println(t);
		
		char m = 'a';
		System.out.println(m);
		
		boolean bz = false ;
		System.out.println(bz);
		

}
}

// implicit type casting = convert small to large size of variable
// explicit type casting = convert large to small size of variable
