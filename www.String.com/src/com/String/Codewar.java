package com.String;

public class Codewar {

	public static void main(String[] args) {
	
		System.out.println(strCount("Hello", 'o')); // returns 1
        System.out.println(strCount("Hello", 'l')); // returns 2
        System.out.println(strCount("", 'z'));      // returns 0
    }
    
    public static int strCount(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        return count;
  
    }
}
