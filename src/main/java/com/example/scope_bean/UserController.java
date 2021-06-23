package com.example.scope_bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final User user;

    public UserController(@Qualifier("requestUser") User user) {
        this.user = user;
    }

    @GetMapping("/user")
    public String getUser() {
        return user.getName();
    }

    @GetMapping("/login")
    public String login() {
        user.setName("Minh Tan");
        user.setPass("Pass");
        return String.format("Login with name: %s , password %s", user.getName(), user.getPass());
    }
}
