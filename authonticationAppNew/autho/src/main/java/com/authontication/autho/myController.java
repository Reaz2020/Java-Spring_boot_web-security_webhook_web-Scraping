package com.authontication.autho;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/autho")
public class myController {

   @GetMapping("/welcome")
   public String welcome(){
        return "Authorised controller";
    }
    
}