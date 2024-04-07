package com.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		LinkedHashMap<String,Integer>map = new LinkedHashMap();
		map.put("CNG", 84);
		map.put("Petrol", 107);
		map.put("Disel",95);
		System.out.println(map);
		
		
		TreeMap<String , Integer>map1 = new TreeMap();
		map1.put("Sanika", 1);
		map1.put("Parekh", 2);
		map1.put("mrunali", null);
		System.out.println(map1);
	}

}
