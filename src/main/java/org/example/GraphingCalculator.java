package org.example;

// Import necessary libraries for UI design
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphingCalculator
{
    private static GraphPlotter plotter; // Initiate plotter to plot the graph
    private static JTextField equationField; // Initiate a text field 'equationField'
    public static JPanel graphingCalculatorPanel; // Initiate a JPanel 'graphingCalculatorPanel'
    public static JPanel regularCalculatorPanel; // Initiate a JPanel 'regularCalculatorPanel'

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(GraphingCalculator::createAndShowGUI);
    }

    private static void createAndShowGUI()
    {
        JFrame calculator = new JFrame("Graphing Calculator"); // Create a JFrame 'calculator'
        calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Set close operation that closes the application when the user pushes 'close' button
        calculator.setSize(600, 400); // Set the size of the JFrame as 600 by 400

        JTabbedPane tabs = new JTabbedPane(); // Create a tabbed JPanel to separate graphing part and a regular calculator

        // Graphing Calculator Panel
        graphingCalculatorPanel = new JPanel(new BorderLayout()); // Create a JPanel
        setupGraphingCalculatorPanel(graphingCalculatorPanel); // Complete the set-up of the panel by using the method 'setupGraphingCalculatorPanel'
        tabs.addTab("Graphing Calculator", graphingCalculatorPanel); // Add 'graphingCalculatorPanel' as one tab of the calculatorPanel

        // Arithmetic Calculator Panel
        regularCalculatorPanel = new JPanel(new BorderLayout()); // Create a JPanel
        setupRegularCalculatorPanel(regularCalculatorPanel); // Complete the set-up of the panel by using the method 'setupRegularCalculatorPanel'
        tabs.addTab("Regular Calculator", regularCalculatorPanel); // Add 'regularCalculatorPanel' as one tab of the calculatorPanel
    }

    private static void setupRegularCalculatorPanel(JPanel arithmeticCalculatorPanel) {
    }

    private static void setupGraphingCalculatorPanel(JPanel graphingCalculatorPanel) {
    }
}