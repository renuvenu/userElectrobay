package com.example.userElectrobay.controller;


import com.example.userElectrobay.entity.User;
import com.example.userElectrobay.service.UserService;
import javafx.application.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value ="/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping(value = "/{id}")
    public User getUser(@PathVariable("id") int id){
        return userService.getUser(id);
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE )
    public User save(@RequestBody User user){
        System.out.println("RequestBody" + user);
        return userService.save(user);
    }


    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable("id") int id){
        userService.delete(id);
    }


}
