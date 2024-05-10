package com.symbiosis.SpringbootApp.EmployeeInfo.a;

public class Employee {

	private int Empid;
	
	private String EmpName;
	
	private String EmpDept;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empid, String empName, String empDept) {
		super();
		Empid = empid;
		EmpName = empName;
		EmpDept = empDept;
	}

	public int getEmpid() {
		return Empid;
	}

	public void setEmpid(int empid) {
		Empid = empid;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public String getEmpDept() {
		return EmpDept;
	}

	public void setEmpDept(String empDept) {
		EmpDept = empDept;
	}

	@Override
	public String toString() {
		return "Employee [Empid=" + Empid + ", EmpName=" + EmpName + ", EmpDept=" + EmpDept + "]";
	}
}
