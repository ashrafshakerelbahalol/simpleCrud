package com.example.demo.service;

import com.example.demo.entity.Users;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public List<Users>  getUsers (){return null;}
    public List<Users>  deleteUser (){return null;}
    public List<Users>  updateUser (){return null;}
    public List<Users>  addUser (){return null;}
}
