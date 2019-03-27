package com.suarez;

import javafx.application.Application;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

public class TempGraphClient extends Application
{
    private TempGraph s1, s2, s3;
    @Override
    public void start( Stage stage )
    {
        GraphicsContext gc = JIGraphicsUtility.setUpGraphics(stage, "Sprites", 700, 400 );
        s1 = new TempGraph( ).setCoordinates( 30, 200).setHeight(200);
        s2 = new TempGraph( ).setCoordinates( 160, 200 ).setHeight(10);
        s3 = new TempGraph( ).setCoordinates( 300, 200 ).setHeight(20);


        s1.draw( gc );
        s2.draw( gc );
        s3.draw( gc );

    }
    public static void main( String [ ] args )
    {
        launch( args );
    }
}