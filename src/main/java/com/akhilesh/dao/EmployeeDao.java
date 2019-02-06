package com.akhilesh.dao;

import com.akhilesh.model.Employee;

import java.util.List;

public interface EmployeeDao {
	void insertEmployee(Employee cus);
	void insertEmployees(List<Employee> employees);
	List<Employee> getAllEmployees();
	Employee getEmployeeById(String empId);
}