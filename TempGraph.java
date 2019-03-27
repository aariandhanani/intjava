package com.suarez;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class TempGraph {
    private int sX;
    private int sY;
    private int height;

    public TempGraph()
    {
        height = 1;
    }

    public TempGraph(int sX, int sY, int height)
    {
        setCoordinates(sX, sY);
        setHeight(height);
    }
    public TempGraph setCoordinates(int sX, int sY)
    {
        this.sX = sX;
        this.sY = sY;
        return this;
    }


    public TempGraph setHeight( int height)
    {
        this.height = height;
        return this;
    }

    public void draw( GraphicsContext gc )
    {
        gc.setLineWidth( 3 );
        gc.setFill( Color.LIGHTSKYBLUE ); // body
        gc.fillRect(sX, sY, 100, height);
    }
}
