package com.akhilesh.service.impl;

import com.akhilesh.dao.EmployeeDao;
import com.akhilesh.model.Employee;
import com.akhilesh.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeDao employeeDao;

    @Override
    public void insertEmployee(Employee employee) {
        employeeDao.insertEmployee(employee);
    }

    @Override
    public void insertEmployees(List<Employee> employees) {

        employeeDao.insertEmployees(employees);
    }

    public void getAllEmployees() {
        List<Employee> employees = employeeDao.getAllEmployees();
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

    @Override
    public void getEmployeeById(String empId) {
        Employee employee = employeeDao.getEmployeeById(empId);
        System.out.println(employee);
    }

}