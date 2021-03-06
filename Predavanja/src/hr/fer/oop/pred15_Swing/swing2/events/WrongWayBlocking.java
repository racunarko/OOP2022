package hr.fer.oop.pred15_Swing.swing2.events;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class WrongWayBlocking extends JFrame {
    JButton btnAction = new JButton();
    JProgressBar pbProgress = new JProgressBar();

    public WrongWayBlocking() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        pbProgress.setMaximum(10);
        pbProgress.setMinimum(0);
        btnAction.setText("Start");
        btnAction.addActionListener(e -> {
            btnAction_actionPerformed(e);
        });
        add(btnAction, BorderLayout.WEST);
        add(pbProgress, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            WrongWayBlocking frame = new WrongWayBlocking();
            frame.pack();
            frame.setVisible(true);
        });
    }

    private void btnAction_actionPerformed(ActionEvent e) {
        pbProgress.setValue(0);
        for (int i = 0; i <= 10; i++) {
            pbProgress.setValue(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ie) {

            }
        }
    }
}
