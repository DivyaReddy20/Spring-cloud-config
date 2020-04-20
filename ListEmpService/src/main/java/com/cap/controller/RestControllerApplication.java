package com.cap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cap.dto.Employee;
import com.cap.service.EmployeeService;

@RestController

@RequestMapping("/fetch")
public class RestControllerApplication 
{
	@Autowired
	EmployeeService empService;
	
	@GetMapping("/list")
	public List<Employee> findAllEmployees() {
		return empService.findAllEmployees();
	}
}