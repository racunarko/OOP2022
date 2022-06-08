package hr.fer.oop.pred15_Swing.swing0;

import javax.swing.*;
import java.lang.reflect.InvocationTargetException;

public class FirstWindow extends JFrame {

    public FirstWindow() {
        JLabel label = new JLabel("Hello from Swing GUI");
         add(label);
         setSize(200, 100);
    }

    public static void main(String[] args) {
        try {
            SwingUtilities.invokeAndWait(new Runnable() {
                @Override
                public void run() {
                    FirstWindow window = new FirstWindow();
                    window.setLocation(20, 20);
                    window.setVisible(true);
                }
            });
        } catch (InterruptedException | InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println("Main program continues...");
    }
}
