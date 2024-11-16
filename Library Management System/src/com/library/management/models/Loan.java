package com.library.management.models;

import java.sql.Date;

public class Loan {
    private int loanId, userId, bookId;
    private Date borrowDate, returnDate;

    public Loan(int loanId, int userId, int bookId, Date borrowDate) {
        this.loanId = loanId;
        this.userId = userId;
        this.bookId = bookId;
        this.borrowDate = borrowDate;
        this.returnDate = null;
    }

    public int getLoanId() {
        return loanId;
    }

    public int getUserId() {
        return userId;
    }

    public int getBookId() {
        return bookId;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
}