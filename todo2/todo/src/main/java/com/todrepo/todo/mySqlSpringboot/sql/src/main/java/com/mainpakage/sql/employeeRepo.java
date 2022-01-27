package com.mainpakage.sql;

import org.springframework.data.repository.CrudRepository;

public interface employeeRepo extends CrudRepository<employee,String> {
    
}
