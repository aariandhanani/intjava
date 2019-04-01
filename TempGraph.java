package com.suarez;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import java.util.*;

public class TempGraph {
    private int sX;
    private int sY;
    private int height;
    private String month;

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

    public TempGraph setMonth(String month)
    {
        this.month = month;
        return this;
    }

    public void draw( GraphicsContext gc )
    {
        gc.setLineWidth( 3 );
        if (height <= 46)
        {
            gc.setFill( Color.LIGHTSKYBLUE );
        }
        if (height > 46 && height <= 78)
        {
            gc.setFill( Color.YELLOW );
        }
        if (height > 78)
        {
            gc.setFill( Color.INDIANRED );
        }
        gc.fillRect(sX, sY, 50, height);

        gc.setFill(Color.BLACK);
        String str1 = "" + month;
        gc.fillText(str1, sX + 15, sY - 20);

        String str = "" + height;
        gc.fillText(str, sX + 15, sY - 5);
    }
}
