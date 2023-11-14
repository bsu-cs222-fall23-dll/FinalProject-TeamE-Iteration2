package org.example;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class GraphPlotter
{
    private List<Point> pointsToPlot;

    public GraphPlotter() {
        this.pointsToPlot = new ArrayList<>();
    }

    public void setGraphSize(Dimension currentGraphsize) {
    }

    // this method will change the function into (x,y) coordinate shape based on the size of displayPanel
    public void computePlotPoints(String expressionStr, double minX, double maxX, double step)
    {
        pointsToPlot.clear();
        Expression expression = new ExpressionBuilder(expressionStr)
                .variable("x")
                .build();

        // put the variable in 'y' based on the expression that the user inputted
        for (double x = minX; x <= maxX; x += step) {
            double y = expression.setVariable("x", x).evaluate();
            // Convert (x,y) coordinate values into screen coordinate
            // This means that the (x,y) coordinate values will be converted into coordinates based on the displayPanel so that the computer can understand the coordinates
            Point screenPoint = convertToScreenCoordinate(new Point((int) x, (int) y));
            pointsToPlot.add(screenPoint);
        }
    }

    // Convert (x,y) coordinate values into screen coordinate
    private Point convertToScreenCoordinate(Point matchPoint)
    {

    }
}