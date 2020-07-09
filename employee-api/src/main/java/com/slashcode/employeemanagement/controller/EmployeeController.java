package com.slashcode.employeemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.slashcode.employeemanagement.dto.Employee;
import com.slashcode.employeemanagement.service.IEmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	IEmployeeService empServiceRef;

	@GetMapping("/welcome")
	public String welcomeEmployee() {
		System.out.println("Hllo Employee");
		return "Hi Ashish";
	}

	@GetMapping("/employees")
	public List<Employee> getAllEmployee() {
		return empServiceRef.getAllEmployee();
	}

	@GetMapping("/employees/{empId}")
	public Employee getEmployeeById(@PathVariable int empId) {

		return empServiceRef.getEmployeeById(empId);
	}

	@PostMapping("/employees")
	public String addEmployee(@RequestBody Employee employee) {
		empServiceRef.addEmployee(employee);
		return "Employee added successfully";
	}

	@PutMapping("/employees/{empId}")
	public String putEmployee(@RequestBody Employee employee, @PathVariable int empId) {
		empServiceRef.putEmployee(employee, empId);
		return "Employee put successfully";
	}

	@DeleteMapping("/employees/{empId}")
	public void deleteEmployee(@PathVariable int empId) {
		empServiceRef.deleteEmployee(empId);

	}

	@GetMapping("/employees/dept/{department}")
	public List<Employee> getEmployeeByDeprt(@PathVariable String department) {
		return empServiceRef.getEmployeeByDeprt(department);

	}

}