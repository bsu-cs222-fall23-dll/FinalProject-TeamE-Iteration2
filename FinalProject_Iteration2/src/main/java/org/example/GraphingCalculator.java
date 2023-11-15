package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphingCalculator
{
    public static JPanel graphPanel;

    public static void setupGraphingCalculatorPanel(JPanel panel)
    {
        JPanel topPanel = new JPanel(); // Create a JPanel to let users write equation
        Calculator.equationField = new JTextField(20); // Create a JTextField to display the user's input
        JButton plotButton = new JButton("Plot"); // Create a JButton to let users plot the graph
        topPanel.add(Calculator.equationField); // Add the JTextField to the created JPanel
        topPanel.add(plotButton); // Add the JButton to the created JPanel
        panel.add(topPanel, BorderLayout.NORTH); // Add the JPanel to the bigger JPanel and set the location in NORTH

        // Create a JPanel to plot the graph
        graphPanel = new JPanel()
        {
            @Override
            protected void paintComponent(Graphics g)
            {
                super.paintComponent(g);

                if (GraphingCalculator.graphPanel != null)
                {
                    drawGrid(g);
                    drawAxes(g);
                }

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
                g.setColor(Color.BLACK); // Set the color of grid lines as BLACK

                // Draw the vertical grid lines
                for (int x = centerX; x < width; x += 10)
                {
                    g.drawLine(x, 0, x, height);
                }
                for (int x = centerX; x > 0; x -= 10)
                {
                    g.drawLine(x, 0, x, height);
                }

                // Draw the horizontal grid lines
                for (int y = centerY; y < height; y += 10)
                {
                    g.drawLine(0, y, width, y);
                }
                for (int y = centerY; y > 0; y -= 10)
                {
                    g.drawLine(0, y, width, y);
                }
            }

            // drawAxes method to draw the axis lines
            private void drawAxes(Graphics g)
            {
                int width = getWidth(); // Get the length of width of JPanel
                int height = getHeight(); // Get the length of height of JPanel
                g.setColor(Color.RED); // Set the color of x-axis line as RED
                g.drawLine(0, height / 2, width, height / 2); // Draw the x-axis line
                g.setColor(Color.RED); // Set teh color of y-axis line as RED
                g.drawLine(width / 2, 0, width / 2, height); // Draw the y-axis line
            }
        };

        graphPanel.setBackground(Color.WHITE); // Set the background color of graphPanel as WHITE
        panel.add(graphPanel, BorderLayout.CENTER); // Add graphPanel to the big panel and locate it at the CENTER

        // Add actions to the plotButton to plot the graph
        Calculator.plotter = new GraphPlotter(graphPanel.getSize());

        plotButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Dimension currentGraphSize = graphPanel.getSize();

                if (Calculator.plotter != null)
                {
                    Calculator.plotter.setGraphSize(currentGraphSize);

                    String equation = Calculator.equationField.getText();
                    Calculator.plotter.computePlotPoints(equation, -300, 300, 1);
                    graphPanel.repaint();
                }
            }
        });
    }
}
