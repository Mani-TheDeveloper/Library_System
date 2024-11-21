package com.library.management.gui;

import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;

import com.library.management.db.LoanTable;

class ReturnPanel extends Panel {
    private Panels bookIdPanel;
    private Label returnDate;
    private Button addReturnBtn;

    ReturnPanel() {
        setLayout(new GridLayout(4, 1));
        setBackground(Color.GRAY);
        setSize(500, 350);
        bookIdPanel = new Panels("Book Id : ", Color.BLACK);
        returnDate = new Label("Return Date : " + LocalDate.now().toString());
        addReturnBtn = new Button("Return Book");
        addReturnBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String bookID = bookIdPanel.getText();
                LoanTable.returnBook(bookID);
            }
        });
        add(bookIdPanel);
        add(returnDate);
        add(addReturnBtn);
    }
}