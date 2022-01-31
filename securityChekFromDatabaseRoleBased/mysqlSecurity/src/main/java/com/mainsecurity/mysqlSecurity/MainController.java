package com.mainsecurity.mysqlSecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    
@GetMapping("/home")
String home(){
    return " home page ";

}

@GetMapping("/admin")
String admin(){
    return "this is admin page";
}

@GetMapping("/nehal")
String nehal(){
    return " nehals page ";
}



}