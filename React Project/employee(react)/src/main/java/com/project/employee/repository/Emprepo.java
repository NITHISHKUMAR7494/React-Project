package com.project.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.employee.entity.Employee;





public interface Emprepo extends JpaRepository<Employee, Integer> {

}
