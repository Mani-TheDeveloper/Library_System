package com.library.management.db;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class BookTable {
    static Connection con;

    public static void insertBook(String[] book) {
        try {
            String insertSql = "INSERT INTO BOOK VALUES (?, ?, ?, ?, TRUE)";
            PreparedStatement pstmt = con.prepareStatement(insertSql);
            for (int i = 0; i < book.length; i++)
                pstmt.setString(i + 1, book[i]);
            pstmt.executeUpdate();
            System.out.println("Inserted Book Successfully");
        } catch (Exception e) {
            System.out.println("Failed to Insert Book : " + e.getMessage());
        }
    }
}
