package com.grudiy.slownews.model;

/**
 * Created by Owner on 29.08.2016.
 */

public class User {
    String fullName;
    String email;
    String password;

    public User(String fullName, String email, String password) {
        this.fullName = fullName;
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
