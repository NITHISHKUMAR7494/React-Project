package com.project.employee.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.employee.entity.Employee;
import com.project.employee.repository.Emprepo;



@Service
public class service {

@Autowired
private Emprepo emprepo;

public List<Employee> getAllDetails(){
return emprepo.findAll();
}

public Employee saveDetails(Employee e) {
return emprepo.save(e);
}

public Employee updateDetails(Employee e) {
return emprepo.save(e);
}

public void deleteDetails(int empId) {
emprepo.deleteById(empId);
}
}
