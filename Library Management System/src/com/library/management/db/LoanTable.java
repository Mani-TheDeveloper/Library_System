package com.library.management.db;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.time.LocalDate;

import com.library.management.models.Loan;

public class LoanTable {
    private Connection con = null;

    public LoanTable(Connection con) {
        this.con = con;
    }

    public void borrowBook(Loan loan) {
        try {
            String insertSql = "INSERT INTO LOAN VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(insertSql);
            pstmt.setInt(1, loan.getLoanId());
            pstmt.setInt(2, loan.getUserId());
            pstmt.setInt(3, loan.getBookId());
            pstmt.setDate(4, loan.getBorrowDate());
            pstmt.setDate(5, loan.getReturnDate());
            updateBookAvaliable(loan.getBookId(), false);
            pstmt.executeUpdate();
            System.out.println("Inserted Loan Successfully");
        } catch (Exception e) {
            System.out.println("Failed to insert loan : " + e.getMessage());
        }
    }

    public void returnBook(int bookId) {
        try {
            String updateSql = "UPDATE LOAN SET RETURNDATE = ? WHERE BOOKID = ? AND RETURNDATE IS NULL";
            PreparedStatement pstmt = con.prepareStatement(updateSql);
            pstmt.setDate(1, Date.valueOf(LocalDate.of(2024,12,22)));
            pstmt.setInt(2, bookId);
            updateBookAvaliable(bookId, true);
            pstmt.executeUpdate();
            System.out.println("Updated loan successfully");
        } catch (Exception e) {
            System.out.println("Failed to update loan : " + e.getMessage());
        }
    }

    public void updateBookAvaliable(int bookId, boolean avaliable) {
        try {
            String updateSql = "UPDATE BOOK SET ISAVALIABLE = ? WHERE BOOKID = ?";
            PreparedStatement pstmt = con.prepareStatement(updateSql);
            pstmt.setBoolean(1, avaliable);
            pstmt.setInt(2, bookId);
            pstmt.executeUpdate();
            System.out.println("Updated Successfully book");
        } catch (Exception e) {
            System.out.println("Failed to update book : " + e.getMessage());
        }
    }
}