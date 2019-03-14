package com.example.detaillistfragment;

import java.io.Serializable;

public class Human implements Serializable{
    private String Name;
    private String Dob;
    private String Address;
    private String Email;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDob() {
        return Dob;
    }

    public void setDob(String dob) {
        Dob = dob;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Human() {
    }

    public Human(String name, String dob, String address, String email) {
        Name = name;
        Dob = dob;
        Address = address;
        Email = email;
    }
}
