package com.newspaper.newswebsite.controller;

import com.newspaper.newswebsite.domain.User;
import com.newspaper.newswebsite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(path="/addUser")
    public ResponseEntity<String> addUser(@RequestBody User user){
       try{
           userService.addUser(user);
           return new ResponseEntity<>("Successfully Added",HttpStatus.OK);
       }catch (Exception e){
           return new ResponseEntity<>(e.toString(),HttpStatus.INTERNAL_SERVER_ERROR);
       }
    }
}
