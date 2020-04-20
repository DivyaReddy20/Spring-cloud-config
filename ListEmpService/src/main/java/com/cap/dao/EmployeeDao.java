package com.cap.dao;


import org.springframework.stereotype.Repository;

import com.cap.dto.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer>{

	
}