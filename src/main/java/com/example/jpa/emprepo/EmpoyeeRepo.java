package com.example.jpa.emprepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.jpa.entity.Employee;

@Repository
public interface EmpoyeeRepo extends JpaRepository<Employee, Integer>  {

}
	