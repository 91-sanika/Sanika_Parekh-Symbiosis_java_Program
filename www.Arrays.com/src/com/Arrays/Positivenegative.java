package com.Arrays;

import java.util.Scanner;

public class Positivenegative {

	public static void main(String[] args) {
		
		int arr[]=new int[4];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Elements of array");
		for(int i=0;i<=3;i++) {
			 arr[i]=sc.nextInt();
		}
		System.out.println("Elements of array");
		
		for(int i=0;i<=3;i++) {
			if(arr[i]<0) {
				arr[i]=-arr[i];
			}
			else if(arr[i]>0) {
				//arr[i] = Math.abs(arr[i]);
				arr[i]=-arr[i];
			}
			System.out.println(arr[i]);

		}
		
	}

}
