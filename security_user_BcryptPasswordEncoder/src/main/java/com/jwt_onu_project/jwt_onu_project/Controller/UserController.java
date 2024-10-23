package com.jwt_onu_project.jwt_onu_project.Controller;

import com.jwt_onu_project.jwt_onu_project.Service.UserService;
import com.jwt_onu_project.jwt_onu_project.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping("/register")
    public Users request(@RequestBody Users user){
        return service.register(user);
    }
}
