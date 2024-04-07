package com.Threading;

public class DemoNames extends Thread {

	public static void main(String[] args) {
		
		DemoNames dn =new DemoNames();
        dn.start();
        Thread ct = Thread.currentThread();
       // ct.setName("main");
        System.out.println(ct.getName());
	}

	
	public void run() {
		Thread ct1 = Thread.currentThread();
	 //  ct1.setName("Run method Thread");
		System.out.println(ct1.getName());
	}
}
