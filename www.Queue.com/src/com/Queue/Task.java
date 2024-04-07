package com.Queue;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {

		int a[]=new int[5];
    Scanner sc = new Scanner(System.in);
  System.out.println("Enter elements");
    for(int i =0; i<5;i++) {
	a[i] =sc.nextInt();
 }
 System.out.println("Elements in the arrays are");
 for(int i=0;i<5;i++) {
	 System.out.println(a[i]);
 }
 int max = a[0];
	for(int i=0;i<5;i++) {
		if(a[i]>max) {
			max=a[i];
		}
	}
	System.out.println("Max=" +max);
	}
}
