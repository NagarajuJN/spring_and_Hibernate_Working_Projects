package com.nagaraj.projectEmployee.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagaraj.projectEmployee.Entity.Employee;
import com.nagaraj.projectEmployee.respository.EmployeeRepo;
import com.nagaraj.projectEmployee.service.EmployeeService;


@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired  // it will inject the dependences of method
	private EmployeeRepo employeeRepo;
	@Override
	public Employee create(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepo.save(employee);
	}

	@Override
	public Employee getEmployee(Long id) {
		// TODO Auto-generated method stub
		return employeeRepo.findById(id).get();
	}// 

	@Override
	public List<Employee> getAllEmpolyee() {
		// TODO Auto-generated method stub
		return employeeRepo.findAll();
	}

	@Override
	public String delete(Long id) {
		// TODO Auto-generated method stub
		employeeRepo.deleteById(id);
		return "employee deleted";
	}

	@Override
	public Employee update(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepo.save(employee);  // update or save both are same
	}

}
