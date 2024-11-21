package com.library.management.gui;

import com.library.management.db.UserTable;
import java.awt.*;
import java.awt.event.*;

class UserPanel extends Panel {

    private Panels userIdPanel, userNamePanel, userAddressPanel, userEmailPanel, userPhonePanel;
    private final Button addUserBtn;

    UserPanel() {
        setLayout(null);
        setBackground(Color.BLUE);

        userIdPanel = new Panels("User Id : ", Color.WHITE);
        userIdPanel.setBounds(350, 30, 300, 40);

        userNamePanel = new Panels("User Name : ", Color.WHITE);
        userNamePanel.setBounds(350, 80, 300, 40);

        userAddressPanel = new Panels("Address : ", Color.WHITE);
        userAddressPanel.setBounds(350, 130, 300, 40);

        userEmailPanel = new Panels("Email : ", Color.WHITE);
        userEmailPanel.setBounds(350, 180, 300, 40);

        userPhonePanel = new Panels("Phone : ", Color.WHITE);
        userPhonePanel.setBounds(350, 230, 300, 40);

        addUserBtn = new Button("Add User");
        addUserBtn.setBounds(350, 290, 300, 40);
        addUserBtn.setFont(new Font("Arial",Font.BOLD, 18));
        addUserBtn.setForeground(Color.BLUE);
        addUserBtn.addActionListener((@SuppressWarnings("unused") ActionEvent ae) -> {
            String[] user = new String[5];
            user[0] = userIdPanel.getText();
            user[1] = userNamePanel.getText();
            user[2] = userAddressPanel.getText();
            user[3] = userEmailPanel.getText();
            user[4] = userPhonePanel.getText();
            UserTable.insertUser(user);
        });

        add(userIdPanel);
        add(userNamePanel);
        add(userAddressPanel);
        add(userEmailPanel);
        add(userPhonePanel);
        add(addUserBtn);
    }
}
