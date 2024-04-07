package com.LibraryBooks;

import java.util.Scanner;

public class Operation {

	 static Book b = new Book();
	public static void setData() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student name");
		String s = sc.next();
		b.setStudent_name(s);
		
		System.out.println("Enter SID");
		int d = sc.nextInt();
		b.setSID(d);
		
		System.out.println("Enter BookID");
		int c = sc.nextInt();
		b.setBookID(c);
		
		System.out.println("Enetr Book Name");
		String t = sc.next();
		b.setBook_name(t);
		}
	
	public static void getData() {
		System.out.println("Student Name: "+ b.getStudent_name());
		System.out.println("Student Id: "+b.getSID());
		System.out.println("BookID:"+b.getBookID());
		System.out.println("Book Name: "+b.getBook_name());
	}
}
