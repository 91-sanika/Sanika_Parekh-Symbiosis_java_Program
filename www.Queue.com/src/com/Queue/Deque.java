package com.Queue;

import java.util.ArrayDeque;

public class Deque {

	public static void main(String[] args) {
		
		ArrayDeque <Integer>adq = new ArrayDeque<Integer>();
		adq.add(100);
		adq.add(200);
		adq.add(300);
		adq.add(100);
    //	adq.add(null);
		System.out.println(adq);
       	adq.addFirst(10);
       	System.out.println(adq);
       	adq.addLast(20);
       	System.out.println(adq);
       	adq.removeFirst();
       	System.out.println(adq);
       	adq.removeLast();
       	System.out.println(adq);
       	

	}

}
