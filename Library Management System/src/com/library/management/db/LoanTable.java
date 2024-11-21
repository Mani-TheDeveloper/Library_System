package com.library.management.db;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.time.LocalDate;

public class LoanTable {
    static Connection con = null;

    public static void borrowBook(String[] loan) {
        try {
            String insertSql = "INSERT INTO LOAN (USERID, BOOKID, BORROWDATE) VALUES (?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(insertSql);
            for (int i = 0; i < loan.length; i++)
                pstmt.setString(i + 1, loan[i]);
            pstmt.setDate(3, Date.valueOf(LocalDate.now()));
            updateBookAvaliable(loan[1], false);
            pstmt.executeUpdate();
            System.out.println("Inserted Loan Successfully");
        } catch (Exception e) {
            System.out.println("Failed to insert loan : " + e.getMessage());
        }
    }

    public static void returnBook(String bookId) {
        try {
            String updateSql = "UPDATE LOAN SET RETURNDATE = ? WHERE BOOKID = ? AND RETURNDATE IS NULL";
            PreparedStatement pstmt = con.prepareStatement(updateSql);
            pstmt.setDate(1, Date.valueOf(LocalDate.now()));
            pstmt.setString(2, bookId);
            updateBookAvaliable(bookId, true);
            pstmt.executeUpdate();
            System.out.println("Updated loan successfully");
        } catch (Exception e) {
            System.out.println("Failed to update loan : " + e.getMessage());
        }
    }

    public static void updateBookAvaliable(String bookId, boolean avaliable) {
        try {
            String updateSql = "UPDATE BOOK SET ISAVALIABLE = ? WHERE BOOKID = ?";
            PreparedStatement pstmt = con.prepareStatement(updateSql);
            pstmt.setBoolean(1, avaliable);
            pstmt.setString(2, bookId);
            pstmt.executeUpdate();
            System.out.println("Updated Successfully book");
        } catch (Exception e) {
            System.out.println("Failed to update book : " + e.getMessage());
        }
    }
}