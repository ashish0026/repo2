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
import com.slashcode.employeemanagement.dto.Project;
import com.slashcode.employeemanagement.service.IProjectService;

@RestController
public class projectController {

	@Autowired
	IProjectService projServiceRef;

	@GetMapping("/proj/welcome")
	public String welcomeProject() {
		System.out.println("Hllo Project");
		return "Hi Ashish_Project";
	}

	@GetMapping("employees/{empId}/projects")
	public List<Project> getAllProjects(@PathVariable int empId) {
		System.out.println("In the project Controller");
		List<Project> projList = projServiceRef.getProjectList(empId);
		System.out.println(projList);
		return projList;
	}
	
	@GetMapping("/projects")
	public List<Project> getProjectList(){
		return projServiceRef.getAllProject();
	}
	
	@GetMapping("/employees/{empId}/projects/{id}")
	public Project getProjectById(@PathVariable int id){
		return projServiceRef.getProjectById(id);
	}
	
	
	@PostMapping("/employees/{empId}/projects")
	public void addProject(@RequestBody Project proj, @PathVariable int empId){
		proj.setEmployee(new Employee(empId,"",""));
		projServiceRef.addProject(proj);
	}
	
	@PutMapping("/employees/{empId}/projects/{id}")
	public void updateProject(@RequestBody Project proj, @PathVariable int empId){
		proj.setEmployee(new Employee(empId,"",""));
		projServiceRef.updateProject(proj);
	}
	
	@DeleteMapping("/projects/{id}")
	public void deleteProject(@PathVariable int Id){
		projServiceRef.deleteProjectById(Id);
	}
	

}