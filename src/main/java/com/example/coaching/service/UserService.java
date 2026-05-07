package com.example.coaching.service;


import com.example.coaching.entity.User;

public interface UserService {

    User register(User user);

    User login(String username, String password);
}