package com.revature.services;

import com.revature.repos.UserDAO;
import com.revature.repos.UserDAOImple;

public class LoginService {
    UserDAO user = new UserDAOImple();

    public boolean login(){
        user.findCredentials();
        return false;
    }
}
