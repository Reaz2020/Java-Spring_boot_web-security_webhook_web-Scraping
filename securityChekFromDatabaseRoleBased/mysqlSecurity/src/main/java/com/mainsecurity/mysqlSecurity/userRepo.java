package com.mainsecurity.mysqlSecurity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepo extends JpaRepository <user,Long> {

    //this method will load the the data based on the username IN MYsql

    user findByUsername(String username);

    
    
}
