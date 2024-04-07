package com.Boxingunboxing;

public class A {
 public static void main(String[] args) {
	//boxing -- primitive to object 
	 int a = 10;
	 Integer b = Integer.valueOf(a);
	 System.out.println(a);
	 
	 //unboxing - object to primitive
	 Integer d  = 20;
	 int r = d.intValue();
	 System.out.println(r);
	 
	 byte ab = 3;
	 String jk = Byte.toString(ab);
	 System.out.println(ab);
	 //tostring is static method and parameterized 
	 //when we want to covert into string - tostring function is used 
	 
	 String gh ="100";
	 int k1 = Integer.parseInt(gh);
	 System.out.println(gh);
	 //parseInt is static method and parameterized 
	 //When we want to put from string (int to string) - parseInt is used
	 
	 Integer mn =250;
	 String kp =mn.toString();
	 System.out.println(mn);
	 //primitive to string
	 
	 String mo = "10";
	 Integer po = Integer.parseInt(mo);
	 System.out.println(mo);
	 //string to primitive
}
}
