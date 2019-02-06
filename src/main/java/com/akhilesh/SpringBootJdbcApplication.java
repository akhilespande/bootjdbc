package com.akhilesh;

import com.akhilesh.model.Employee;
import com.akhilesh.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringBootJdbcApplication {

	@Autowired
	EmployeeService employeeService;

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootJdbcApplication.class, args);
		EmployeeService employeeService = context.getBean(EmployeeService.class);
		
		
		Employee emp= new Employee();
		emp.setEmpId("1");
		emp.setEmpName("Akhilesh");
		
		Employee emp1= new Employee();
		emp1.setEmpId("2");
		emp1.setEmpName("Manish");
		
		Employee emp2= new Employee();
		emp2.setEmpId("3");
		emp2.setEmpName("Manoj");

		
		employeeService.insertEmployee(emp);

		List<Employee> employees = new ArrayList<>();
		employees.add(emp1);
		employees.add(emp2);
		employeeService.insertEmployees(employees);

		employeeService.getAllEmployees();
		
		employeeService.getEmployeeById(emp1.getEmpId());

	}
}