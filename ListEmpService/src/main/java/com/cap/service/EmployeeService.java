package com.cap.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cap.dao.EmployeeDao;
import com.cap.dto.Employee;

@Service
public class EmployeeService implements EmployeeServiceI{

	
	@Autowired
	EmployeeDao empDao;
	
	@Override
	public List<Employee> findAllEmployees() {
	List<Employee> emps=	empDao.findAll();
		return emps;
	}
}
