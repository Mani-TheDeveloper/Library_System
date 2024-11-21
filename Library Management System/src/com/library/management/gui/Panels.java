package com.library.management.gui;

import java.awt.*;

class Panels extends Panel {
    private TextField textField = new TextField();
    private Label label;

    Panels(String labelName, Color fgColor) {
        setLayout(new BorderLayout());
        label = new Label(labelName);
        label.setForeground(fgColor);
        add(label, BorderLayout.WEST);
        add(textField, BorderLayout.CENTER);
    }

    String getText() {
        return textField.getText();
    }
}
