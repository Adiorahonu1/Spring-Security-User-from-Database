package com.jwt_onu_project.jwt_onu_project.Controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String greet(HttpServletRequest request){
        return "welcome onuora your ID is :-" + request.getSession().getId();
    }
}
