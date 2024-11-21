package com.library.management.gui;

import java.awt.*;

class Panels extends Panel {

    private final TextField textField = new TextField(20);
    private final Label label;

    Panels(String labelName, Color fgColor) {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        label = new Label(labelName);
        label.setFont(new Font("Arial", Font.PLAIN, 18));
        label.setForeground(fgColor);
        add(label);
        add(textField);
    }

    String getText() {
        return textField.getText();
    }
}
