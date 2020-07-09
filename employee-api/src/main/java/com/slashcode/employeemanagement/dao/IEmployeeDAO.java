package com.slashcode.employeemanagement.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slashcode.employeemanagement.dto.Employee;

@Repository
public interface IEmployeeDAO extends JpaRepository<Employee,Integer> {
	
	List<Employee> findByDepartment(String department);

}
