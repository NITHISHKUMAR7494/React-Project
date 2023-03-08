package com.project.employee.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="EmployeeDetails")

public class Employee{
	@Id
	@Column(name="employee_id")
	private int employee_id;
	@Column(name="employee_name")
	private String employee_name;
	@Column(name="Problem")
	private String Problem;
	@Column(name="Phone_no")
	private int Phone_no;
	@Column(name="Availability")
	private int avail;
	@Column(name="Bill")
	private int Bill;
	public Employee() {} ;
	public Employee(int employee_id,String employee_name,String Problem,int Phone_no,int avail,int Bill)
	{
		super();
		this.employee_id=employee_id;
		this.employee_name=employee_name;		
		this.Problem=Problem;
		this.Phone_no=Phone_no;
		this.avail=avail;
		this.Bill=Bill;
	}
	public int getemployee_id() {
		return employee_id;
	}
	public void setemployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getemployee_name() {
		return employee_name;
	}
	public void setemployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public String getProblem() {
		return Problem;
	}
	public void setProblem(String problem) {
		Problem = problem;
	}
	public int getPhone_no() {
		return Phone_no;
	}
	public void setPhone_no(int phone_no) {
		Phone_no = phone_no;
	}
	public int getAvail() {
		return avail;
	}
	public void setAvail(int avail) {
		this.avail = avail;
	}
	public int getBill() {
		return Bill;
	}
	public void setBill(int bill) {
		Bill = bill;
	}
}

