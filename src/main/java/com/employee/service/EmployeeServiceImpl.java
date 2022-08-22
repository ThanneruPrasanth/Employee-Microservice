package com.employee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.employee.entity.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
	
	
	List<Employee> list =List.of(
			
			new Employee(1411L,"ravi","123456789"),
			new Employee(1412L,"ramu","993456789"),
			new Employee(1413L,"ramesh","883456789"),
			new Employee(1414L,"ram","773456789"),
			new Employee(1415L,"rajesh","663456789"),
			new Employee(1416L,"roja","553456789"),
			new Employee(1417L,"raji","443456789"),
			new Employee(1418L,"rakesh","333456789"),
			new Employee(1419L,"roshan","223456789")		
			);

	@Override
	public Employee getEmployee(Long Id) {
		
		return list.stream().filter(employee -> employee.geteId().equals(Id)).findAny().orElse(null);
	}

	

}
