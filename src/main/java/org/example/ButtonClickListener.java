package org.example;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonClickListener implements ActionListener
{
    // Initiate variable 'firstOperand' that will store the first part of user's input

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand(); // initiate variable to check what the user inputs

        // Interaction with numbers (0~9)
        if (command.matches("[0-9]"))
        {
            if (CalculatorUI.startNewInput)
            {
                CalculatorUI.textDisplay.setText("");
                CalculatorUI.startNewInput = false;
            }
            CalculatorUI.textDisplay.setText(CalculatorUI.textDisplay.getText() + command);
        }
        // Interaction with 'DEL' button
        else if (command.equals("C") || command.equals("CE"))
        {
            CalculatorUI.textDisplay.setText("");
            CalculatorUI.firstOperand = 0;
            CalculatorUI.operator = "";
        }
        // Interaction with 'x' button
        else if (command.equals("x"))
        {
            if (CalculatorUI.startNewInput)
            {
                CalculatorUI.textDisplay.setText("");
                CalculatorUI.startNewInput = false;
            }
            CalculatorUI.textDisplay.setText(CalculatorUI.textDisplay.getText() + command);
        }
        // Interaction with '(-)' button
        else if (command.equals("(-)"))
        {
            CalculatorUI.textDisplay.setText("-" + CalculatorUI.textDisplay.getText());
        }
        // Interaction with '.' button
        else if (command.equals("."))
        {
            CalculatorUI.textDisplay.setText(CalculatorUI.textDisplay.getText() + command);
        }
        // Interactions with '=', '+', '-', 'x', '1/x', 'x^2', 'sqrt', '%', '/' buttons
        else if (command.equals("="))
        {
            double secondOperand = Double.parseDouble(CalculatorUI.textDisplay.getText());
            double result = 0;
            switch (CalculatorUI.operator)
            {
                // + Button
                case "+" -> result = CalculatorUI.firstOperand + secondOperand;
                // - Button
                case "-" -> result = CalculatorUI.firstOperand - secondOperand;
                // x Button
                case "X" -> result = CalculatorUI.firstOperand * secondOperand;
                // 1/x Button
                case "1/x" -> {
                    if (CalculatorUI.firstOperand != 0)
                    {
                        result = 1 / CalculatorUI.firstOperand;
                    } else {
                        CalculatorUI.textDisplay.setText("ERROR");
                    }
                }
                // x^2 Button
                case "x^2" -> result = (int) Math.pow(CalculatorUI.firstOperand, 2);
                // √ Button
                case "√" -> result = Math.sqrt(CalculatorUI.firstOperand);
                // % Button
                case "%" -> result = CalculatorUI.firstOperand / 100;
                // / Button
                case "/" -> {
                    if (secondOperand != 0)
                    {
                        result = CalculatorUI.firstOperand / secondOperand;
                    } else {
                        CalculatorUI.textDisplay.setText("ERROR");
                    }
                }
            }
            CalculatorUI.textDisplay.setText(String.valueOf(result));
            CalculatorUI.startNewInput = true;
        } else {
            if (!CalculatorUI.operator.isEmpty())
            {
                return;
            }
            CalculatorUI.firstOperand = Double.parseDouble(CalculatorUI.textDisplay.getText());
            CalculatorUI.operator = command;
            CalculatorUI.startNewInput = true;
        }
    }
}