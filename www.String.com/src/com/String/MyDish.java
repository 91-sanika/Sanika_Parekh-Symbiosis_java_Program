package com.String;

public class MyDish {

	public static void main(String[] args) {
	        System.out.println(feast("great blue heron", "garlic naan")); // true
	        System.out.println(feast("chickadee", "chocolate cake")); // true
	        System.out.println(feast("elephant", "apple pie")); // false
	    }

	    public static boolean feast(String beast, String dish) {
	        // Extract first and last letters from beast and dish
	        char firstBeastLetter = beast.charAt(0);
	        char lastBeastLetter = beast.charAt(beast.length() - 1);
	        char firstDishLetter = dish.charAt(0);
	        char lastDishLetter = dish.charAt(dish.length() - 1);

	        // Check if first and last letters match
	        return firstBeastLetter == firstDishLetter && lastBeastLetter == lastDishLetter;
	    }
	}
