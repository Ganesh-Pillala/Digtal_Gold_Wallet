package com.wallet.transaction.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.wallet.transaction.entity.Users;
import com.wallet.transaction.repository.UsersRepository;
import com.wallet.transaction.service.UserService;

import java.util.List;

@Service

public class UserServiceImpl implements UserService {

    @Autowired

    private UsersRepository usersRepository;

    @Override

    public List<Users> getAllUsers() {

        return usersRepository.findAll();

    }

//    @Override
//
//    public Users getUserByName(String name) {
//
//        return usersRepository.findByNameIgnoreCase(name.trim())
//
//                .orElseThrow(() -> new RuntimeException("User not found: " + name));
//
//    }

}
 