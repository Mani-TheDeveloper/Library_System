package com.library.management.gui;

import java.awt.*;
import java.awt.event.*;

import com.library.management.db.BookTable;

class BookPanel extends Panel {
    private Panels bookIdPanel, bookTitlePanel, bookAuthorPanel, bookBranchPanel;
    private Button addBookBtn;

    BookPanel() {
        setLayout(new GridLayout(5, 1));
        setBackground(Color.YELLOW);
        setSize(500, 350);
        bookIdPanel = new Panels("Book Id : ");
        bookTitlePanel = new Panels("Title : ");
        bookAuthorPanel = new Panels("Author : ");
        bookBranchPanel = new Panels("Branch : ");
        addBookBtn = new Button("Add Book");
        addBookBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String[] book = new String[4];
                book[0] = bookIdPanel.getText();
                book[1] = bookTitlePanel.getText();
                book[2] = bookAuthorPanel.getText();
                book[3] = bookBranchPanel.getText();
                BookTable.insertBook(book);
            }
        });
        add(bookIdPanel);
        add(bookTitlePanel);
        add(bookAuthorPanel);
        add(bookBranchPanel);
        add(addBookBtn);
    }
}
