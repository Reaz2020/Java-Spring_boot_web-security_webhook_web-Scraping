package com.todrepo.todo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoIntterface extends JpaRepository<TodoItem,Long>{

   /* List<TodoItem> findAll();// without this methods post, get put working ... 

     TodoItem save(TodoItem t);

     void deleteById(Long id);
*/
}
