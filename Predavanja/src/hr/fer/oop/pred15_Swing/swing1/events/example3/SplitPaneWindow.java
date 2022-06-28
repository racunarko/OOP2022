package hr.fer.oop.pred15_Swing.swing1.events.example3;

import hr.fer.oop.pred15_Swing.swing1.events.example2.InputUserDataPanel;
import hr.fer.oop.pred15_Swing.swing1.events.example2.UserData;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Map;
import java.util.UUID;

public class SplitPaneWindow extends JFrame{
    private Map<String, UserData> userData;
    private InputUserDataPanel userDataPanel;
    private ActionListener toggleButtonListener;
    private JPanel buttonsPanel;
    private JSplitPane splitPane;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                SplitPaneWindow frame = new SplitPaneWindow();
                frame.setBounds(100,100,500,400);
                frame.setVisible(true);
            }
        });
    }

    public SplitPaneWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        add(splitPane, BorderLayout.CENTER);

        buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(0, 1));
        splitPane.setLeftComponent(buttonsPanel);

        userDataPanel = new InputUserDataPanel();
        splitPane.setRightComponent(userDataPanel);

        userData = UserDataFactory.getData();

        toggleButtonListener = (actionEvent) -> {
            JToggleButton selectedButton = (JToggleButton) actionEvent.getSource();
            deselectOthers(selectedButton);
            String uid = actionEvent.getActionCommand();
            userDataPanel.setUserData(userData.get(uid));
            selectedButton.setSelected(true);
        };

        for (Map.Entry<String, UserData> entry : userData.entrySet()) {
            JToggleButton button = new JToggleButton(entry.getValue().getFirstName() + " " + entry.getValue().getLastName());
            button.setActionCommand(entry.getKey());
            button.addActionListener(toggleButtonListener);
            buttonsPanel.add(button);
        }

        createToolbar();

        selectFirst();
    }

    private void selectFirst() {
        if (userData.size() > 0) {
            for (Component c : buttonsPanel.getComponents()) {
                if (c instanceof JToggleButton) {
                    ((JToggleButton) c).doClick();
                    break;
                }
            }
        }
        else {
            splitPane.setVisible(false);
        }
    }

    private void createToolbar() {
        JToolBar toolBar = new JToolBar();
        add(toolBar, BorderLayout.NORTH);

        JButton newUserData = new JButton("New");
        toolBar.add(newUserData);

        newUserData.addActionListener((actionEvent) -> {
            String uid = UUID.randomUUID().toString();
            userData.put(uid, new UserData());

            JToggleButton tb = new JToggleButton("New User Data");
            tb.setActionCommand(uid.toString());
            tb.addActionListener(toggleButtonListener);
            buttonsPanel.add(tb);
            if (userData.size() == 1) {
                 splitPane.getParent().revalidate();
                 splitPane.setVisible(true);
            } else {
                buttonsPanel.revalidate();
            }
            tb.doClick();
        });

        JButton deleteUserData = new JButton("Delete");
        toolBar.add(deleteUserData);
        deleteUserData.addActionListener((actionEvent) -> {
            JToggleButton selectedToggleButton = null;
            for (Component c : buttonsPanel.getComponents() ) {
                if(c instanceof JToggleButton) {
                    JToggleButton button = (JToggleButton) c;
                    if(button.isSelected()) {
                        selectedToggleButton = button;
                        break;
                    }
                }
            }
            if(selectedToggleButton != null) {
                buttonsPanel.remove(selectedToggleButton);
                userData.remove(selectedToggleButton.getActionCommand());
                buttonsPanel.revalidate();
                selectFirst();
            }
        });
    }

    private void deselectOthers(JToggleButton selectedButton) {
        for (Component c : selectedButton.getParent().getComponents()) {
            if (c instanceof JToggleButton) {
                JToggleButton button = (JToggleButton) c;
                if ((button != selectedButton) && button.isSelected()) {
                    String uid = button.getActionCommand();
                    UserData data = userDataPanel.getUserData();
                    userData.put(uid, data);
                    button.setText(data.getFirstName() + " " + data.getLastName());
                    button.setSelected(false);
                }
            }
        }
    }
}
