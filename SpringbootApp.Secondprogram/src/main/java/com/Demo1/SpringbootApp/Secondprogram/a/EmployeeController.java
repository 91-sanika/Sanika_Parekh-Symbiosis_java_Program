package com.Demo1.SpringbootApp.Secondprogram.a;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeController {
	
	private static final String EmpCity = null;

	@Value("${emp.id}")
	private int EmpId;
	
	@Value("${emp.name}")
	private String EmpName;

	@Value("${emp.dept}")
	private String EmpDept;

	@GetMapping("/get")
	public String getEmployeeInfo() {
		return "Empid= " +  EmpId  + "EmpName=" + EmpName + "EmpCity=" + EmpCity ;
	}
	
	
}
