package com.Threading;

public class Demo implements Runnable {

	@Override
	public void run() {
		System.out.println("Check");
		
	}

	public static void main(String[] args) {
		
		Demo d = new Demo();
		Thread th = new Thread(d);
		th.start();
	}

}
