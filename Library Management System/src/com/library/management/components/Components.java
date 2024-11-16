package com.library.management.components;

import java.awt.*;
import java.awt.event.*;
import java.io.File;

import javax.imageio.ImageIO;

public class Components {
    public Frame getFrame() {
        return new Frames();
    }

    public Button getBtn(String label, int y, Color bgColor, Color fgColor) {
        return new Btn(label, y, bgColor, fgColor);
    }

    public Panel getPanel() {
        return new Panels();
    }

    public Panel getUserPanel() {
        return new UserPanel();
    }

    public Panel getBookPanel() {
        return new BookPanel();
    }

};

class Frames extends Frame {
    public Frames() {
        setTitle("LMS");
        setSize(1000, 500);
        setResizable(false);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}

class Btn extends Button {
    public Btn(String label, int y, Color bgColor, Color fgColor) {
        setLabel(label);
        setBounds(35, y, 125, 30);
        setBackground(bgColor);
        setForeground(fgColor);
        setFont(new Font("Arial", Font.BOLD, 12));
    }
}

class Panels extends Panel {
    public Panels() {
        setSize(1000, 500);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(bgImageLoad(), 0, 0, getWidth(), getHeight(), this);
    }

    public Image bgImageLoad() {
        final String path = "D:\\B.TECH\\2-1\\OOPS JAVA\\CBP\\Library Management System\\src\\Assests\\bgc.png";
        try {
            return ImageIO.read(new File(path));
        } catch (Exception e) {
            System.out.println("Error in image : " + e.getMessage());
            return null;
        }
    }
}

class UserPanel extends Panel {
    public UserPanel() {
        setBackground(Color.red);
        setBounds(300, 100, 700, 300);
    }
}

class BookPanel extends Panel {
    public BookPanel() {
        setBackground(Color.BLACK);
        setBounds(300, 100, 700, 300);
    }
}