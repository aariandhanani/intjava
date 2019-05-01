package com.suarez;

public class Point {
    public int x;
    public int y;

    public Point()
    {
        //default constructor
    }
    public Point(int newX, int newY)
    {
        x = newX;
        y = newY;
    }

    public void setX(int x1)
    {
        x = x1;
    }

    public void setY(int y1)
    {
        y = y1;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }
}
