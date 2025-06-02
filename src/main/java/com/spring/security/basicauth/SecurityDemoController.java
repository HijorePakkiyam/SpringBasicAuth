package com.spring.security.basicauth;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/rest")
public class SecurityDemoController {

   
    @GetMapping("/public")
    public String publicEndPoint(){
        return "This is public endpoint";
    }

    @GetMapping("/admin")
    public String adminEndPoint(){
        return "This is admin endpoint";
    }

    @GetMapping("/user")
    public String userEndPoint(){
        return "This is user endpoint";
    }
    
}
