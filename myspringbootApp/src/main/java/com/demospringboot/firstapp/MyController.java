package com.demospringboot.firstapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/")
	public String getHello() {
		return "HelloWorld";
	}
	
	@GetMapping("/demo")
	public String getHome() {
		return "Homeeeeeeeeeeeeee";
	}
}
