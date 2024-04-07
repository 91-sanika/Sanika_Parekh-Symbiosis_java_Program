package com.TreeSet;

import java.util.ArrayList;
import java.util.TreeSet;

public class A {

	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList<Integer>();
		list.add(100);
		list.add(298);
		list.add(367);
		System.out.println(list);
		
		TreeSet<Integer>t = new TreeSet<Integer>(list);
		t.add(98);
		t.add(56);
		t.add(34);
		t.add(78);
		//t.add(null);
		System.out.println(t);
		
		TreeSet<String>set=new TreeSet<String>();
		set.add("pqr");
		set.add("wxy");
		set.add("abc");
		set.add("rst");
		//set.add(null);
		System.out.println(set);
	}

}
