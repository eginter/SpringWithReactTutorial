package com.elijahginter.dao;

import org.springframework.data.repository.CrudRepository;

import com.elijahginter.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{

}
