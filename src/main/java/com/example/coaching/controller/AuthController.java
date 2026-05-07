package com.example.coaching.controller;

import com.example.coaching.entity.User;
import com.example.coaching.service.UserService;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
@CrossOrigin("*")
public class AuthController {

	
	@Autowired
    private UserService userService;

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.register(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {

        User existingUser =
                userService.login(user.getUsername(), user.getPassword());

        if (existingUser != null) {
            return "Login Success";
        }

        return "Invalid Username or Password";
    }
}