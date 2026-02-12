package com.prashanth.ems.service;

import com.prashanth.ems.exception.InvalidCredentialsException;

public class LoginService {
        
        private AuthService authService = new AuthService();
    
        public boolean login(String username, String password) {
            
            try{
                authService.authenticate(username, password);
                System.out.println("Login successful!");
                return true;
            } catch(InvalidCredentialsException e) {
                System.out.println(e.getMessage());
                return false;
            }
            
        }

       
}
