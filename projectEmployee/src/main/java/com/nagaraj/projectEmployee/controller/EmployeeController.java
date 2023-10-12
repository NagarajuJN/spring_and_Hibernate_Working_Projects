package com.nagaraj.projectEmployee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagaraj.projectEmployee.Entity.Employee;
import com.nagaraj.projectEmployee.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/create")  // to store the data in db
	public ResponseEntity<?> create(@RequestBody Employee employee) {
		return new ResponseEntity<Employee>(employeeService.create(employee),HttpStatus.CREATED);
	}
	
	@GetMapping("/get/{id}")
	  // to store the data in db
	public ResponseEntity<?> getEmployee(@PathVariable Long id) {
		return new ResponseEntity<Employee>(employeeService.getEmployee(id),HttpStatus.OK);
	}
	@PutMapping("/update")  // to store the data in db
	public ResponseEntity<?> update(@RequestBody Employee employee) {
		return new ResponseEntity<Employee>(employeeService.update(employee),HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")  // to store the data in db
	public ResponseEntity<?> delete(@PathVariable Long id) {
		return new ResponseEntity<String>(employeeService.delete(id),HttpStatus.OK);
	}
	
	
	@GetMapping("/getAll")  // to store the data in db
	public ResponseEntity<?> getALLEmployee() {
		return new ResponseEntity<List<Employee>>(employeeService.getAllEmpolyee(),HttpStatus.OK);
	}
}
