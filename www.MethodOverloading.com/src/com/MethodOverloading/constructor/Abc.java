package com.MethodOverloading.constructor;

public class Abc {
	
	Abc()	{
		System.out.println("no parameters");
	}
	
	Abc(int a , int b){
       System.out.println("parameters with int");   
	}
	
	Abc(String a){
		System.out.println("kbp");
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		Abc c = new Abc(10,20);
		Abc c1 = new Abc("kbp");
		Abc c2 = new Abc();
	}

}

//constructor can overload