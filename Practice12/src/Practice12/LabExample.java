package Practice12;

import javax.swing.*;
import java.awt.*;

public class LabExample extends JFrame {
    JTextField textField = new JTextField(10);

    Font font = new Font("Arial", Font.BOLD,20);
    LabExample () {
        super("Example");

        setLayout(new FlowLayout());

        setSize(250, 100);

        add(textField);

        textField.setForeground(Color.CYAN);
        textField.setFont(font);
        setVisible(true);
    }

    public static void main (String[] args) {
        new LabExample ();
    }
}
