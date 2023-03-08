package com.project.employee.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.project.employee.entity.Employee;
import com.project.employee.service.service;
@RestController
@CrossOrigin
public class controller {
@Autowired
private service service;
@GetMapping("/get")
private List<Employee>add(){
return service.getAllDetails();
}
@PostMapping("/post")
private String post(@RequestBody Employee e) {
service.saveDetails(e);
return "Value Added";
}
@PutMapping("/put")
private String put(@RequestBody Employee e) {
service.updateDetails(e);
return "Value updated";
}
@DeleteMapping("/delete/{id}")
private void delete(@PathVariable("id")int empId) {
service.deleteDetails(empId);
	}
}

