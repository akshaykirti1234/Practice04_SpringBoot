package tech.csm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tech.csm.model.Employee;
import tech.csm.service.EmployeeService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/empController")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	// Get All Employee Data
	@GetMapping("/getAllEmp")
	public List<Employee> getAllEmp() {
		List<Employee> empList = employeeService.getAllEmp();
		return empList;
	}

	// save Employee()
	@PostMapping("/saveEmp")
	public ResponseEntity<String> saveEmp(@RequestBody Employee employee) {
		System.out.println(employee);
		return null;

	}
}
