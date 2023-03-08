package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Employee;

import com.example.demo.Repositories.EmployeeRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepo em;
	
	@Autowired
	EntityManager em1;

    public Employee savedetails(Employee e) {
		return em.save(e);
	}
}