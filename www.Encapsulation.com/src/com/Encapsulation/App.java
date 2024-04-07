package com.Encapsulation;

public class App {

	private int Pid;
	private String Pname;
	private double Pprice;
	private double Gst;
	public App(int pid, String pname, double pprice, double gst, int stock) {
		super();
		Pid = pid;
		Pname = pname;
		Pprice = pprice;
		Gst = gst;
		Stock = stock;
	}

	private int Stock;

public int getStock() {
		return Stock;
	}

	public void setStock(int stock) {
		Stock = stock;
	}

public void setPid(int Pid) {
	this.Pid = Pid;
}

public int getPid() {
	return Pid;
}

public App() {
	super();
	// TODO Auto-generated constructor stub
}

public String getPname() {
	return Pname;
}

public void setPname(String pname) {
	Pname = pname;
}

public double getPprice() {
	return Pprice;
}

public void setPprice(double pprice) {
	Pprice = pprice;
}

public double getGst() {
	return Gst;
}

public void setGst(double gst) {
	Gst = gst;
}
}