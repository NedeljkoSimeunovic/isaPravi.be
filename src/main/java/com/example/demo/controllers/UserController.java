package com.example.demo.controllers;

import com.example.demo.models.UserModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @GetMapping("get-first-name")
    public String grtFirstName() {
        return "Nedeljko";
    }

    @GetMapping("get-first-name-list")
    public List<String> getFirstNameList() {
        return List.of("Nedeljko", "Petar");
    }

    @PostMapping("create-user")
    public boolean createUser(@RequestBody UserModel userModel ){
        return true;
    }
}