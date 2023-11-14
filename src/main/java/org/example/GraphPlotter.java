package org.example;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class GraphPlotter {
    private List<Point> pointsToPlot;

    public GraphPlotter() {
        this.pointsToPlot = new ArrayList<>();
    }

    // This method will change the function into (x,y) coordinate shape based on the size of displayPanel
    public void computePlotPoints(String expressionStr, double minX, double maxX, double step) {
        pointsToPlot.clear();
        Expression expression = new ExpressionBuilder(expressionStr)
                .variable("x")
                .build();

        // Put the variable in 'y' based on the expression that the user inputted
        for (double x = minX; x <= maxX; x += step) {
            double y = expression.setVariable("x", x).evaluate();

            // Convert (x,y) coordinate values into screen coordinate
            // This means that the (x,y) coordinate values will be converted into coordinates based on the displayPanel so that the computer can understand the coordinates
            Point screenPoint = convertToScreenCoordinates(new Point((int)x, (int)y));
            pointsToPlot.add(screenPoint);
        }
    }

    // Convert (x,y) coordinate values into screen coordinate
    private Point convertToScreenCoordinates(Point mathPoint) {
        int centerX = 300;
        int centerY = 167;

        // Functions that convert a mathematical point to a screen coordinate point
        int screenX = centerX + mathPoint.x;
        int screenY = centerY - mathPoint.y;

        System.out.println("Math Point: " + mathPoint + " -> Screen Point: " + new Point(screenX, screenY));

        return new Point(screenX, screenY);
    }

    // Draw the graph by connecting all the plots
    public void drawPlot(Graphics2D g2d) {
        // Set the color for the plot. Let's choose blue for the graph line.
        g2d.setColor(Color.BLUE); // set the color of the plot as BLUE


        // Check if there are points to plot.
        if (pointsToPlot != null && !pointsToPlot.isEmpty())
        {
            // Loop through all the points in the list.
            for (int i = 0; i < pointsToPlot.size() - 1; i++)
            {
                Point current = pointsToPlot.get(i); // get current point
                Point next = pointsToPlot.get(i + 1); // get next point

                g2d.drawLine(current.x, current.y, next.x, next.y);  // draw a line between the current point and the next point
            }
        }
    }

    private Dimension graphSize; // The size of the graph area

    public GraphPlotter(Dimension graphSize) {
        this.pointsToPlot = new ArrayList<>();
        this.graphSize = graphSize; // Set the size of the graph area
    }

    public void setGraphSize(Dimension newSize) {
        this.graphSize = newSize;
    }

    // Getter for pointsToPlot
    public List<Point> getPointsToPlot() {
        return pointsToPlot;
    }
}