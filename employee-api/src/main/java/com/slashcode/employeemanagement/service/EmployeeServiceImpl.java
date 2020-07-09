package com.slashcode.employeemanagement.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slashcode.employeemanagement.dao.IEmployeeDAO;
import com.slashcode.employeemanagement.dto.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService{

	List<Employee> empList  = new ArrayList<Employee>(Arrays.asList(new Employee(1,"Rohan", "Math"),
			 new Employee(2,"Ashish","Techno"),
			 new Employee(3,"Suraj","Multifields"),
			 new Employee(4,"Mukesh","Records")));

	@Autowired
	private IEmployeeDAO daoRef;
	
	@Override
	public List<Employee> getAllEmployee() {
		
		//return empList;
		return daoRef.findAll();
	}

	@Override
	public Employee getEmployeeById(int empId) {
		
		//return empList.stream().filter(e -> e.getEmpId() == empId).findFirst().get();
		return daoRef.getOne(empId);		
	}

	
	@Override
	public void addEmployee(Employee employee) {
		// empList.add(employee);
		daoRef.save(employee);	
	}

	@Override
	public void putEmployee(Employee employee, int empId) {
//		for(int i=0;i<empList.size();i++){
//			Employee e = empList.get(i);
//			if(e.getEmpId() == empId){
//				empList.set(i, employee);
//				return ;
//			}
//		}		
		daoRef.save(employee);
	}

	@Override
	public void deleteEmployee(int empId) {
		
		//empList.removeIf(e -> e.getEmpId() == empId);
		daoRef.deleteById(empId);
	}

	@Override
	public List<Employee> getEmployeeByDeprt(String department) {		
		return daoRef.findByDepartment(department);
	}

	
}
