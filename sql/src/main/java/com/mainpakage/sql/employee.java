package com.mainpakage.sql;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee") //table has been created in mysql 
public class employee {

    @Id // id will be the primery key 
    int id;
    String name;
    String department;
    employee(){} // not sue why this one is needed to  create table 
    public employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }
    @Override
    public String toString() {
        return "employee [department=" + department + ", id=" + id + ", name=" + name + "]";
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    
}
