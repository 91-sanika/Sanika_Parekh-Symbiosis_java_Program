package com.Encapsulation;

import java.util.Scanner;

import com.Encapsulation.*;

public class OperationCustomer {

	static Scanner sc = new Scanner(System.in);
	static Customer c = new Customer();
	
	public void setData(){
		System.out.println("Enter Customer ID");
		int CId = sc.nextInt();
		c.setCId(CId);
		
		System.out.println("Enter Customer Name");
		String Cname = sc.next();
		c.setCName(Cname);
		
		System.out.println("Enter Quantity");
		int s = sc.nextInt();
		c.setQuantity(s);
		
		System.out.println("Enter pricebycustomer");
		double p = sc.nextDouble();
		c.setPricebyCustomer(p);
		
		App app = c.getAp();
		int stock =app.getStock();
		System.out.println(c.getCId());
		System.out.println(c.getCName());
		System.out.println(OperationCustomer.getStockstatus(s, stock));
	}
	
	public static String getStockstatus(int quantity , int stock) {
		String a="";
		if(stock < quantity) {
			a="Need to add"+(quantity - stock)+"items";}
			else if (stock >= quantity) {
			a="Sucessfully purchased"+quantity+"product";
		}
		return a;
	}
	
	public static double giveChange(double PricebyCustomer, double totalamount) {
		return 0;
	}
	
	public static double getTotalAmount(double quantity , double pricewithGst ) {
		return 0;
	}
	
	public static App setOptocustomer(App ap) {
		c.setAp(ap);
		return ap;
	}
}
