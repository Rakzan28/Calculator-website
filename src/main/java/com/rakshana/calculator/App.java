package com.rakshana.calculator;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 * Swing-based Calculator Application
 */
public class App extends JFrame {

    private JTextField display;
    private CalculatorEngine calculator;
    private static final int BUTTON_SIZE = 60;

    public App() {
        calculator = new CalculatorEngine();
        setupUI();
    }

    private void setupUI() {
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
        setLocationRelativeTo(null);
        setResizable(false);

        // Display
        display = new JTextField();
        display.setFont(new Font("Arial", Font.PLAIN, 24));
        display.setEditable(false);
        display.setText("0");
        display.setHorizontalAlignment(JTextField.RIGHT);

        // Main panel
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        mainPanel.add(display, BorderLayout.NORTH);

        // Button panel
        JPanel buttonPanel = createButtonGrid();
        mainPanel.add(buttonPanel, BorderLayout.CENTER);

        add(mainPanel);
        setVisible(true);
    }

    private JPanel createButtonGrid() {
        JPanel panel = new JPanel(new GridLayout(4, 5, 10, 10));

        String[] buttons = {
            "7", "8", "9", "/", "C",
            "4", "5", "6", "*", "Back",
            "1", "2", "3", "-", "=",
            "0", ".", "+", "Clear", ""
        };

        for (String btnText : buttons) {
            if (!btnText.isEmpty()) {
                JButton btn = new JButton(btnText);
                btn.setFont(new Font("Arial", Font.PLAIN, 18));
                btn.setFocusPainted(false);
                btn.addActionListener(new ButtonClickListener(btnText));
                panel.add(btn);
            } else {
                panel.add(new JPanel());
            }
        }

        return panel;
    }

    private class ButtonClickListener implements ActionListener {

        private String buttonText;

        ButtonClickListener(String text) {
            this.buttonText = text;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String result = calculator.processInput(buttonText, display.getText());
                display.setText(result);
            } catch (Exception ex) {
                display.setText("Error");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new App());
    }
}
