package hr.fer.oop.pred15_Swing.swing1.layouts;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.InvocationTargetException;

public class BorderLayoutExample extends JFrame {
    public BorderLayoutExample() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new java.awt.BorderLayout());

        add(new JButton("Sjever"), BorderLayout.NORTH);
        add(new JButton("Zapad"), BorderLayout.WEST);
        add(new JButton("East"), BorderLayout.EAST);
        add(new JButton("Centar"), BorderLayout.CENTER);
        add(new JButton("Jug"), BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        try {
            SwingUtilities.invokeAndWait(new Runnable() {
                @Override
                public void run() {
                    BorderLayoutExample window = new BorderLayoutExample();
                    window.setLocation(20, 20);
                    window.pack();
                    window.setVisible(true);
                }
            });
        } catch (InterruptedException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
