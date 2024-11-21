package com.library.management.gui;

import com.library.management.db.LoanTable;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;

class BorrowPanel extends Panel {

    private Panels userIdPanel, bookIdPanel;
    private final Label borrowDate;
    private final Button addBorrowBtn;

    BorrowPanel() {
        setLayout(null);
        setBackground(Color.GREEN);

        userIdPanel = new Panels("User Id : ", Color.BLUE);
        userIdPanel.setBounds(350, 70, 300, 40);

        bookIdPanel = new Panels("Book Id : ", Color.BLUE);
        bookIdPanel.setBounds(350, 120, 300, 40);

        borrowDate = new Label("Borrow Date : " + LocalDate.now().toString());
        borrowDate.setFont(new Font("Arial", Font.PLAIN, 18));
        borrowDate.setForeground(Color.BLUE);
        borrowDate.setBounds(360, 170, 300, 40);

        addBorrowBtn = new Button("Borrow Book");
        addBorrowBtn.setBounds(350, 230, 300, 40);
        addBorrowBtn.setForeground(Color.BLUE);
        addBorrowBtn.setFont(new Font("Arial",Font.BOLD, 18));
        addBorrowBtn.addActionListener((@SuppressWarnings("unused") ActionEvent ae) -> {
            String[] loan = new String[2];
            loan[0] = userIdPanel.getText();
            loan[1] = bookIdPanel.getText();
            LoanTable.borrowBook(loan);
        });
        
        add(userIdPanel);
        add(bookIdPanel);
        add(borrowDate);
        add(addBorrowBtn);
    }
}
