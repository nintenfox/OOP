package Prac10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextAreaExample extends JFrame {
    JTextArea textArea = new JTextArea(10, 25);
    JButton button = new JButton("Add some text");
    public TextAreaExample () {
        super("Example");
        setSize(300, 300);
        setLayout(new FlowLayout());
        add(textArea);
        add(button);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        button.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String txt = JOptionPane.showInputDialog(
                                null, "Insert some text"
                        );
                        textArea.append(txt);
                    }
                }
        );
    }
    public static void main(String[] args) {
        new TextAreaExample().setVisible(true);
    }
}
