package com.example.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpa.Dao.StudentDao;
import com.example.jpa.entity.Student;

@RestController
public class StudentController {
	
	@Autowired
	private StudentDao studentdao;
          
	  @PostMapping("/student")
	  public String addstudent(@RequestBody Student student) {
		  studentdao.save(student);
		  
		  return "Student added succesfully";
	  }
	  
	  @GetMapping("/students")
	  public List<Student> getallstudent(){
		  List<Student> student = studentdao.findall();
		  return student;
	  }
     @GetMapping("/student/{id}")
	  public Student getStudentBYId(@PathVariable Integer id) {
		  Student stud = studentdao.findbyId(id);
		return stud;
		  
	  }
     
//     @PutMapping("/student/{id}")
//     public String  updatestudent(@PathVariable Integer id) {
//    	 Student student = studentdao.update(id);
//    	 return  "student succefully updated ";
//     }
}
