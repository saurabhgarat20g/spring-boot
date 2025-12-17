package com.example.jpa.entity;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class EmployeeResponse {
private Integer id;
	
	
	private String name;
	
	
	private String designation;
	

	private String department;
	
	
	private double salary;

}
