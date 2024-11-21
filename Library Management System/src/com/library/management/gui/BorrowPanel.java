package com.library.management.gui;

import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;

import com.library.management.db.LoanTable;

class BorrowPanel extends Panel {
    private Panels userIdPanel, bookIdPanel;
    private Label borrowDate;
    private Button addBorrowBtn;

    BorrowPanel() {
        setLayout(new GridLayout(4, 1));
        setBackground(Color.YELLOW);
        setSize(500, 350);
        userIdPanel = new Panels("User Id : ", Color.WHITE);
        bookIdPanel = new Panels("Book Id : ",);
        borrowDate = new Label("Borrow Date : " + LocalDate.now().toString());
        addBorrowBtn = new Button("Borrow Book");
        addBorrowBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String[] loan = new String[2];
                loan[0] = userIdPanel.getText();
                loan[1] = bookIdPanel.getText();
                LoanTable.borrowBook(loan);
            }
        });
        add(userIdPanel);
        add(bookIdPanel);
        add(borrowDate);
        add(addBorrowBtn);
    }
}