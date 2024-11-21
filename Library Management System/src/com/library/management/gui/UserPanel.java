package com.library.management.gui;

import java.awt.*;
import java.awt.event.*;

import com.library.management.db.UserTable;

class UserPanel extends Panel {
    private Panels userIdPanel, userNamePanel, userAddressPanel, userEmailPanel, userPhonePanel;
    private Button addUserBtn;

    UserPanel() {
        setLayout(null);
        setBackground(Color.BLUE);
        userIdPanel = new Panels("User Id : ", Color.WHITE);
        userIdPanel.setBounds(450, 100, 250, 40);
        userNamePanel = new Panels("User Name : ", Color.WHITE);
        userNamePanel.setBounds(450, 150, 250, 40);
        userAddressPanel = new Panels("Address : ", Color.WHITE);
        userIdPanel.setBounds(450, 200, 250, 40);
        userEmailPanel = new Panels("Email : ", Color.WHITE);
        userIdPanel.setBounds(450, 250, 250, 40);
        userPhonePanel = new Panels("Phone : ", Color.WHITE);
        userIdPanel.setBounds(450, 300, 250, 40);
        addUserBtn = new Button("Add User");
        addUserBtn.setBounds(450, 350, 250, 40);
        addUserBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String[] user = new String[5];
                user[0] = userIdPanel.getText();
                user[1] = userNamePanel.getText();
                user[2] = userAddressPanel.getText();
                user[3] = userEmailPanel.getText();
                user[4] = userPhonePanel.getText();
                UserTable.insertUser(user);
            }
        });
        add(userIdPanel);
        add(userNamePanel);
        add(userAddressPanel);
        add(userEmailPanel);
        add(userPhonePanel);
        add(addUserBtn);
    }
}
