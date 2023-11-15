package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class GraphPlotterTest {

    @BeforeEach
    void setUp() {
        JPanel panel = new JPanel(); // Create a panel (or use an existing one)
        GraphingCalculator.setupGraphingCalculatorPanel(panel);
    }

    @Test
    void testComputePlotPoints() {
        // Create a test instance of GraphPlotter
        GraphPlotter plotter = new GraphPlotter(GraphingCalculator.graphPanel.getSize());

        // Perform your test operations on plotter
        plotter.computePlotPoints("x^2", -5, 5, 1);

        assertEquals(11, plotter.getPointsToPlot().size());
    }

    @Test
    public void testConvertToScreenCoordinates()
    {
        //Create a test instance of GraphPlotter
        GraphPlotter graphPlotter = new GraphPlotter(GraphingCalculator.graphPanel.getSize());

        //Test with a mathPoint at (0,0)
        Point mathPoint = new Point(0, 0);
        Point screenPoint = graphPlotter.convertToScreenCoordinates(mathPoint);

        assertEquals(GraphingCalculator.graphPanel.getWidth() / 2, screenPoint.x);
        assertEquals(GraphingCalculator.graphPanel.getHeight() / 2, screenPoint.y);

        // Test with a mathPoint at (10, 20)
        mathPoint.setLocation(10, 20);
        screenPoint = graphPlotter.convertToScreenCoordinates(mathPoint);

        assertEquals(GraphingCalculator.graphPanel.getWidth() / 2 + 10, screenPoint.x);
        assertEquals(GraphingCalculator.graphPanel.getHeight() / 2 - 20, screenPoint.y);
    }
}
