package com.practise.myapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
/*import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;*/
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {




@GetMapping ("/Test")
@ResponseBody
public String Header(){
    return "Working......";
 }
 @Autowired // to creat object autometically 
 private courseservice cs1;


 //courseservice cs1= new courseservice(); we can not creat object of interface because they are abstract class 
 //servicesCourse cs1 = new servicesCourse(); 
@GetMapping ("/Courses") // @RequestMapping (path="/Courses",method=RequestMethod.GET)* also works 
@ResponseBody
 List<course> getCourses(){
    //courseservice cs1=null; if we declare here this cs1 must need to initialize. 
    return cs1.getCourse(); 
     }
    
@GetMapping("/Courses/{courseId}") // have not implemented yet 
@ResponseBody
course GetCourse(@PathVariable String courseId){
    return cs1.getCourseSngl(Long.parseLong(courseId));
}

@PostMapping(path = "/Courses" , consumes = "Application/Json") // have not implemented yet *(path = & consums = "Application/Json" optional to write)
@ResponseBody
course AddCourse(@RequestBody course  Courses){
    return cs1.AddCourse(Courses);

}


@PutMapping("/Courses") // have not implemented yet 
@ResponseBody
course UpdateCourse(@RequestBody course course){
    return cs1.UpdateCourse(course);
}


@DeleteMapping("/Courses/{courseId}") // have not implemented yet in service --->
@ResponseBody
ResponseEntity<HttpStatus>  DeletCourse(@PathVariable String courseId){

    try {
    cs1.DeletCourse(Long.parseLong(courseId));
    return new ResponseEntity<>(HttpStatus.OK);} 
    
    catch (Exception e) {
    return  new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);}

}





}
