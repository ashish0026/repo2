package com.slashcode.employeemanagement.service;

import java.util.List;

import com.slashcode.employeemanagement.dto.Employee;

public interface IEmployeeService {

	List<Employee> getAllEmployee();
	Employee getEmployeeById(int empId);
	void addEmployee(Employee employee);
	void putEmployee(Employee employee,int empId);
	void deleteEmployee(int empId);
	List<Employee> getEmployeeByDeprt(String department);

}
