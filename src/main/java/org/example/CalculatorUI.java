/*
Authors: Sunghoo Hong, David Chen, Alexander Bousman

First Iteration: Operates a standard arithmetic calculator that can do addition, subtraction, multiplication, and division

Second Iteration: Operates a graphing calculator that can draw basic graphs such as x^2, 5x, x^(1/2) based on the user's input

Advanced features such as trigonometry and calculus will be added later in the third iteration
*/

package org.example;

// import necessary libraries for UI design
import java.awt.Graphics;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorUI {
    // Variable 'textDisplay' is to display what the user inputs and the result of the calculation
    public static JTextField textDisplay;
    public static double firstOperand = 0;
    public static String operator = "";
    public static boolean startNewInput = true;
    public static JButton graphButton;
    public static JPanel displayPanel;
    public static GraphPlotter plotter;

    // Calculator UI Design
    public CalculatorUI() {
        // Calculator Frame Design
        JFrame calculator = new JFrame("Calculator"); // initiate new JFrame
        calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set close operation that closes the application when the user pushes 'close' button
        calculator.setSize(600, 400); // set the size of JFrame as 400 by 560
        calculator.setLayout(new BorderLayout()); // set the layout of JFrame

        // textDisplay Design (Font, Size, Location)\

        JTextField expressionField = new JTextField(20);
        textDisplay = new JTextField(); // set variable 'textDisplay' as a field that display text
        textDisplay.setFont(new Font("default", Font.PLAIN, 40)); // set the size and font of the text in the field
        textDisplay.setHorizontalAlignment(JTextField.RIGHT); // set the location of the text in the field
        calculator.add(textDisplay, BorderLayout.NORTH); // add textDisplay to the JFrame created at the North of JFrame

        // Buttons Design
        JPanel buttonPanel = new JPanel(); // initiate the button panel
        buttonPanel.setLayout(new GridLayout(6, 4)); // set the number of buttons
        // Button Layout
        String[] buttonLabels = {
                "%", "CE", "C", "x",
                "1/x", "x^2", "√", "/",
                "7", "8", "9", "X",
                "4", "5", "6", "-",
                "1", "2", "3", "+",
                "(-)", "0", ".", "="
        }; // set the button layout

        // Add Button Layout to buttonPanel
        for (String label : buttonLabels) {
            JButton button = new JButton(label); // initiate to edit each button labels
            button.setFont(new Font("default", Font.PLAIN, 15)); // set the size and font of button labels
            button.addActionListener(new ButtonClickListener()); // enable buttons to do action based on the user's input
            buttonPanel.add(button); // add button labels to the button panel
        }

        calculator.add(buttonPanel, BorderLayout.EAST); // add buttonPanel to the JFrame and set the location of buttons

        graphPanel.setBackground(Color.WHITE); // set the background color of graphPanel as WHITE
        calculator.add(graphPanel, BorderLayout.CENTER); // add graphPanel to JFrame

        // 'graph' button panel
        displayPanel = new JPanel(); // initiate display panel to draw the graph
        displayPanel.setLayout(new GridLayout(1,1)); // set the number of button
        graphButton = new JButton("GRAPH"); // initiate graphButton to edit the layout
        graphButton.setFont(new Font("deafult", Font.PLAIN, 20)); // set the size and font of the button
       // graphButton.addActionListener(new GraphPlotter()); // enable button to draw the graph of the inputted equations
        displayPanel.add(graphButton); // add graphButton to the displayPanel
        calculator.add(displayPanel, BorderLayout.SOUTH); // add displayPanel to JFrame

        plotter = new GraphPlotter(displayPanel.getSize());

        calculator.setVisible(true); // make the JFrame visible
    }

    // Graph Part
    // Graph Panel with grid
    JPanel graphPanel = new JPanel() {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g); // use paintComponent to draw grids
            drawGrid(g); // draw grids using the method 'drawGrid'
            drawAxes(g); // draw axes using the method 'drawAxes'

            if (plotter != null)
            {
                plotter.drawPlot((Graphics2D) g);
            }
        }

        // drawAxes method
        private void drawAxes(Graphics g) {
            int width = graphPanel.getWidth(); // get width of graphPanel to draw x-axis
            int height = getHeight(); // get width of graphPanel to draw y-axis

            // x-axis
            g.setColor(Color.RED); // set the color of x-axis as RED
            g.drawLine(0, height / 2, width, height / 2); // draw x-axis

            // y-axis
            g.setColor(Color.RED); // set the color of y-axis as RED
            g.drawLine(width / 2, 0, width / 2, height); // draw y-axis
        }

        // drawGrid method
        private void drawGrid(Graphics g) {
            int width = graphPanel.getWidth(); // get width of graphPanel to define the center of x-axis
            int height = graphPanel.getHeight(); // get height of graphPanel to define the center of y-axis

            int centerX = width / 2; // define the center of x-axis
            int centerY = height / 2; // define the center of y-axis

            g.setColor(Color.black); // set color for grid lines

            // draw vertical grid lines
            for (int x = centerX; x < width; x += 10) {
                g.drawLine(x, 0, x, height);
            }
            for (int x = centerX; x > 0; x -= 10) {
                g.drawLine(x, 0, x, height);
            }

            // draw horizontal grid lines
            for (int y = centerY; y < height; y += 10) {
                g.drawLine(0, y, width, y);
            }
            for (int y = centerY; y > 0; y -= 10) {
                g.drawLine(0, y, width, y);
            }
        }
    };
}