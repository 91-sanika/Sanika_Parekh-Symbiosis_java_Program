package com.symbiosis.SpringbootApp.EmployeeInfo.a;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.symbiosis.SpringbootApp.EmployeeInfo.b.CustomException;

import jakarta.annotation.PostConstruct;

public class EmployeeController2 {

public List<Employee> emp = new ArrayList<>();
	
	@PostConstruct // new value add 
	public void setAllEmployee() {
		emp.add(new Employee(8,"Sanika","HR"));
		emp.add(new Employee(9,"Kavita","Sales"));
		emp.add(new Employee(10,"Rucha","Marketing"));
	}
	
	@GetMapping("/get")
	public List <Employee> getEmployee(){
		return emp;
	}
	
	@GetMapping("/get/{id}")
	public Employee getEmployee(@PathVariable int id) {
		if(id >= emp.size() || id < 0) {
			throw new CustomException("id not found: =" + id);
		}
		return emp.get(id);
	}

	@ExceptionHandler
	public ResponseEntity<EmployeeResponse> handleExce(CustomException cusEx){
		EmployeeResponse error = new EmployeeResponse();
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(cusEx.getMessage());
		error.setTimeStamp(System.currentTimeMillis());
		return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
		
	}
}
