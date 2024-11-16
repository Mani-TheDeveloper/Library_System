package com.library.management.db;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.library.management.models.User;

public class UserTable {
    private Connection con = null;

    public UserTable(Connection con) {
        this.con = con;
    }

    public void insertUser(User user) {
        try {
            String insertSql = "INSERT INTO USERS VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(insertSql);
            pstmt.setInt(1, user.getUserId());
            pstmt.setString(2, user.getUserName());
            pstmt.setString(3, user.getUserAddress());
            pstmt.setString(4, user.getUserEmail());
            pstmt.setString(5, user.getUserPhone());
            pstmt.executeUpdate();
            System.out.println("Inserted successfully User");
        } catch (Exception e) {
            System.out.println("Failed to Insert User : " + e.getMessage());
        }
    }

}
