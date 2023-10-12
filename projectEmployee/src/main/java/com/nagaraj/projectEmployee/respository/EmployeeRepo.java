package com.nagaraj.projectEmployee.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nagaraj.projectEmployee.Entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Long> {

}
