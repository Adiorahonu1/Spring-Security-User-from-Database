package com.jwt_onu_project.jwt_onu_project.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class UserDetaiss implements UserDetails {

    private Users user;

    public UserDetaiss(Users user) {
        this.user = user; // Assigns the user object to the class.
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singleton(new SimpleGrantedAuthority("USER")); // Grants a default "USER" role authority.
    }

    @Override
    public String getPassword() {
        return user.getPassword(); // Returns the user's password.
    }

    @Override
    public String getUsername() {
        return user.getUsername(); // Returns the user's username.
    }

    @Override
    public boolean isAccountNonExpired() {
        return true; // Indicates the account is not expired.
    }

    @Override
    public boolean isAccountNonLocked() {
        return true; // Indicates the account is not locked.
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true; // Indicates the credentials are not expired.
    }

    @Override
    public boolean isEnabled() {
        return true; // Indicates the account is enabled.
    }
}
