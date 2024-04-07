package com.String;

public class Consonentcount {

	
	 public String getcountofconsonent(String str2) {
		  int count = 0;
		  int num =0;
	      for (int i = 0; i < str2.length(); i++) {
	    	  char ch = str2.charAt(i);
	          if (str2.charAt(i)=='a' ||  str2.charAt(i)=='e' || str2.charAt(i)=='i'||
	        	  str2.charAt(i)=='o' || str2.charAt(i)=='u') 
	          {
	        	count++;
	        	   }
	          else if(ch !=' ') {
	        	  num++;  
	          }
	 }
		return "\nConsonent:" + num + "\nVowels:" +count;
	 }
	 
	 
public static void main(String[] args) {
	Consonentcount c= new Consonentcount();
	System.out.println("Consonent count and vowels count is = "+c.getcountofconsonent("Parekh"));
	

	}
}
