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
            if (RegularCalculator.startNewInput)
            {
                RegularCalculator.textDisplay.setText("");
                RegularCalculator.startNewInput = false;
            }
            RegularCalculator.textDisplay.setText(RegularCalculator.textDisplay.getText() + command);
        }
        // Interaction with 'DEL' button
        else if (command.equals("C") || command.equals("CE") || command.equals("DEL"))
        {
            RegularCalculator.textDisplay.setText("");
            RegularCalculator.firstOperand = 0;
            RegularCalculator.operator = "";
        }
        // Interaction with '(-)' button
        else if (command.equals("(-)"))
        {
            RegularCalculator.textDisplay.setText("-" + RegularCalculator.textDisplay.getText());
        }
        // Interaction with '.' button
        else if (command.equals("."))
        {
            RegularCalculator.textDisplay.setText(RegularCalculator.textDisplay.getText() + command);
        }
        // Interactions with '=', '+', '-', 'x', '1/x', 'x^2', 'sqrt', '%', '/' buttons
        else if (command.equals("="))
        {
            double secondOperand = Double.parseDouble(RegularCalculator.textDisplay.getText());
            double result = 0;
            switch (RegularCalculator.operator)
            {
                // + Button
                case "+" -> result = RegularCalculator.firstOperand + secondOperand;
                // - Button
                case "-" -> result = RegularCalculator.firstOperand - secondOperand;
                // x Button
                case "X" -> result = RegularCalculator.firstOperand * secondOperand;
                // 1/x Button
                case "1/x" -> {
                    if (RegularCalculator.firstOperand != 0)
                    {
                        result = 1 / RegularCalculator.firstOperand;
                    } else {
                        RegularCalculator.textDisplay.setText("ERROR");
                    }
                }
                // x^2 Button
                case "x^2" -> result = (int) Math.pow(RegularCalculator.firstOperand, 2);
                // √ Button
                case "√" -> result = Math.sqrt(RegularCalculator.firstOperand);
                // % Button
                case "%" -> result = RegularCalculator.firstOperand / 100;
                // / Button
                case "/" -> {
                    if (secondOperand != 0)
                    {
                        result = RegularCalculator.firstOperand / secondOperand;
                    } else {
                        RegularCalculator.textDisplay.setText("ERROR");
                    }
                }
            }
            RegularCalculator.textDisplay.setText(String.valueOf(result));
            RegularCalculator.startNewInput = true;
        } else {
            if (!RegularCalculator.operator.isEmpty())
            {
                return;
            }
            RegularCalculator.firstOperand = Double.parseDouble(RegularCalculator.textDisplay.getText());
            RegularCalculator.operator = command;
            RegularCalculator.startNewInput = true;
        }
    }
}