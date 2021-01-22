package com.rogerIsAGenius.angularjsrestapidemo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.rogerIsAGenius.angularjsrestapidemo.model.Employee;



public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	Employee findByName(String name);
}