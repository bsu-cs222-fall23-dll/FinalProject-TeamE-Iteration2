package org.example;

import javax.swing.*;
import java.awt.*;

public class GraphingCalculator
{

    public static void setupGraphingCalculatorPanel(JPanel panel)
    {
        JPanel topPanel = new JPanel(); // Create a JPanel to let users write equation
        Calculator.equationField = new JTextField(20); // Create a JTextField to display the user's input
        JButton plotButton = new JButton("Plot"); // Create a JButton to let users plot the graph
        topPanel.add(Calculator.equationField); // Add the JTextField to the created JPanel
        topPanel.add(plotButton); // Add the JButton to the created JPanel
        panel.add(topPanel, BorderLayout.NORTH); // Add the JPanel to the bigger JPanel and set the location in NORTH

        // Create a JPanel to plot the graph
        JPanel graphPanel = new JPanel()
        {
            @Override
            protected void paintComponent(Graphics g)
            {
                super.paintComponent(g);
                drawGrid(g);
                drawAxes(g);

                if (Calculator.plotter != null)
                {
                    Calculator.plotter.drawPlot((Graphics2D) g);
                }
            }

            // drawGrid method to draw the grid lines
            private void drawGrid(Graphics g)
            {
                int width = getWidth(); // Get the length of width of the JPanel
                int height = getHeight(); // Get the length of height of the JPanel
                int centerX = width / 2; // Set the center of x-axis
                int centerY = height / 2; // Set the center of y-axis
            }
        };


    }
}