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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArithmeticCalculator
{
    // Variable 'textDisplay' is to display what the user inputs and the result of the calculation
    private final JTextField textDisplay;
    // Initiate variable 'firstOperand' that will store the first part of user's input
    private double firstOperand = 0;
    private String operator = "";
    private boolean startNewInput = true;

    // Calculator UI Design
    public ArithmeticCalculator()
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

        // Buttons Layout Design

    }
}