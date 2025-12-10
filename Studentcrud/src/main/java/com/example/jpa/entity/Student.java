package com.example.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="student")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name="firstname")
	
	private String firstname;
	
	@Column(name="lastname")
	private String lastname;
	@Column(name="email")
	private String emaail;

}
