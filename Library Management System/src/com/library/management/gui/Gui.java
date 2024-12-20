package com.library.management.gui;

import java.awt.*;
import java.awt.event.*;

public class Gui extends Frame {

    private final CardLayout cardLayout = new CardLayout();
    private final Panel mainPanel = new Panel(cardLayout), buttonPanel;

    public Gui() {
        setTitle("Library Management System");
        setLayout(new BorderLayout());
        setSize(1000, 500);
        setResizable(false);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                dispose();
                System.exit(0);
            }
        });
        buttonPanel = createButtonPanel();
        mainPanel.add(new UserPanel(), "userPanel");
        mainPanel.add(new BookPanel(), "bookPanel");
        mainPanel.add(new BorrowPanel(), "borrowPanel");
        mainPanel.add(new ReturnPanel(), "returnPanel");
        cardLayout.show(mainPanel, "borrowPanel");
        add(buttonPanel, BorderLayout.NORTH);
        add(mainPanel, BorderLayout.CENTER);
        setVisible(true);
    }

    private Panel createButtonPanel() {
        Panel panel = new Panel();
        panel.add(createButton("User Registration", Color.BLUE, Color.WHITE, "userPanel"));
        panel.add(createButton("Book Registration", Color.RED, Color.YELLOW, "bookPanel"));
        panel.add(createButton("Borrow Book", Color.GREEN, Color.BLUE, "borrowPanel"));
        panel.add(createButton("Return Book", Color.GRAY, Color.BLACK, "returnPanel"));
        return panel;
    }

    private Button createButton(String label, Color bgColor, Color fgColor, String panelName) {
        Button button = new Button(label);
        button.setBackground(bgColor);
        button.setForeground(fgColor);
        button.setFont(new Font("Arial", Font.BOLD, 24));
        button.addActionListener((@SuppressWarnings("unused") ActionEvent ae) -> {
            cardLayout.show(mainPanel, panelName);
        });
        return button;
    }
}
