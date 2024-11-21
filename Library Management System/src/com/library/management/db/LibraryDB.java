package com.library.management.db;

import java.sql.*;

public class LibraryDB {
    private final static String URL = "jdbc:oracle:thin:@localhost:1521:free";
    private final static String USERNAME = "ROOT";
    private final static String PASSWORD = "ROOT";
    private Connection con = null;

    public LibraryDB() {
        try {
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connected to DB successfully");
        } catch (SQLException e) {
            System.out.println("Error in connecting to DB : " + e.getMessage());
        }
    }

    public void assignConnection() {
        UserTable.con = con;
        BookTable.con = con;
        LoanTable.con = con;
    }
}