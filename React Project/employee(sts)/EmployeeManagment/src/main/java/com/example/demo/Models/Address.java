package com.example.demo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="address444")
public class Address {
   
   @Id
   @GeneratedValue
   private int id;
   @GeneratedValue
   private int pincode;
   private String district;
   
  public Address() {}
  public Address(int id,String district,int pincode) {
	  this.district=district;
	  this.pincode=pincode;
	  this.id=id;
  }
public String getDistrict() {
	return district;
}
public void setDistrict(String district) {
	this.district = district;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}

}
   