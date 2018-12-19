package com.company;

import java.io.Serializable;
import java.util.ArrayList;

public class user implements Serializable {

@Override
    public boolean equals(Object obj){
        user other=(user)obj;
        if(!username.equals(other.username))
            return false;
    if(!password.equals(other.password))
        return false;
    return true;
    }
    public user(String username, String password){
        this.username=username;
        this.password=password;
        this.ID=ID;

    }


    public int ID;  //if ID=0 ; user is ADMIN
    public String username;
    public String password;
    public String firstname;
    public String lastname;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String email;


}
