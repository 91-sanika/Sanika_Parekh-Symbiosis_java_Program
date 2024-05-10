package com.Demo3.springbootApp.Third.EmployeeDeatils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Demo3.springbootApp.Third.a.CustomException;

import jakarta.annotation.PostConstruct;



@RestController
public class EmployeeController {

//	
//	@Value("${EmpId}")
//	private int Empid;
//	
//	@Value("${EmpName}")
//	private String EmpName;
//	
//	@Value("${EmpDept}")
//	private String EmpDept;
//	
//	@GetMapping("/get")
//	public String getEmployeeinfo() {
//		return @GetMapping("/setStudent")
	
	private List<Employee> employees=new ArrayList<>();
	
	@PostConstruct // new value set
	public void setAllEmployees(){
	employees.add(new Employee(1,"sharda","hr"));
	employees.add(new Employee(2,"Sanika","Sale"));
	employees.add(new Employee(3,"Sayali","Satara"));
			
	}
	 
	@GetMapping("/get")
	public List<Employee> getAllEmployees(){
	return employees;	
	}
	
	@GetMapping("/get/{id}")
	public Employee getEmployee(@PathVariable int id) { // id path
		
		if(id > employees.size()  || id<0) {
			throw new CustomException("id not found" + id);
			
		}
	return employees.get(id);
	}
	
	public ResponseEntity<EmployeeResponse> handleExce(CustomException cusEx){
		EmployeeResponse error = new EmployeeResponse();
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(cusEx.getMessage());
		error.setTimeStamp(System.currentTimeMillis());
	    return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
		
	}
		
}