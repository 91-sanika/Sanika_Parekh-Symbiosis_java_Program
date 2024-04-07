package com.Threading;

public class Deom1 extends Thread{

public void run() {
	try {
	for(int i =0;i<=10;i++) {
		System.out.println("Hello");
			Thread.sleep(1000);
	}
	} catch (InterruptedException e) {
		
		System.out.println("Inturpt handled");
	}

	
	}

}

// reamaining part of this program is in test class