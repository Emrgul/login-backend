package com.emre.yazilimkampi.Service;

import com.emre.yazilimkampi.Entity.User;
import com.emre.yazilimkampi.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @Autowired
    private UserRepository userRepository;


    public User getUser(String email ,String password){

        return userRepository.findAllByEmailAndPassword(email,password);

    }


}
