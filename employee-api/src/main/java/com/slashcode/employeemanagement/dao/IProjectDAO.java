package com.slashcode.employeemanagement.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slashcode.employeemanagement.dto.Project;

@Repository
public interface IProjectDAO extends JpaRepository<Project,Integer> {

	List<Project> findByEmployeeEmpId(int empId);
	
	

}
