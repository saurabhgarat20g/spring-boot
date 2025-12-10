package com.example.jpa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpa.entity.Employee;
import com.example.jpa.services.EmployeeServices;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	private EmployeeServices employeeservices;
	
   @GetMapping("/employee")
	public List<Employee> getAllEmployee(){
		
		return employeeservices.find();
	}
   @GetMapping("/employee/{id}")
   public Optional<Employee> getemplbyId(@PathVariable int id) {
	   return employeeservices.findbyid(id);
   }
   
   
   @PostMapping("/employee")
   public void save(@RequestBody Employee emp) {
	   employeeservices.create(emp);
   }
    
   
  
   @DeleteMapping("/employee/{id}")
   public void deletebyid(@PathVariable int id) {
	   employeeservices.removebyID(id);
   }

}
