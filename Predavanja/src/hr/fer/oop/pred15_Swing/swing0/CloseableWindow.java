package hr.fer.oop.pred15_Swing.swing0;

import javax.swing.*;
import java.lang.reflect.InvocationTargetException;

public class CloseableWindow extends JFrame {
    public CloseableWindow() {
        JLabel label = new JLabel("Hello from Swing GUI.");
        add(label);
        setSize(200, 100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Closeable Window");
    }

    public static void main(String[] args) throws InterruptedException, InvocationTargetException {
        SwingUtilities.invokeAndWait(() ->
        {
            CloseableWindow window = new CloseableWindow();
            window.setLocation(600 ,300);
            window.setVisible(true);
        });
    }
}
