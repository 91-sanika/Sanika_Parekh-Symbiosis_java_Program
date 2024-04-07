package com.Threading;

import java.util.Scanner;

public class Multithreading1 extends Thread {

	
	static int sum;
	static int n;

	public static void main(String[] args) throws InterruptedException {
		
		 Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
      	Multithreading1.n = sc.nextInt();
      	Multithreading1 m = new Multithreading1();
      	m.start();
      	m.join();
		 System.out.println(sum);
	}
	
	public void run() {
	for(int i=1;i<Multithreading1.n;i++) {
		Multithreading1.sum = Multithreading1.sum+i;
	}
	}

}
