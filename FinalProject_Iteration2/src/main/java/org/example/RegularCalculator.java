package org.example;

import javax.swing.*;
import java.awt.*;

public class RegularCalculator
{
    public static JTextField textDisplay;
    public static double firstOperand;
    public static String operator;
    public static boolean startNewInput = true;

    public static void setupRegularCalculatorPanel(JPanel panel)
    {
        // textDisplay Design (Font, Size, Location)\
        textDisplay = new JTextField(20);
        textDisplay.setFont(new Font("default", Font.PLAIN, 40)); // set the size and font of the text in the field
        textDisplay.setHorizontalAlignment(JTextField.RIGHT); // set the location of the text in the field
        panel.add(textDisplay, BorderLayout.NORTH); // add textDisplay to the JFrame created at the North of JFrame

        // Buttons Design
        JPanel buttonPanel = new JPanel(); // initiate the button panel
        buttonPanel.setLayout(new GridLayout(6, 4)); // set the number of buttons
        // Button Layout
        String[] buttonLabels = {
                "%", "CE", "C", "DEL",
                "1/x", "x^2", "√", "/",
                "7", "8", "9", "X",
                "4", "5", "6", "-",
                "1", "2", "3", "+",
                "(-)", "0", ".", "="
        }; // set the button layout

        // Add Button Layout to buttonPanel
        for (String label : buttonLabels)
        {
            JButton button = new JButton(label); // initiate to edit each button labels
            button.setFont(new Font("default", Font.PLAIN, 15)); // set the size and font of button labels
            button.addActionListener(new ButtonClickListener()); // enable buttons to do action based on the user's input
            buttonPanel.add(button); // add button labels to the button panel
        }

        panel.add(buttonPanel, BorderLayout.CENTER); // add buttonPanel to the JFrame and set the location of buttons at the CENTER
    }
}
