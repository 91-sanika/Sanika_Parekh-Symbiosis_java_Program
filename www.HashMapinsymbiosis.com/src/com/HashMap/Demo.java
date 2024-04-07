package com.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Demo {

	public static void main(String[] args) {
		
		HashMap <String,Integer>map = new HashMap<String,Integer>();
		map.put("Orange", 100);
		map.put("Apple", 200);
		map.put("Banana", 300);
		map.put(null, 500);
		map.put("Cherry", null);
		map.put("Strawbeery", null);
		System.out.println(map);
		
		System.out.println(map.containsKey("Orange"));
		System.out.println(map.containsKey("Mango"));
		System.out.println(map.remove("Banana",300));
		System.out.println(map);

		
	 HashMap<Integer,String>map1 = new HashMap<Integer,String>();
	 map1.put(1,"Sanika");
	 map1.put(2,"Sayali");
	 map1.put(3,"pratiksha");
	 map1.put(4,"mrunali");
	 map1.put(5,"Sanika");
	 System.out.println(map1);
	 
	 for(Map.Entry<String, Integer> obj : map.entrySet()) {
		 System.out.println("Key :"+obj.getKey());
		 System.out.println("Value:"+obj.getValue());
	 }
	 
	}

}
