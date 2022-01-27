package com.practise.myapp;

import java.util.List;

//import org.springframework.stereotype.Service;
//@Service

public interface courseservice {

    List <course> getCourse();

    course getCourseSngl(long CourseId);

    course AddCourse(course courses);

    void DeletCourse(long parseLong);

    course UpdateCourse(course course);

}
