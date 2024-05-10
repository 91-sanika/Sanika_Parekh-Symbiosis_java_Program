package com.symbiosis.SpringbootApp.EmployeeInfo.a;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.symbiosis.SpringbootApp.EmployeeInfo.b.CustomException;

@Controller
public class ErrorHandler { // this class is used to handle the exception globally

	
	@ExceptionHandler
	public ResponseEntity<EmployeeResponse> handleExce(CustomException cusEx){
		EmployeeResponse error = new EmployeeResponse();
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(cusEx.getMessage());
		error.setTimeStamp(System.currentTimeMillis());
		return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
		
	}
}
