package com.Encapsulation;

import java.time.LocalDateTime;

import com.Encapsulation.*;

import java.util.Scanner;

public class Operations {
	
	static Scanner sc = new Scanner(System.in);
	
	static App ap = new App();
	static Customer c = new Customer();
	
		public static void setData() {
			
		System.out.println("Enter Product id");
		int id = sc.nextInt();
         ap.setPid(id);
        
         System.out.println("Enter Product Name");
         String name = sc.next();
         ap.setPname(name);
         
         System.out.println("Enter Product price");
        // double price = sc.nextDouble();
        // a.setPprice(price);
         double price = sc.nextDouble();
         double priceWithGST = price * 1.18; 
         ap.setPprice(priceWithGST);
         System.out.println("Enter Stock");
         ap.setStock(sc.nextInt());
         System.out.println("****Product addes Sucessfully******");
         }
	
		
		
	    public static void getData() {
	    	 System.out.println("*****Product Info***");
	    	System.out.println("Product Id is"+ ap.getPid());
	    	System.out.println("Product Name is"+ ap.getPname());
	    	System.out.println("Product Price is"+ap.getPprice());
	    	 System.out.println("Thank you");
	    	}
	   
	    	
	   public static void UpdateData() {
		   System.out.println("press 1 for id \n press 2 for name \n press 3 for price"); 
		   
		   int ch = sc.nextInt();
		   switch(ch) {
		   case 1:
			   System.out.println("update data for id");
			   ap.setPid(sc.nextInt());
			   System.out.println("Id updated at:"+ LocalDateTime.now());
			   break;
			   
		   case 2:
			   System.out.println("Update data for name");
			   ap.setPname(sc.next());
			   System.out.println("name updated at:"+ LocalDateTime.now());
			   break;
			   
		   case 3:
			   System.out.println("Update data for price");
			   ap.setPprice(sc.nextDouble());
			   System.out.println("price updated at:"+ LocalDateTime.now());
			   break;
		   }
		   }
	    	
	    }

