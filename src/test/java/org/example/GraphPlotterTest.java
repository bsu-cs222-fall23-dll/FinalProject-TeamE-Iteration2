package org.example;

import org.junit.Before;
import org.junit.Test;

import java.awt.*;
import java.util.List;

import static org.junit.Assert.*;

public class GraphPlotterTest {
    private GraphPlotter plotter;

    @Before
    public void setUp() {
        // Initialize GraphPlotter with a default size for testing
        plotter = new GraphPlotter(new Dimension(600, 400));
    }

    @Test
    public void testComputePlotPoints_LinearFunction() {
        plotter.computePlotPoints("x", -10, 10, 1);
        List<Point> points = plotter.getPointsToPlot();

        assertNotNull("Points list should not be null", points);
        assertFalse("Points list should not be empty", points.isEmpty());
        assertEquals("Number of points", 21, points.size());

        // Example: Check if the point at x = 0 is correctly calculated
        // Assuming that the center of the graph (0,0) is mapped to the center of the screen
        Point expectedCenterPoint = new Point(300, 200); // Adjust based on your coordinate conversion logic
        assertTrue("Contains center point", points.contains(expectedCenterPoint));
    }
}