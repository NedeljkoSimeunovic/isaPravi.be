package com.example.demo.controllers;

import com.example.demo.models.UserModel;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @GetMapping("get-first-name")
    public String getFirstName() {
        return "Nedeljko";
    }

    @GetMapping("get-first-name-list")
    public List<String> getFirstNameList() {
        return List.of("Nedeljko", "Petar");
    }

    @PostMapping("create-user")
    public ResponseEntity<?> createUser(@RequestBody @Valid UserModel userModel, BindingResult result) {
        if (result.hasErrors()) {
            return new ResponseEntity<>("Neuspesno registrovan!", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(userModel, HttpStatus.CREATED);
    }
}