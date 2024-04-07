package com.operators;

public class Increment {

	public static void main(Operationsonstring[] args) {
		
		int a= 10;
		int b = a++;
		int c = a--;
		
		System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        int e = a--+b++;
        System.out.println(e);
        
        int g = 10;
        int h = ++g;
        System.out.println(g);
        System.out.println(h);
        
        int p = 10;
        int q = --p;
        System.out.println(p);
        System.out.println(q);
        
        
        // a++ = post increment 
        // a-- = post decrement 
	}

}
