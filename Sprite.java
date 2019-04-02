package com.suarez;
import javafx.scene.canvas.*;
import javafx.scene.paint.*;

public class Sprite {
    private int sX;
    private int sY;
    private double scale;

    public Sprite()
    {
        scale = 1;
    }

    public Sprite(int sX, int sY, double scale)
    {
        setCoordinates(sX, sY);
        setScale(scale);
    }
    public Sprite setCoordinates(int sX, int sY)
    {
        this.sX = sX;
        this.sY = sY;
        return this;
    }

    public Sprite setScale( double scale )
    {
        this.scale = ( scale > 0 ? scale : this.scale );
        return this;
    }

    public void draw( GraphicsContext gc )
    {
        gc.setFill( Color.CORAL ); // body
        gc.fillOval( sX, sY + 15 * scale, 90 * scale, 120 * scale );
        gc.setFill( Color.DARKGOLDENROD ); // hat
        gc.fillRect( sX + 23 * scale, sY, 45 * scale, 22 * scale );
        gc.setStroke( Color.DARKGOLDENROD ); // hat brim
        gc.setLineWidth( 3 );
        gc.strokeLine( sX, sY + 23 * scale,
                sX + 90 * scale, sY + 23 * scale );
        gc.setFill( Color.CHOCOLATE ); // eye
        gc.fillOval( sX + 60 * scale, sY + 45 * scale,
                18 * scale, 12 * scale );
        gc.setFill( Color.DARKBLUE ); // feet
        gc.setLineWidth( 1 );
        gc.fillOval( sX + 45 * scale, sY + 125 * scale,
                45 * scale, 12 * scale );
        gc.strokeOval( sX + 45 * scale, sY + 125 * scale,
        45 * scale, 12 * scale );
        gc.fillOval( sX + 27 * scale, sY + 127 * scale,
                45 * scale, 12 * scale );
        gc.strokeOval( sX + 27 * scale, sY + 127 * scale,
                45 * scale, 12 * scale );
    }
}
