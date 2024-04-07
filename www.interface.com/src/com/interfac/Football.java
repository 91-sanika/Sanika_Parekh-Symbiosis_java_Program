package com.interfac;

public class Football implements Coach {

	public String getName() {
		return "Sanika";
	}
	
	public String getworkout() {
		return "30 pushups";
	}

	@Override
	public String getP() {
		return "batting";
	}

	@Override
	public String getSalary() {
		// TODO Auto-generated method stub
		return "30000";
	}

	@Override
	public String  getSalarygrowth() {
		// TODO Auto-generated method stub
		return "5000";
	}
}
