package com.su.StorageUnit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.su.StorageUnit.Entity.Employee;
import com.su.StorageUnit.repository.EmployeeRepository;

//@Controller
@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeData;
		
	@GetMapping("/employees") 		 
	public List<Employee> getAllEmployee(){
		List<Employee> listOfEmp= employeeData.findAll();
		return listOfEmp;
	}
	
//	@RequestMapping(value="/addNewEmployee.html", method = RequestMethod.POST)
//	public String newEmployee(Employee employee) {
//		employeeData.save(employee);
//		return ()
//	}
}
