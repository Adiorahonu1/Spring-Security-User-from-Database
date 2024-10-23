package com.jwt_onu_project.jwt_onu_project.repo;

import com.jwt_onu_project.jwt_onu_project.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users, Integer> {

    Users findByUsername(String username);
}
