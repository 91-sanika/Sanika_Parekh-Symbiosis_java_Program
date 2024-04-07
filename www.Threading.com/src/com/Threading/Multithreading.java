package com.Threading;

public class Multithreading extends Thread {

	public static void main(String[] args) throws InterruptedException {
		
		Multithreading m = new Multithreading();
		m .m1();
		m.start();
		
		for(int j=0;j<=10;j++) {
			System.out.println("j:"+j);
			Thread.sleep(1000);
		}
		
	}

	public void m1() {
		for(int i=0;i<=10;i++) {
			System.out.println("i:"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Interupted");
			}
		}
	}
}
