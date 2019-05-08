package com.suarez;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import java.math.*;


public class polygon extends figure
{
    private final int MIN_POINT = 15;
    private int pointA;
    private int pointB;
    private int pointC;

    private int x;
    private int y;
    private int x2;
    private int y2;
    private int x3;
    private int y3;

    public polygon(int x, int y, int x2, int y2, int x3, int y3, Color color)
    {
        super(x, y, x2, y2, x3, y3, color);
        double distance1 = Math.sqrt((x2 - x ) * (x2- x) + (y2 - y ) * (y2 - y));
        double distance2 = Math.sqrt((x2 - x3 ) * (x2- x3) + (y2 - y3) * (y2 - y3));
        double distance3 = Math.sqrt((x3 - x ) * (x3- x) + (y3 - y ) * (y3 - y));
        double semi = (distance1 + distance2 + distance3)/2;
        double area = Math.sqrt(semi * (semi - distance1) * (semi - distance2) * (semi - distance3));
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + semi*2);
    }

    @Override
    public void draw( GraphicsContext gc )
    {
        gc.setFill( getColor( ) );
        gc.strokeLine(x, y, x2, y2);
        gc.strokeLine(x2, y2, x3, y3);
        gc.strokeLine(x, y, x3, y3);

    }
}