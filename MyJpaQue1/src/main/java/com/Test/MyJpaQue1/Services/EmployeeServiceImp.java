package com.Test.MyJpaQue1.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Test.MyJpaQue1.Entity.Employee;
import com.Test.MyJpaQue1.repo.EmployeeRepository;

@Service
public class EmployeeServiceImp implements EmployeeService{

	private EmployeeRepository employeeRepository;

	@Autowired
	public EmployeeServiceImp(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	  @Override
		public Employee SaveData(Employee e) {
			return employeeRepository.save(e);
		}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee updateEmployee(Employee e) {
		return employeeRepository.save(e);
	}

	@Override
	public Optional<Employee> getEmployeeById(long id) {
		return employeeRepository.findById(id);
	}

	@Override
	public void deleteEmployee(long id) {
		   employeeRepository.deleteById(id);
		
	}



	
 
	

	
	
	

}

