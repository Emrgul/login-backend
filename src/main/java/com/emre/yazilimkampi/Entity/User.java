package com.emre.yazilimkampi.Entity;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String user_name;

    private String email;

    private String password;

    private String role;


    public User(int id, String user_name, String email, String password, String role) {
        this.id = id;
        this.user_name = user_name;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public User() {

    }

    public User(String email, String username, String password) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
