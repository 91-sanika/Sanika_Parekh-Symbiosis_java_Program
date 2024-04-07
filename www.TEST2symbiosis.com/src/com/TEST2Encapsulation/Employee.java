package com.TEST2Encapsulation;

public class Employee {
	
	private String name;
	private int eid;
	private int  salary;
	private int age;
	private int experience;
	
	public Employee(String name, int eid, int salary, int age, int experience) {
		super();
		this.name = name;
		this.eid = eid;
		this.salary = salary;
		this.age = age;
		this.experience = experience;
	}

	public String getName() {
		return name;
	}

	public int getEid() {
		return eid;
	}

	public int getSalary() {
		return salary;
	}

	public int getAge() {
		return age;
	}

	public int getExperience() {
		return experience;
	}


	
	
	

}
