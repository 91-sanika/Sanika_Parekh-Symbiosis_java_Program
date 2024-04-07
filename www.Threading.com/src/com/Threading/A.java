package com.Threading;

public class A {

	
	//single threading 
	public static void main(String[] args) {
		
		A ab = new A();
		ab.m1();
			for(int j=0;j<=10;j++) {
				System.out.println("j:"+j);
			}
		}
		
		
		public void m1() {
			for(int i=0;i<=10;i++) {
				System.out.println("i:"+i);
			}
		}
	}