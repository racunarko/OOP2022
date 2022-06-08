package hr.fer.oop.pred15_Swing.swing0;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.InvocationTargetException;

public class WindowWithPictureLabel extends JFrame {
    public WindowWithPictureLabel() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Picture");

        ImageIcon image = new ImageIcon("Predavanja/src/hr/fer/oop/pred15_Swing/fer.jpg");
        JLabel label = new JLabel(image);
        add(label, BorderLayout.CENTER);
    }

    public static void main(String[] args) throws InterruptedException, InvocationTargetException {
        SwingUtilities.invokeAndWait(() ->
        {
            WindowWithPictureLabel window = new WindowWithPictureLabel();
            window.setLocation(20, 20);
            window.pack();
            window.setVisible(true);
        });
    }
}
