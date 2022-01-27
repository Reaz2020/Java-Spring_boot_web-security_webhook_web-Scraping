package com.authontication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("authoTwo/rest")
public class NoAuthorizaController {


   
    @GetMapping("/hi")
    public String hi(){
        return" no authorization ----> passed security  *********";
    }
    
}
