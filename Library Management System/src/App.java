import java.awt.*;
import java.awt.event.*;

import com.library.management.components.Components;

public class App {

    public App() {
        Components components = new Components();
        Frame frame = components.getFrame();
        Panel panel = components.getPanel();
        Button userBtn = components.getBtn("User Registration", 75, Color.BLUE, Color.WHITE);
        Button bookBtn = components.getBtn("Book Registration", 125, Color.yellow, Color.RED);
        Button borrowBtn = components.getBtn("Borrow Book", 175, Color.RED, Color.WHITE);
        Button returnBtn = components.getBtn("Return Book", 225, Color.DARK_GRAY, Color.WHITE);
        Panel bookPanel = components.getBookPanel();
        Panel userPanel = components.getUserPanel();
        panel.add(userBtn);
        panel.add(bookBtn);
        panel.add(borrowBtn);
        panel.add(returnBtn);
        panel.add(bookPanel);
        frame.add(panel);
        userBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                panel.remove(bookPanel);
                panel.add(userPanel);
            }
        });
    }

    public static void main(String[] args) {
        new App();
    }
}