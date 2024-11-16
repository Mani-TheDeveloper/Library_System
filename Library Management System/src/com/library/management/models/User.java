package com.library.management.models;

public class User {
    private int userId;
    private String name, address, email, phone;

    public User(int userId, String... userDetails) {
        this.userId = userId;
        name = userDetails[0];
        address = userDetails[1];
        email = userDetails[2];
        phone = userDetails[3];
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return name;
    }

    public String getUserAddress() {
        return address;
    }

    public String getUserEmail() {
        return email;
    }

    public String getUserPhone() {
        return phone;
    }
}
