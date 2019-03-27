package com.suarez;

import javafx.application.Application;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

public class TempGraphClient extends Application
{
    private TempGraph m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12;
    @Override
    public void start( Stage stage )
    {
        GraphicsContext gc = JIGraphicsUtility.setUpGraphics(stage, "Sprites", 1200, 400 );
        m1 = new TempGraph( ).setCoordinates( 10, 200).setHeight(200);
        m2 = new TempGraph( ).setCoordinates( 110, 390 ).setHeight(10);
        m3 = new TempGraph( ).setCoordinates( 210, 380 ).setHeight(20);
        m4 = new TempGraph( ).setCoordinates( 310, 360 ).setHeight(40);
        m5 = new TempGraph( ).setCoordinates( 410, 340 ).setHeight(60);
        m6 = new TempGraph( ).setCoordinates( 510, 320 ).setHeight(80);
        m7 = new TempGraph( ).setCoordinates( 610, 300 ).setHeight(100);
        m8 = new TempGraph( ).setCoordinates( 710, 280 ).setHeight(120);
        m9 = new TempGraph( ).setCoordinates( 810, 260 ).setHeight(140);
        m10 = new TempGraph( ).setCoordinates( 910, 240 ).setHeight(160);
        m11 = new TempGraph( ).setCoordinates( 1010, 220 ).setHeight(180);
        m12 = new TempGraph( ).setCoordinates( 1110, 200 ).setHeight(200);


        //400 - x

        m1.draw( gc );
        m2.draw( gc );
        m3.draw( gc );
        m4.draw( gc );
        m5.draw( gc );
        m6.draw( gc );
        m7.draw( gc );
        m8.draw( gc );
        m9.draw( gc );
        m10.draw( gc );
        m11.draw( gc );
        m12.draw( gc );

    }
    public static void main( String [ ] args )
    {
        launch( args );
    }
}