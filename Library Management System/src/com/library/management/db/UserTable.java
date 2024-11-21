package com.library.management.db;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserTable {
    static Connection con;

    public static void insertUser(String[] user) {
        try {
            String insertSql = "INSERT INTO USERS VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(insertSql);
            for (int i = 0; i < user.length; i++)
                pstmt.setString(i + 1, user[i]);
            pstmt.executeUpdate();
            System.out.println("Inserted successfully User");
        } catch (Exception e) {
            System.out.println("Failed to Insert User : " + e.getMessage());
        }
    }

}
