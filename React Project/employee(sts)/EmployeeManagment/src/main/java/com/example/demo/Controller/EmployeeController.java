package com.example.demo.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Employee;
import com.example.demo.Service.EmployeeService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;


@RestController
public class EmployeeController {
   @Autowired
   private EmployeeService empservice;
   
   
   @Operation(summary="Create a new Employee")
   @ApiResponses(value= {@ApiResponse(responseCode="201",description="Employee saved successfully"),
   @ApiResponse(responseCode="401",description="invalid credentials"),
   @ApiResponse(responseCode="404",description="No Details Found")
   })
  @ResponseStatus(HttpStatus.CREATED)

   //Produces="File type"
   //consumes="What you are going to pass
   @PostMapping(produces="application/json",consumes="application/json",value="/")
   public ResponseEntity<String> savegame(@RequestBody Employee e){
	   empservice.savedetails(e);
	   return ResponseEntity.ok("Data saved");
   }
}