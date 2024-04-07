package com.Threading;

public class Ab extends Thread {

	public static void main(String[] args) {
		
		Ab a = new Ab();
		a.start();
		a.setPriority(MIN_PRIORITY);
		a.setName("obj");
		

		Ab b = new Ab();
		b.start();
		b.setPriority(MAX_PRIORITY);
		b.setName("obj1");
	}

	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
