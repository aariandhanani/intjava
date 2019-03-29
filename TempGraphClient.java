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
        GraphicsContext gc = JIGraphicsUtility.setUpGraphics(stage, "Temperature Graph", 1200, 400 );
        m1 = new TempGraph( ).setCoordinates( 10, 369).setHeight(31).setMonth("Jan");
        m2 = new TempGraph( ).setCoordinates( 110, 376 ).setHeight(24).setMonth("Feb");
        m3 = new TempGraph( ).setCoordinates( 210, 355 ).setHeight(45).setMonth("Mar");
        m4 = new TempGraph( ).setCoordinates( 310, 340 ).setHeight(60).setMonth("Apr");
        m5 = new TempGraph( ).setCoordinates( 410, 331 ).setHeight(69).setMonth("May");
        m6 = new TempGraph( ).setCoordinates( 510, 320 ).setHeight(80).setMonth("Jun");
        m7 = new TempGraph( ).setCoordinates( 610, 312 ).setHeight(88).setMonth("Jul");
        m8 = new TempGraph( ).setCoordinates( 710, 313 ).setHeight(87).setMonth("Aug");
        m9 = new TempGraph( ).setCoordinates( 810, 325 ).setHeight(75).setMonth("Sep");
        m10 = new TempGraph( ).setCoordinates( 910, 335 ).setHeight(65).setMonth("Oct");
        m11 = new TempGraph( ).setCoordinates( 1010, 357 ).setHeight(43).setMonth("Nov");
        m12 = new TempGraph( ).setCoordinates( 1110, 377 ).setHeight(23).setMonth("Dec");


        //400 - x is the formula for the y axis

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