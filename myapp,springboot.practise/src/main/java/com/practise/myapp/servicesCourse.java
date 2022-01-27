package com.practise.myapp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class servicesCourse implements courseservice {
    ArrayList <course> list =new ArrayList<course>();  
    course c1= new course(1,"java"); 
    course c2 = new course(2,"python"); 





    @Override
    public List<course> getCourse() {
        list.add(c1);
        list.add(c2);
         return list;
    }



    @Override
    public course getCourseSngl(long l) {
        // TODO Auto-generated method stub
        return null;
    }



    @Override
    public course AddCourse(course courses) {
        // TODO Auto-generated method stub
        return null;
    }



    @Override
    public void DeletCourse(long parseLong) {
        // TODO Auto-generated method stub
       
    }



    @Override
    public course UpdateCourse(course course) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
