package org.example;

// Import necessary libraries for UI design

import javax.swing.*;
import java.awt.*;

public class Calculator
{
    public static GraphPlotter plotter; // Initiate plotter to plot the graph
    public static JTextField equationField; // Initiate a text field 'equationField'
    public static JPanel graphingCalculatorPanel; // Initiate a JPanel 'graphingCalculatorPanel'
    public static JPanel regularCalculatorPanel; // Initiate a JPanel 'regularCalculatorPanel'

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(Calculator::createAndShowGUI);
    }

    private static void createAndShowGUI()
    {
        JFrame calculator = new JFrame("Calculator"); // Create a JFrame 'calculator'
        calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Set close operation that closes the application when the user pushes 'close' button
        calculator.setSize(600, 400); // Set the size of the JFrame as 600 by 400

        JTabbedPane tabs = new JTabbedPane(); // Create a tabbed JPanel to separate graphing part and a regular calculator

        // Graphing Calculator Panel
        GraphingCalculator graphingCalculator = new GraphingCalculator();
        graphingCalculatorPanel = new JPanel(new BorderLayout()); // Create a JPanel
        GraphingCalculator.setupGraphingCalculatorPanel(graphingCalculatorPanel); // Complete the set-up of the panel by using the method 'setupGraphingCalculatorPanel'
        tabs.addTab("Graphing Calculator", graphingCalculatorPanel); // Add 'graphingCalculatorPanel' as one tab of the calculatorPanel

        // Regular Calculator Panel
        RegularCalculator regularCalculator = new RegularCalculator();
        regularCalculatorPanel = new JPanel(new BorderLayout()); // Create a JPanel
        RegularCalculator.setupRegularCalculatorPanel(regularCalculatorPanel); // Complete the set-up of the panel by using the method 'setupRegularCalculatorPanel'
        tabs.addTab("Regular Calculator", regularCalculatorPanel); // Add 'regularCalculatorPanel' as one tab of the calculatorPanel

        calculator.add(tabs); // Add the tabbed Panel to the JFrame
        calculator.setVisible(true); // Make the JFrame visible
    }
}