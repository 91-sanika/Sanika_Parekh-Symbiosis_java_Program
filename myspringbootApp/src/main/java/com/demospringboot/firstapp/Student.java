package com.demospringboot.firstapp;

public class Student {

	private int id;
	
	private String Name;
	
	private String City;

	public Student() {
		super();
	}

	public Student(int id, String name, String city) {
		super();
		this.id = id;
		Name = name;
		City = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}
	
	
}
