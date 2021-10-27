package com.example.googleapi.Models;

public class User {
    private String userID;
    private String email;
    private String role;


    public User(){}

    public User(String userID, String email, String role) {
        this.userID = userID;
        this.email = email;
        this.role = role;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
