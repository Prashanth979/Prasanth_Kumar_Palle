package com.prashanth.ems.service;

import com.prashanth.ems.exception.InvalidCredentialsException;

public class AuthService {
    
    private final String username = "admin";
    private final String password = "1234";

    public void authenticate(String username, String password) throws InvalidCredentialsException{
        if(!this.username.equals(username) || !this.password.equals(password)) {
            throw new InvalidCredentialsException("Invalid username or password");
        }
        
    }
}
