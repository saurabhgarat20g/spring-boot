package com.example.jpa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.jpa.emprepo.EmpoyeeRepo;
import com.example.jpa.entity.Employee;

@Service
public class EmployeeServices {

    private final EmpoyeeRepo employeerepo;

    @Autowired
    public EmployeeServices(EmpoyeeRepo employeerepo) {
        this.employeerepo = employeerepo;
    }

    public List<Employee> find() {
        return employeerepo.findAll();
    }

    public Optional<Employee> findbyid(int id) {
        return employeerepo.findById(id);
    }

    @Transactional
    public Employee create(Employee emp) {
        return employeerepo.save(emp);
    }

    @Transactional
    public void remove(Employee emp) {
        employeerepo.delete(emp);
    }

    @Transactional
    public void removebyID(int id) {
        employeerepo.deleteById(id);
    }
}
