package com.LibraryBooks;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean b= true;
		while(b) {
		System.out.println("Press 1 for set data\nPress 2 for get data\nPress 3 for Exist");
		System.out.println("Enter your choice");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		
		switch(ch) {
		case 1:
			Operation.setData();
			break;
			
		case 2:
			Operation.getData();
			break;
			
		case 3:
			b=false;
			break;
		}

	}

}
}