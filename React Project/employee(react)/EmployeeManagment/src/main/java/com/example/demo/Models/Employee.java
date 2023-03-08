package com.example.demo.Models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="employee444")
public class Employee {
   @Id
   @GeneratedValue
   private int empid;
   private String empName;
   
//   @OneToOne(cascade = CascadeType.ALL)
//   @JoinColumn(name = "fk_id")
//   public Address address;
   @OneToMany(targetEntity=Address.class,cascade=CascadeType.ALL)
   @JoinColumn(name="fk_empid",referencedColumnName="empid")
   private List<Address> address;
   public Employee() {}
   public Employee(int empid,String empName,List<Address> address) {
	   this.empid=empid;
	   this.empName=empName;
	   this.address=address;
   }
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public List<Address> getAddress() {
	return address;
}
public void setAddress(List<Address> address) {
	this.address = address;
}

   
}
