package com.wallet.transaction.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.wallet.transaction.entity.Users;
import com.wallet.transaction.service.UserService;

import java.util.List;

@RestController

@RequestMapping("/api/users")

public class UserController {

    @Autowired

    private UserService userService;

    // MASTER TABLE API

    @GetMapping

    public List<Users> getAllUsers() {

        return userService.getAllUsers();

    }

    // helper endpoint (optional)

//    @GetMapping("/by-name")
//
//    public Users getUserByName(@RequestParam String name) {
//
//        return userService.getUserByName(name);
//
//    }

}
 