package com.example.OAuthdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class HelloController {

    @GetMapping("/")
    public String Greet(){
        return "Welcome to OAuth Demo";
    }
    
    
}
