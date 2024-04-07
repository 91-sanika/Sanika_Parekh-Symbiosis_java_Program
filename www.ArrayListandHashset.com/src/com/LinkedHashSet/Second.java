package com.LinkedHashSet;

import java.util.LinkedHashSet;

public class Second {

	public static void main(String[] args) {
	
		LinkedHashSet <String>set = new LinkedHashSet<String>();
		set.add("KBP");
		set.add("Sanika");
		set.add("Pune");
		set.add("Mumbai");
		set.add("Sanika");
		set.add(null);
		set.add(null);
		System.out.println(set);
		System.out.println(set.add("Parekh"));
		
		
		

}
}