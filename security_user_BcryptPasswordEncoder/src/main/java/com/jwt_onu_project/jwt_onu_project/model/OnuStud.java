package com.jwt_onu_project.jwt_onu_project.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class OnuStud {
    private int id;
    private String name;
    private int marks;


    @Override
    public String toString() {
        return "OnuStud{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
