package com.todrepo.todo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TodoItem {
    int id;
    @NotBlank
    String title;
    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }
    public TodoItem() {
    }
    @Override
   
   
   
   
   
    public String toString() {
        return "todoItem [done=" + done + ", id=" + id + ", title=" + title + "]";
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public boolean isDone() {
        return done;
    }
    public void setDone(boolean done) {
        this.done = done;
    }
    boolean done;
  
    


    
}
