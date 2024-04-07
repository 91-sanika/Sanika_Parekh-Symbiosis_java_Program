package com.TEST2Encapsulation;

import java.util.Collection;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		
		HashSet<Employee> hs = new HashSet<>();
					
		Employee emp1 = new Employee("Sanika", 1, 30000, 35, 4);
        Employee emp2 = new Employee("Mayuri", 2, 40000, 30, 5);
        Employee emp3 = new Employee("Pranita", 3, 50000, 38, 7);

       hs.add(emp1);
       hs.add(emp2);
       hs.add(emp3);
       
       hs.contains(emp3);
       System.out.println(hs);
       
       hs.remove(emp2);
       System.out.println("After removing");
       
       System.out.println("Employee Information:");
       displayEmployeeInformation(hs);
       
       
	}

	public static void displayEmployeeInformation(HashSet<Employee> hs) {
		for (Employee employee : hs) {
		System.out.println("Employee name = " + employee.getName() );
		System.out.println("Employee ID = "+ employee.getEid());
		System.out.println("Employee Salary ="+ employee.getSalary());
		System.out.println("Employee age ="+ employee.getAge());
		System.out.println("Employee Experience =" +employee.getExperience());
	}



}
}