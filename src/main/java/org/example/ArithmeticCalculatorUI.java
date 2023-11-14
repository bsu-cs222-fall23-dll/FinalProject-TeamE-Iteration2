/*
Authors: Sunghoo Hong, David Chen, Alexander Bousman

First Iteration: Operates a standard arithmetic calculator that can do addition, subtraction, multiplication, and division

Second Iteration: Operates a graphing calculator that can draw basic graphs such as x^2, 5x, x^(1/2) based on the user's input

Advanced features such as trigonometry and calculus will be added later in the third iteration
*/

package org.example;

// import necessary libraries for UI design
import javax.swing.*;
import java.awt.*;

public class ArithmeticCalculatorUI
{
    // Variable 'textDisplay' is to display what the user inputs and the result of the calculation
    private final JTextField textDisplay;
    // Initiate variable 'firstOperand' that will store the first part of user's input
    private double firstOperand = 0;
    private String operator = "";
    private boolean startNewInput = true;

    // Calculator UI Design
    public ArithmeticCalculatorUI()
    {
        // Calculator Frame Design
        JFrame calculator = new JFrame("Calculator"); // initiate new JFrame
        calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set close operation that closes the application when the user pushes 'close' button
        calculator.setSize(400,560); // set the size of JFrame as 400 by 560
        calculator.setLayout(new BorderLayout()); // set the layout of JFrame

        // textDisplay Design (Font, Size, Location)
        textDisplay = new JTextField(); // set variable 'textDisplay' as a field that display text
        textDisplay.setFont(new Font("default", Font.PLAIN, 60)); // set the size and font of the text in the field
        textDisplay.setHorizontalAlignment(JTextField.RIGHT); // set the location of the text in the field
        calculator.add(textDisplay, BorderLayout.NORTH); // add textDisplay to the JFrame created at the North of JFrame

        // Buttons Design
        JPanel buttonPanel = new JPanel(); // initiate the button panel
        buttonPanel.setLayout(new GridLayout(6,4)); // set the number of buttons
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
            button.setFont(new Font("default", Font.PLAIN, 25)); // set the size and font of button labels
            button.addActionListener(new ButtonClickListener()); // enable buttons to do action based on the user's input
            buttonPanel.add(button); // add button labels to the button panel
        }

        calculator.add(buttonPanel, BorderLayout.CENTER); // add buttonPanel to the JFrame and set the location of buttons
    }
}