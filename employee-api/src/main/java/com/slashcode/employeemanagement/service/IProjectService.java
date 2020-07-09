package com.slashcode.employeemanagement.service;

import java.util.List;

import com.slashcode.employeemanagement.dto.Project;

public interface IProjectService {

//	List<Project> getAllProjects();
//	Employee getEmployeeById(int empId);
//	void addEmployee(Employee employee);
//	void putEmployee(Employee employee,int empId);
//	void deleteEmployee(int empId);
//	List<Employee> getEmployeeByDeprt(String department);

	List<Project> getProjectList(int empId);
	
	List<Project> getAllProject();

	Project getProjectById(int id);

	void addProject(Project proj);

	void updateProject(Project proj);

	void deleteProjectById(int id);



}
