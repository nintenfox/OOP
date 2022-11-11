package Prac10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LabExample extends JFrame {
    JTextField textField1 = new JTextField(10);
    JTextField textField2 = new JTextField(10);
    JButton button = new JButton("+");
    JButton button1 = new JButton("-");
    JButton button2 = new JButton("*");
    JButton button3 = new JButton("/");
    Font font = new Font("Times new roman", Font.BOLD, 20);

    LabExample () {
        super("Calculator");
        setLayout(new FlowLayout());
        setSize(250, 150);

        add(new JLabel("First number"));
        add(textField1);

        add(new JLabel("Second number"));
        add(textField2);

        add(button);
        add(button1);
        add(button2);
        add(button3);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double x1 = Double.parseDouble(textField1.getText().trim());
                    double x2 = Double.parseDouble(textField2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = " + (x1 + x2), "Result",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                catch (Exception e1) {
                    JOptionPane.showMessageDialog(null, "Error in numbers!", "Alert",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double x1 = Double.parseDouble(textField1.getText().trim());
                    double x2 = Double.parseDouble(textField2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = " + (x1 - x2), "Result",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                catch (Exception e1) {
                    JOptionPane.showMessageDialog(null, "Error in numbers!", "Alert",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double x1 = Double.parseDouble(textField1.getText().trim());
                    double x2 = Double.parseDouble(textField2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = " + (x1 * x2), "Result",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                catch (Exception e1) {
                    JOptionPane.showMessageDialog(null, "Error in numbers!", "Alert",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double x1 = Double.parseDouble(textField1.getText().trim());
                    double x2 = Double.parseDouble(textField2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = " + (x1 / x2), "Result",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                catch (Exception e1) {
                    JOptionPane.showMessageDialog(null, "Error in numbers!", "Alert",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {
    new LabExample();
}
}
