//package com.suarez;
//
//import javafx.application.Application;
//import javafx.scene.canvas.GraphicsContext;
//import javafx.scene.paint.Color;
//import javafx.stage.Stage;
//
//import java.util.ArrayList;
//
//public class TrafficLight extends Application
//{
//    private ArrayList<square> squaresList;
//    private ArrayList<circle> circlesList;
//
//    @Override
//    public void start( Stage stage )
//    {
//        GraphicsContext gc = JIGraphicsUtility.setUpGraphics(
//                stage, "Traffic Light", 700, 400 );
//
//        final int SQUARE_SIZE = 80, CIRCLE_RADIUS = 20;
//        final int SQUARE_X = 300, CIRCLE_X = SQUARE_X + 20;
//        final int SQUARE_Y = 100, CIRCLE_Y = SQUARE_Y + 20;
//
//        squaresList = new ArrayList<square>( );
//        squaresList.add( new square( SQUARE_X, SQUARE_Y,
//                Color.BLACK, SQUARE_SIZE ) );
//        squaresList.add( new square( SQUARE_X, SQUARE_Y + SQUARE_SIZE,
//                Color.BLACK, SQUARE_SIZE ) );
//        squaresList.add( new square( SQUARE_X, SQUARE_Y + ( SQUARE_SIZE * 2 ),
//                Color.BLACK, SQUARE_SIZE ) );
//
//        circlesList = new ArrayList<circle>( );
//        circlesList.add( new circle( CIRCLE_X, CIRCLE_Y,
//                Color.RED, CIRCLE_RADIUS ) );
//        circlesList.add( new circle( CIRCLE_X, CIRCLE_Y + SQUARE_SIZE,
//                Color.YELLOW, CIRCLE_RADIUS ) );
//        circlesList.add( new circle( CIRCLE_X, CIRCLE_Y + ( SQUARE_SIZE * 2 ),
//                Color.GREEN, CIRCLE_RADIUS ) );
//
//        for ( square s : squaresList )
//            s.draw( gc );
//
//        for ( circle c : circlesList )
//            c.draw( gc );
//    }
//
//    public static void main( String [] args )
//    {
//        launch( args );
//    }
//}
//
