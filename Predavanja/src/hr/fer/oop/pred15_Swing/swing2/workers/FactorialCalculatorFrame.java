package hr.fer.oop.pred15_Swing.swing2.workers;

import hr.fer.oop.pred15_Swing.swing1.events.example1.SpringUtilities;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class FactorialCalculatorFrame extends JFrame {
    private JTextField tfNumber;
    private JLabel lResult;
    private JButton bCalculate;
    private JProgressBar progressBar;

    public FactorialCalculatorFrame() {
        JPanel panel = new JPanel();

        panel.setLayout(new SpringLayout());

        //row 0
        panel.add(new JLabel("Broj:", SwingConstants.RIGHT));

        tfNumber = new JTextField();
        tfNumber.setColumns(10);
        panel.add(tfNumber);

        //row 1
        panel.add(new JLabel("Pokreni izračun:", SwingConstants.RIGHT));

        bCalculate = new JButton();
        bCalculate.setText("Start");
        panel.add(bCalculate);

        bCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int number = Integer.parseInt(tfNumber.getText());

                    //reset GUI components
                    progressBar.setValue(0);
                    bCalculate.setEnabled(false);
                    lResult.setText("");

                    //schedule for exec on one of working threads
                    new CalculateFactorialTask(number).execute();

                    System.out.println("4. Izvodi li se unutar dretve Event Dispatch? " + SwingUtilities.isEventDispatchThread());
                } catch (NumberFormatException ex) {

                }
            }
        });

        //row 2
        panel.add(new JLabel("Napredak:", SwingConstants.RIGHT));

        progressBar = new JProgressBar();

        panel.add(progressBar);

        //row 3
        panel.add(new JLabel("Rezultat:", SwingConstants.RIGHT));

        lResult = new JLabel();

        panel.add(lResult);

        SpringUtilities.makeCompactGrid(panel,
                4, 2, 0, 0, 5, 5);

        this.add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                FactorialCalculatorFrame frame = new FactorialCalculatorFrame();
                frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
                frame.setTitle("Factorial Calculator Demo");
                frame.setBounds(500, 500, 400, 140);
                frame.setVisible(true);
            }
        });
    }

    private class CalculateFactorialTask extends SwingWorker<Long, Integer> {
        private final int number;

        public CalculateFactorialTask(int number) {
            this.number = number;
        }

        @Override
        protected Long doInBackground() throws Exception {
            long factorial = 1L;

            System.out.println("1. Izvodim li se unutar dretve Event Dispatch? " + SwingUtilities.isEventDispatchThread());

            for (short i = 1; i <= number; i++) {
                if (Long.MAX_VALUE / i < factorial) {
                    // skip if overflow
                    factorial = 0L;
                    break;
                }
                factorial = factorial * i;

                //slow down the thread
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                //publish progress update
                publish((int) Math.round((i * 100) / number));
            }

            return factorial;
        }

        @Override
        protected void process(List<Integer> chunks) {
            for (int progress : chunks) {
                progressBar.setValue(progress);
            }
            System.out.println("2. Izvodim li se unutar dretve Event Dispatch? " + SwingUtilities.isEventDispatchThread());
        }

        @Override
        protected void done() {
            try {
                lResult.setText(String.valueOf(this.get()));
            } catch (ExecutionException | InterruptedException e) {
            }

            //enable the button
            bCalculate.setEnabled(true);

            System.out.println("3. Izvodim li se unutar dretve Event Dispatch? " + SwingUtilities.isEventDispatchThread());
        }
    }


}
