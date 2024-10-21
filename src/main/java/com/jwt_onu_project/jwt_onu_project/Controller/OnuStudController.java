package com.jwt_onu_project.jwt_onu_project.Controller;

import com.jwt_onu_project.jwt_onu_project.Service.OnuService;
import com.jwt_onu_project.jwt_onu_project.model.OnuStud;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OnuStudController {

    private final OnuService onuService;

    public OnuStudController(OnuService onuService) {
        this.onuService = onuService;
    }

    @GetMapping("/onuStud")
    public List<OnuStud> getOnuStud(){
        return onuService.students;
    }

    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("-csrf");
    }

    @PostMapping("/onuStud")
    public OnuStud addOnuStud(@RequestBody OnuStud onuStud){
        onuService.students.add(onuStud);
        return onuStud;
    }
}
