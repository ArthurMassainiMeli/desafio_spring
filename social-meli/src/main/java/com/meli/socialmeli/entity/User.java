package com.meli.socialmeli.entity;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@MappedSuperclass
public abstract class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Integer userId;

    @NotBlank
    protected String username;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public User(String username) {
        this.username = username;
    }

    public User() {}
}
