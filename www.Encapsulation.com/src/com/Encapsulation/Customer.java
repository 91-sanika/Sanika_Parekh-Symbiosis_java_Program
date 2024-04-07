package com.Encapsulation;

public class Customer {

	private int CId;
	private String CName;
	private int Quantity;
	private double PricebyCustomer;
	private App Ap;
	private double totalamount;
	
	
	public int getCId() {
		return CId;
	}


	public void setCId(int cId) {
		CId = cId;
	}


	public String getCName() {
		return CName;
	}


	public void setCName(String cName) {
		CName = cName;
	}


	public int getQuantity() {
		return Quantity;
	}


	public void setQuantity(int quantity) {
		Quantity = quantity;
	}


	public double getPricebyCustomer() {
		return PricebyCustomer;
	}


	public void setPricebyCustomer(double pricebyCustomer) {
		PricebyCustomer = pricebyCustomer;
	}


	public double getTotalamount() {
		return totalamount;
	}


	public void setTotalamount(double totalamount) {
		this.totalamount = totalamount;
	}


	public Customer(int cId, String cName, int Quantity, double pricebyCustomer) {
		super();
		this.CId = cId;
		this.CName = cName;
		this.Quantity = Quantity;
		this.PricebyCustomer = pricebyCustomer;
		this.totalamount = totalamount;
	}
	
	Customer(){
	}


	public App getAp() {
		return Ap;
	}


	public void setAp(App ap) {
		Ap = ap;
	}
}	
