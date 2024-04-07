package com.Encapsulation;

public class Employee {
	private int empId;
	private String name;
	private String salary;
	
	public void setempId(int empId) {
		this.empId = empId;
	}
	
	public int getempId() {
		return empId;
		
	}
	
	public void setname(String name) {
	    this.name = name;	
	}
	
	public String getname() {
		return name;
	}
	
	public void setsalary(String salary) {
		this.salary=salary;
	}
	
	public String getsalary() {
		return salary;
	}
	

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.setempId(10);
		e.setname("sanika");
		e.setsalary("35000");
		System.out.println(e.getempId());
		System.out.println(e.getname());
		System.out.println(e.getsalary());

	}

}
// this is to allow globally allow the variable
