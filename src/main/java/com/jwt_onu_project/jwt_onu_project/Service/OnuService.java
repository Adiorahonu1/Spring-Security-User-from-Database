package com.jwt_onu_project.jwt_onu_project.Service;

import com.jwt_onu_project.jwt_onu_project.model.OnuStud;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OnuService {


    public List<OnuStud> students = new ArrayList<>(List.of(
            new OnuStud (1, "onu", 50 ),
            new OnuStud(2,"bot", 60 )
    ));
}
