package hr.fer.oop.pred15_Swing.swing1.events.example1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class EnterNameFrame extends JFrame {
        public static void main(String[] args) {
                try {
                        SwingUtilities.invokeAndWait(() -> {
                                EnterNameFrame frame = new EnterNameFrame();
                                frame.pack();
                                frame.setVisible(true);
                        });
                } catch (InterruptedException | InvocationTargetException e) {
                        throw new RuntimeException(e);
                }
        }

        public EnterNameFrame() {
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setBounds(10, 10, 500, 500); // location and size

                JPanel panel = (JPanel) getContentPane();
                panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

                JLabel lblTile = new JLabel("Title");
                lblTile.setHorizontalAlignment(SwingConstants.CENTER);
                panel.add(lblTile, BorderLayout.NORTH);

                JLabel lblName = new JLabel("Enter name:");
                panel.add(lblName, BorderLayout.WEST);

                JTextField textField = new JTextField();
                panel.add(textField, BorderLayout.CENTER);
                textField.setColumns(10);

                JPanel southPanel = new JPanel();
                panel.add(southPanel, BorderLayout.SOUTH);

                JButton btnOK = new JButton("OK");
                southPanel.add(btnOK);

                btnOK.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                JOptionPane.showMessageDialog(EnterNameFrame.this, "Hello" + textField.getText());
                        }
                });
        }
}
