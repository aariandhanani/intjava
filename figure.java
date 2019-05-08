package com.suarez;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;


public abstract class figure
{
    private int x;
    private int y;
    private int x2;
    private int y2;
    private int x3;
    private int y3;
    private Color color;

    public figure(int x, int y, int x2, int y2, int x3, int y3, Color color)
    {
        this.x = x;
        this.y = y;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        color = Color.INDIANRED;
    }

    public figure(int x, int y, Color color)
    {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public Color getColor( )
    {

        return color;
    }

    public figure setColor( Color color )
    {
        this.color = color;

        return this;
    }

    public int getX( )
    {
        return x;
    }

    public figure setX( int x )
    {
        this.x = x;

        return this;
    }


    public int getY( )
    {
        return y;
    }

    public figure setY( int y )
    {
        this.y = y;

        return this;
    }

    public abstract void draw( GraphicsContext gc );
}
