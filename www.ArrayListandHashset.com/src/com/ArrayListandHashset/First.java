package com.ArrayListandHashset;

import java.util.ArrayList;
import java.util.HashSet;

public class First {

	public static void main(String[] args) {
	
	ArrayList<Integer> list= new ArrayList<Integer>();
	list.add(1);
	list.add(2);
	list.add(3);
	System.out.println(list);
	
	HashSet<Integer>set = new HashSet<Integer>();
	//System.out.println(set);
	set.add(10);
	set.add(20);
	set.add(30);
	set.add(40);
	set.add(10);
	set.add(20);
	set.add(null);
	set.add(null);
	set.addAll(list);
	
	Object ab[]= set.toArray();
	for(Object abc:ab) {
		System.out.println(abc);
	}
	
	System.out.println(set);
	
	System.out.println(set.isEmpty());
	
	System.out.println(set.size());
	
	System.out.println(set.contains(20));

	
	set.retainAll(set);
	System.out.println(set);
	
    set.remove(10);
	System.out.println(set);
	
	set.removeAll(list);
	System.out.println(set);
	
    set.clear();
    System.out.println("after:"+set);

  }

}
