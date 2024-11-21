package com.library.management.gui;

import com.library.management.db.LoanTable;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;

class ReturnPanel extends Panel {

    private final Panels bookIdPanel;
    private final Label returnDate;
    private final Button addReturnBtn;

    ReturnPanel() {
        setLayout(new GridLayout(4, 1));
        setBackground(Color.GRAY);
        setSize(500, 350);
        bookIdPanel = new Panels("Book Id : ", Color.BLACK);
        returnDate = new Label("Return Date : " + LocalDate.now().toString());
        addReturnBtn = new Button("Return Book");
        addReturnBtn.addActionListener((@SuppressWarnings("unused") ActionEvent ae) -> {
            String bookID = bookIdPanel.getText();
            LoanTable.returnBook(bookID);
        });
        add(bookIdPanel);
        add(returnDate);
        add(addReturnBtn);
    }
}
