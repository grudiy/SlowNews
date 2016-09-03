package com.grudiy.slownews.model;
import com.grudiy.slownews.model.UserStorage;

/**
 * Created by Owner on 29.08.2016.
 */

public class User {
    Integer id;
    String fullName;
    String email;
    String password;
    Boolean activated;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public Boolean getActivated() {
        return activated;
    }

    public void setActivated(Boolean activated) {
        this.activated = activated;
    }

    public User(Integer id, String fullName, String email, String password, Boolean activated) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.activated = activated;
    }
}
