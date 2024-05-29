package com.Test.MyJpaQue1.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.Test.MyJpaQue1.Entity.Employee;
import com.Test.MyJpaQue1.Services.EmployeeService;
import com.Test.MyJpaQue1.repo.EmployeeRepository;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@Controller
@Transactional
public class EmployeeController {


private EmployeeService employeeService;

@Autowired
public EmployeeController(EmployeeService employeeService) {
	super();
	this.employeeService = employeeService;
}

@GetMapping("/get")
public String addEmpolyeer(Model model) {
	model.addAttribute("employee" , new Employee());
	return "employeeregister";
	
}

@PostMapping("/status")
public String getStatus(@ModelAttribute("employee") Employee employee, BindingResult result, Model model) {
    if (result.hasErrors()) {
        return "employeeregister";
    }
    return "empsuccess";
}

@GetMapping("/employees")
public String getAllEmployees(Model model) {
    List<Employee> employees = employeeService.getAllEmployees();
    model.addAttribute("employees", employees);
    return "employeelist";
}

@GetMapping("/employee/edit/{id}")
public String showUpdateForm(@PathVariable("id") long id, Model model) {
    Optional<Employee> employee = employeeService.getEmployeeById(id);
    if (employee.isPresent()) {
        model.addAttribute("employee", employee.get());
        return "employeeupdate";
    } else {
        return "redirect:/employees";
    }
}

@PostMapping("/updateEmployee")
public String updateEmployee(@ModelAttribute("employee") @Valid Employee employee, BindingResult result, Model model) {
    if (result.hasErrors()) {
        return "employeeupdate";
    }
    employeeService.updateEmployee(employee);
    return "redirect:/employees";
}

@GetMapping("/employee/delete/{id}")
public String deleteEmployee(@PathVariable("id") long id) {
    employeeService.deleteEmployee(id);
    return "redirect:/employees";
}

}

	
	
	
