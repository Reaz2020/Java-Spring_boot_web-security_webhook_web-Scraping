package com.todrepo.todo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (value = "/todo")
public class TodoController {

    @Autowired
    TodoIntterface todo;  



    @GetMapping 
    public List <TodoItem> findAll(){
        
        return todo.findAll();
    }
    @PostMapping
    public TodoItem save( @Valid @NotNull  @RequestBody TodoItem todoItem){
        
        return todo.save(todoItem);
    }

    @PutMapping
    public TodoItem uTodoItem( @Valid @NotNull  @RequestBody TodoItem todoItem){
        
        return todo.save(todoItem);
    }
     
    @DeleteMapping (value ="/{id}")
    public void delete( @PathVariable Long id ){
            todo.deleteById(id);
    }
     
   

}
