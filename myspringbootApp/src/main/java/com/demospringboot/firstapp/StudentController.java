package com.demospringboot.firstapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@GetMapping("/setStudent")
	public List <Student>setStudent(){
		
		Student s = new Student();
		List<Student> students= new ArrayList<Student>();
		students.add(new Student(1,"Sanika", "Belgaum"));
		students.add(new Student(2,"Sharda","Shirala"));
		return students;
		
		}
	
	@GetMapping("/profile")
	
	public String getName(@RequestParam String name) {
		return "name"+name;
	}
}
