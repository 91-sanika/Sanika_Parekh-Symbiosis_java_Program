package com.Queue;

import java.util.PriorityQueue;

public class Queue {

	public static void main(String[] args) {
		
		PriorityQueue<Integer>pq = new PriorityQueue<Integer>();
		pq.offer(100);
		pq.offer(200);
		pq.offer(300);
		//pq.offer(100);
		//pq.offer(200);
	    //pq.offer(null);
		System.out.println(pq);
		System.out.println(pq.peek()); // peek is used to fetch the head of the element 
		//pq.poll();       // poll is used to remove head/top of element
	//   pq.remove();       //remove is used to remove head/top of element
		//System.out.println(pq);

	}

}
