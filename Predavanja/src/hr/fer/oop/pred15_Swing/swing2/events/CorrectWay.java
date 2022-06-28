package hr.fer.oop.pred15_Swing.swing2.events;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class CorrectWay extends JFrame {
    JButton btnAction = new JButton();
    JProgressBar pbProgress = new JProgressBar();

    public CorrectWay() {
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
            CorrectWay frame = new CorrectWay();
            frame.pack();
            frame.setVisible(true);
        });
    }

    private void btnAction_actionPerformed(ActionEvent e) {
        btnAction.setEnabled(false);
        pbProgress.setValue(0);
        new Thread(() -> {
            for (int i = 0; i <= 10; i++) {
                int progressValue = i;
                SwingUtilities.invokeLater(() -> pbProgress.setValue(progressValue));
                try {
                    Thread.sleep(500); // zaustavi izvodenje dretve na 500ms
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
            }
            SwingUtilities.invokeLater(() -> {
                btnAction.setEnabled(true);
            });
        }).start();
    }
}
