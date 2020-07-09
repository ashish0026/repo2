package com.slashcode.employeemanagement.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slashcode.employeemanagement.dao.IProjectDAO;
import com.slashcode.employeemanagement.dto.Project;

@Service
public class ProjectServiceImpl implements IProjectService{

	@Autowired
	private IProjectDAO daoRef;

	@Override
	public List<Project> getProjectList(int empId) {
		System.out.println("In Dao class employee id " +empId);
		return daoRef.findByEmployeeEmpId(empId);
	}

	

	@Override
	public Project getProjectById(int id) {
		// TODO Auto-generated method stub
		return daoRef.getOne(id);
	}

	@Override
	public void addProject(Project proj) {
		 daoRef.save(proj);
		
	}

	@Override
	public void updateProject(Project proj) {
		 daoRef.save(proj);
		
	}

	@Override
	public void deleteProjectById(int id) {
		 daoRef.deleteById(id);
		
	}
	
	public List<Project> getAllProject(){
		return daoRef.findAll();
	}
	
	
}
