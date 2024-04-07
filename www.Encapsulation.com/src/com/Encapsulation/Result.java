package com.Encapsulation;

import java.util.Scanner;

public class Result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("press 1 for setdata\n press 2 for getData \n press 3 for updatedata");
			int ch = sc.nextInt();
			switch(ch) {
			case 1:
				Operations.setData();
	
				break;
				
			case 2:
				Operations.getData();
				
				break;
				
			case 3:
				Operations.UpdateData();
				break;
			}
		}
		
	}

}
