package Practice12;

import javax.swing.*;
import java.awt.*;

public class BorderExample extends JFrame {
    JPanel [] panel = new JPanel[12];

    public BorderExample () {
        setLayout(new GridLayout(4, 5));
        for (int i = 0; i < panel.length; i++) {
            int r = (int) (Math.random() * 255);
            int b = (int) (Math.random() * 255);
            int g = (int) (Math.random() * 255);

            panel [i] = new JPanel();
            panel [i].setBackground(new Color(r, g, b));

            add(panel[i]);
        }
        panel [4].setLayout(new BorderLayout());
        panel [4].add(new JButton("WEST"), BorderLayout.WEST);
        panel [4].add(new JButton("EAST"), BorderLayout.EAST);
        panel [4].add(new JButton("SOUTH"), BorderLayout.SOUTH);
        panel [4].add(new JButton("NORTH"), BorderLayout.NORTH);
        panel [4].add(new JButton("CENTER"), BorderLayout.CENTER);

        panel [10].setLayout(new FlowLayout());
        panel [10].add(new JButton("one"));
        panel [10].add(new JButton("two"));
        panel [10].add(new JButton("three"));
        panel [10].add(new JButton("four"));
        panel [10].add(new JButton("five"));

        setSize(800, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BorderExample();
    }
}
