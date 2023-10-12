package com.nagaraj.projectEmployee.service;

import java.util.List;

import com.nagaraj.projectEmployee.Entity.Employee;

public interface EmployeeService {

	
	public Employee create(Employee employee);
	
	public Employee getEmployee(Long id);
	
	public List<Employee> getAllEmpolyee();

	public String delete(Long id);
	
	public Employee update(Employee employee);
	
	
}
