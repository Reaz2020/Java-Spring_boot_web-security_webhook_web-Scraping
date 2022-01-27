package com.mainpakage.sql;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    SubjectService subjectService;

    
    //gett alll the obj from the database 
   @RequestMapping("/employee")// maps the url and /employee given the url name 
    public List<employee> getEmployee(){ 
    return  subjectService.getAllEmployee();
}

// this method creates , adds a new obj in the databse 
@RequestMapping (method = RequestMethod.POST,value = "/employee")
void addEmployee(@RequestBody employee employee){
subjectService.AddEmployee(employee);
 }

 @RequestMapping (method = RequestMethod.PUT,value = "/employee/{id}")
 void updateEmployee(@PathVariable String id,  @RequestBody employee employee){
 subjectService.updateEmployee(id,employee);
  }

  //@RequestMapping (method = RequestMethod.DELETE,value = "/employee/{id}")
  @DeleteMapping(value ="/employee/{id}" )
  void deleteEmployee(@PathVariable String id){
  subjectService.deleteEmployee(id);
   }

 }
 



