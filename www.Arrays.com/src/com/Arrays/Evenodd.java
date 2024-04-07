package com.Arrays;

import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		int count=0;
		int arr[]= new int[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Elements of array");
		for(int i=0;i<3;i++) {
			 arr[i]=sc.nextInt();
		}
		System.out.println("Elements of array");
		
		for(int i=0;i<3;i++) {
			System.out.println(arr[i]);
			if(arr[i]%2==0) {
			count++;
			 }
		}
		
		System.out.println("count of even no in array = "+count);
	}

}
