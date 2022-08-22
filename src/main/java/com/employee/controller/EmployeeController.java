package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.employee.entity.Employee;
import com.employee.service.IEmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	private IEmployeeService employeeService;

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/{eId}")
	public Employee getEmployee(@PathVariable("eId") Long eId) {
		Employee employee = this.employeeService.getEmployee(eId);

		// http://localhost:8083/record/emp/1411
		//DESKTOP-786C11E:Record-MicroServiceApplication:8083
		//http:RECORD-SERVER/record/emp
		List records = this.restTemplate.getForObject("http:/record/emp" + eId, List.class);
		employee.setRecord(records);

		return employee;

	}

}
