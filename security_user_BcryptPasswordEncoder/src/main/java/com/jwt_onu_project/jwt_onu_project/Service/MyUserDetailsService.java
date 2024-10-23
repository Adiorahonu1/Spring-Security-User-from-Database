package com.jwt_onu_project.jwt_onu_project.Service;

import com.jwt_onu_project.jwt_onu_project.model.UserDetaiss;
import com.jwt_onu_project.jwt_onu_project.model.Users;
import com.jwt_onu_project.jwt_onu_project.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo; // Injects the UserRepo to interact with the user data.

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = userRepo.findByUsername(username); // Fetches the user by username.

        if (user == null) {
            System.out.println("user not found"); // Logs if the user is not found.
            throw new UsernameNotFoundException("user not found"); // Throws exception if user is not found.
        }
        return new UserDetaiss(user); // Returns custom UserDetails implementation.
    }
}

