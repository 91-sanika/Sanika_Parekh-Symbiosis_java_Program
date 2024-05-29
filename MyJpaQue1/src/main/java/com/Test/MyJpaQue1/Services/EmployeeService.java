package com.Test.MyJpaQue1.Services;

import java.util.List;
import java.util.Optional;

import com.Test.MyJpaQue1.Entity.Employee;


public interface EmployeeService {
	
	public Employee SaveData(Employee e);
	
	 public List<Employee> getAllEmployees();
	 
	 Optional<Employee> getEmployeeById(long id);
	 
	 Employee updateEmployee(Employee e);
	 
	 void deleteEmployee(long id);

}
