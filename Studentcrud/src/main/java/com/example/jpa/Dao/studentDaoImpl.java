package com.example.jpa.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.jpa.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
@Repository
public class studentDaoImpl implements StudentDao {
	
	private EntityManager entitymanager;
	
	@Autowired
	public studentDaoImpl (EntityManager theentityManager) {
		entitymanager = theentityManager;
	}

	@Override
	@Transactional
	public void save(Student thestudent) {
		// TODO Auto-generated method stub
		entitymanager.persist(thestudent);
	}
	
	
    @Override
    @Transactional
	public List<Student> findall() {
		TypedQuery<Student> theQuery =
				entitymanager.createQuery("from Student",Student.class);
		return theQuery.getResultList();
	}

	@Override
	
	public Student findbyId(Integer id) {
		
		return entitymanager.find(Student.class, id);
	}

    
    
    

}
