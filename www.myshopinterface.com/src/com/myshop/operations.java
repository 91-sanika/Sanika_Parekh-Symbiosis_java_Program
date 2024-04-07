package com.myshop;

import java.util.Scanner;

public class operations {

	public static void getMobiles() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 for iphone \n press 2 for Samsung");
		System.out.println("Enter your choice:");
		int ch = sc.nextInt();
		switch(ch){
		
		case 1:
			Iphone p = new Iphone();
			System.out.println(p.getproduct());
			System.out.println(p.getName());
			System.out.println(p.grtPrice());
			System.out.println(p.getCategory());
			break;
			
		case 2:
			Samsung s = new Samsung();
			System.out.println(s.getproduct());
			System.out.println(s.getName());
			System.out.println(s.grtPrice());
			System.out.println(s.getCategory());
		break;
	}
	}
		
		public static void getTv() {
		Scanner sc = new Scanner(System.in);
		System.out.println("press 1 for Pasanoic \n press 2 for Sony");
		int ch = sc.nextInt();
		switch(ch) {
		
		case 1:
			Pasanoic p = new Pasanoic();
			System.out.println(p.getproduct());
			System.out.println(p.getName());
			System.out.println(p.grtPrice());
			System.out.println(p.getCategory());
			break;
			
		case 2 :
			Sony s1 = new Sony();
			System.out.println(s1.getproduct());
			System.out.println(s1.getName());
			System.out.println(s1.grtPrice());
			System.out.println(s1.getCategory());
		break;
		}
		}


public static void getAc() {
	Scanner sc = new Scanner(System.in);
	System.out.println("press 1 for Philips \n press 2 for LG");
	int ch = sc.nextInt();
	switch(ch) {
	
	case 1:
		Philips p1 = new Philips();
		System.out.println(p1.getproduct());
		System.out.println(p1.getName());
		System.out.println(p1.grtPrice());
		System.out.println(p1.getCategory());
		break;
		
	case 2 :
		LG l = new LG();
		System.out.println(l.getproduct());
		System.out.println(l.getName());
		System.out.println(l.grtPrice());
		System.out.println(l.getCategory());
		break;
	}
	}
}