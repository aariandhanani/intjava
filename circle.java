//package com.suarez;
//
//import javafx.scene.canvas.GraphicsContext;
//import javafx.scene.paint.Color;
//
//public class circle extends figure
//{
//    private final int MIN_RADIUS = 15;
//    private int radius;
//
//    public circle( )
//    {
//        super( );
//        radius = MIN_RADIUS;
//    }
//
//    public circle( int x, int y, Color color,
//                   int radius )
//    {
//        super(x, y, x2, y2, x, y, color );
//        setRadius( radius );
//    }
//
//    public circle setRadius( int radius )
//    {
//        if ( radius > MIN_RADIUS )
//            this.radius = radius;
//        else
//            this.radius = MIN_RADIUS;
//
//        return this;
//    }
//
//
//    public int getRadius( )
//    {
//        return radius;
//    }
//
//    @Override
//    public void draw( GraphicsContext gc )
//    {
//        gc.setFill( getColor( ) );
//        gc.fillOval ( getX( ), getY( ), radius * 2, radius * 2 );
//    }
//}

