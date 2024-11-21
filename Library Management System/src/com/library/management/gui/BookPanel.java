package com.library.management.gui;

import com.library.management.db.BookTable;
import java.awt.*;
import java.awt.event.*;

class BookPanel extends Panel {

    private Panels bookIdPanel, bookTitlePanel, bookAuthorPanel, bookBranchPanel;
    private final Button addBookBtn;

    BookPanel() {
        setLayout(null);
        setBackground(Color.YELLOW);

        bookIdPanel = new Panels("Book Id : ", Color.RED);
        bookIdPanel.setBounds(350, 20, 300, 40);

        bookTitlePanel = new Panels("Title : ", Color.RED);
        bookTitlePanel.setBounds(350, 70, 300, 40);

        bookAuthorPanel = new Panels("Author : ", Color.RED);
        bookAuthorPanel.setBounds(350, 120, 300, 40);

        bookBranchPanel = new Panels("Branch : ", Color.RED);
        bookBranchPanel.setBounds(350, 170, 300, 40);

        addBookBtn = new Button("Add Book");
        addBookBtn.setBounds(350, 220, 300, 40);
        addBookBtn.addActionListener((@SuppressWarnings("unused") ActionEvent ae) -> {
            String[] book = new String[4];
            book[0] = bookIdPanel.getText();
            book[1] = bookTitlePanel.getText();
            book[2] = bookAuthorPanel.getText();
            book[3] = bookBranchPanel.getText();
            BookTable.insertBook(book);
        });
        add(bookIdPanel);
        add(bookTitlePanel);
        add(bookAuthorPanel);
        add(bookBranchPanel);
        add(addBookBtn);
    }
}
