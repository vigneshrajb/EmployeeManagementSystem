package com.example.SpringCRUD.service;

import java.util.List;

import com.example.SpringCRUD.model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	void saveEmployee(Employee employee);
	Employee getEmployeeById(long id);
	void deleteEmployeeById(long id);
}
	
