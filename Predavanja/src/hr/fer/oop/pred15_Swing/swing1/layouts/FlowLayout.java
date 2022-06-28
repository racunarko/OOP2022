package hr.fer.oop.pred15_Swing.swing1.layouts;

import javax.swing.*;
import java.lang.reflect.InvocationTargetException;

public class FlowLayout extends JFrame {
    public FlowLayout() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new java.awt.FlowLayout());

        add(new JButton("Gumb 1"));
        add(new JButton("Gumb 2"));
        add(new JButton("3"));
        add(new JButton("Dugački naziv gumba 4"));
        add(new JButton("5"));
    }

    public static void main(String[] args) {
        try {
            SwingUtilities.invokeAndWait(new Runnable() {
                @Override
                public void run() {
                    FlowLayout window = new FlowLayout();
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
