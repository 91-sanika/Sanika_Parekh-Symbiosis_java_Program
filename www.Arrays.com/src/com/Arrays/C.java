package com.Arrays;

import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		
		System.out.println("Enter size of an array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter Elements of array");
		for(int i=0;i<=size;i++) {
			 arr[i]=sc.nextInt();
		}
		System.out.println("Elements of array");
		
		for(int i=0;i<=size;i++) {
			System.out.println(arr[i]);
		}	
	}
}