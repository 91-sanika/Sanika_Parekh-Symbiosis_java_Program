package com.Stack;

import java.util.Stack;

public class First {

	public static void main(String[] args) {
		
		Stack stack = new Stack();
		System.out.println("Before capacity"+stack.capacity());
		stack.push(100);
		stack.push(200);
		stack.push(300);
		stack.push(400);
		for(int i=1;i<7;i++) {
			stack.push(i);
		}
		for(int i=8;i<18;i++) {
			stack.push(i);
		}
		System.out.println(stack);
		stack.push(78);// here we have add one more element in stack so the capacity get doubled
		System.out.println(stack);
		System.out.println("After capacity"+stack.capacity());
		System.out.println(stack.empty());
		System.out.println(stack.peek());
		System.out.println(stack.elementAt(5));
		System.out.println(stack.search(3));
		}

	}

