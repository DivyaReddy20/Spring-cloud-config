package com.cap.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cap.dto.Employee;

public interface AddEmpDao extends JpaRepository<Employee, Integer> {

}

