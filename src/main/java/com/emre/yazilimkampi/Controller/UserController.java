package com.emre.yazilimkampi.Controller;

import com.emre.yazilimkampi.Entity.User;
import com.emre.yazilimkampi.Repository.UserRepository;
import com.emre.yazilimkampi.Request.LoginRequest;
import com.emre.yazilimkampi.Service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class UserController {



    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;


    @PostMapping("/login")
    User login(@RequestBody LoginRequest loginRequest){

        User user = userService.getUser(loginRequest.getEmail(),loginRequest.getPassword());
        return user ;

    }





    @PostMapping("/create")
    User CreateUser(@RequestBody User user) throws Exception {

        User user1 = userService.getUser(user.getEmail(), user.getPassword());

        if (Objects.equals(user.getEmail(), user1.getEmail())){

            System.out.println("Kullanıcı zaten mevcut");
           return null;

        }else{

            return userRepository.save(user);
        }



    }

}
