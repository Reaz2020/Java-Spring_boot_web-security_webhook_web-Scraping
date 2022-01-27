package com.mainpakage.sql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class SubjectService  {
    @Autowired
    public employeeRepo employeeRepo;
  

    public List<employee> getAllEmployee(){
        List<employee> employee = new ArrayList<>();
        employeeRepo.findAll().forEach(employee::add);
        return employee;
    }

    // created a new obj inside our table 
    public void AddEmployee(employee employee) {
        employeeRepo.save(employee);
        
    }
      //update obj inside the table 
    public void updateEmployee(String id, employee employee) {
        employeeRepo.save(employee);
    }

    public void deleteEmployee(String id) {
        employeeRepo.deleteById(id);
    }
    }


