package com.Arrays;

import java.util.Scanner;

public class Multipleno {

	public static void main(String[] args) {
		
		int arr[]=new int[4];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Elements of array");
		for(int i=0;i<=3;i++) {
			 arr[i]=sc.nextInt();
		}
		System.out.println("Elements of array");
		
		for(int i=0;i<=3;i++) {
			if(arr[i]%4==0) {
				arr[i]=11;
			}
			System.out.println(arr[i]);
		}	
		}

}
