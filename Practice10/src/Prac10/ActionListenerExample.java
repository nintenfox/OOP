package Prac10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ActionListenerExample {
    public static void main(String [] args) {
        JFrame frame = new JFrame("ActionListener Example");
        final JTextField textField = new JTextField();
        textField.setBounds(50, 50, 250, 20);
        JButton button = new JButton("Click Here");
        button.setBounds(50, 100, 60, 30);
        button.setSize(100, 50);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("Добро пожаловать в мир Джава!");
            }
        });
        frame.add(button);
        frame.add(textField);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
