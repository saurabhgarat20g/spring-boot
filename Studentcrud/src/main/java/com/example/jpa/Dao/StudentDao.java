package com.example.jpa.Dao;

import java.util.List;

import com.example.jpa.entity.Student;

public interface StudentDao  {
   public void save(Student thestudent);
   
   public List<Student> findall();
   
   public Student findbyId(Integer id);

   
}
