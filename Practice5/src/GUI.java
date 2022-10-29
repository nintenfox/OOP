import javax.swing.*;
import java.awt.*;

public class GUI {
    public static void main (String[] args) {
        JFrame frame = new JFrame("First Attempt");

        JPanel panel_def = new JPanel();
        panel_def.setBackground(Color.black);

        JPanel panel = new JPanel();
        panel.setBackground(Color.cyan);

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.pink);
        panel.setPreferredSize(new Dimension(200, 100));

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.yellow);

        JButton button = new JButton("Привет МИР!");
        button.setBounds(0,0,300,60);
        button.setForeground(Color.magenta);
        button.setSize(150, 30);

        JButton button1 = new JButton("Пока МИР!");
        button1.setBounds(0,0, 300,60);
        button1.setSize(150, 30);
        button1.setForeground(Color.white);
        button1.setBackground(Color.darkGray);

        ImageIcon icon = new ImageIcon("H:\\ninte\\Загрузки\\ocean.jpg");
        ImageIcon icon1 = new ImageIcon("H:\\ninte\\Загрузки\\baikal.jpg");

        JLabel label = new JLabel(icon);
        label.setPreferredSize(new Dimension(350, 200));


        JLabel label1 = new JLabel(icon1);
        label1.setPreferredSize(new Dimension(350, 200));

        panel.add(button);
        panel1.add(button1);
        panel2.add(label);
        panel2.add(label1);
        panel_def.add(panel);
        panel_def.add(panel1);
        panel_def.add(panel2);

        frame.setContentPane(panel_def);
        frame.setSize(900,900);
        //frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
