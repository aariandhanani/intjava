//package com.suarez;
//
//import javafx.scene.canvas.GraphicsContext;
//import javafx.scene.paint.Color;
//
//public class square extends figure
//{
//    private final int MIN_LENGTH = 10;
//    private int length;
//
//    public square( )
//    {
//        super( );
//        length = MIN_LENGTH;
//    }
//
//    public square( int x, int y, Color color,
//                   int length )
//    {
//        super(x, y, x2, y2, x, y, color );
//        setLength( length );
//    }
//
//
//    public square setLength( int length )
//    {
//        if ( length > MIN_LENGTH )
//            this.length = length;
//        else
//            this.length = MIN_LENGTH;
//
//        return this;
//    }
//
//
//    public int getLength( )
//    {
//        return length;
//    }
//
//    @Override
//    public void draw( GraphicsContext gc )
//    {
//        gc.setFill( getColor( ) );
//        gc.fillRect( getX( ), getY( ), length, length );
//    }
//}
