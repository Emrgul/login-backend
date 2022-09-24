package com.emre.yazilimkampi.Repository;

import com.emre.yazilimkampi.Entity.User;
import com.emre.yazilimkampi.Request.LoginRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {



     User findAllByEmailAndPassword(String email , String password);




}
