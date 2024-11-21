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
        setLayout(null);
        setBackground(Color.GRAY);
        bookIdPanel = new Panels("Book Id : ", Color.BLACK);
        bookIdPanel.setBounds(350, 100, 300, 40);
        
        returnDate = new Label("Return Date : " + LocalDate.now().toString());
        returnDate.setFont(new Font("Arial", Font.PLAIN, 18));
        returnDate.setBounds(350, 150, 300, 40);
        

        addReturnBtn = new Button("Return Book");
        addReturnBtn.setFont(new Font("Arial", Font.BOLD, 18));
        addReturnBtn.setForeground(Color.BLACK);
        addReturnBtn.setBounds(350, 200, 300, 40);
        addReturnBtn.addActionListener((@SuppressWarnings("unused") ActionEvent ae) -> {
            String bookID = bookIdPanel.getText();
            LoanTable.returnBook(bookID);
        });
        add(bookIdPanel);
        add(returnDate);
        add(addReturnBtn);
    }
}
