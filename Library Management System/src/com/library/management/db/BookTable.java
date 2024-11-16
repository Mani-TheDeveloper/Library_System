package com.library.management.db;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.library.management.models.Book;

public class BookTable {
    private Connection con = null;

    public BookTable(Connection con) {
        this.con = con;
    }

    public void insertBook(Book book) {
        try {
            String insertSql = "INSERT INTO BOOK VALUES (?, ?, ?, ?, TRUE)";
            PreparedStatement pstmt = con.prepareStatement(insertSql);
            pstmt.setInt(1, book.getBookId());
            pstmt.setString(2, book.getBookTitle());
            pstmt.setString(3, book.getBookAuthor());
            pstmt.setString(4, book.getBookCategory());
            pstmt.executeUpdate();
            System.out.println("Inserted Book Successfully");
        } catch (Exception e) {
            System.out.println("Failed to Insert Book : " + e.getMessage());
        }
    }
}
