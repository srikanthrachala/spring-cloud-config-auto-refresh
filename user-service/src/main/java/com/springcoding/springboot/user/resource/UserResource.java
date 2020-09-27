package com.springcoding.springboot.user.resource;

import com.springcoding.springboot.user.config.UserConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserResource {
    @Autowired
    UserConfiguration userConfiguration;

    @GetMapping("/message")
    public String message(){
        return userConfiguration.getMessage();
    }

}

