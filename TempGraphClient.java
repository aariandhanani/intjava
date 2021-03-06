package com.suarez;
/*
Aarian Dhanani
4/1/19 jk it was actually 3/30/19
To display the temperatures of the month
 */

import javafx.application.Application;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;
import java.util.*;

public class TempGraphClient extends Application
{
    private TempGraph m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12;
    @Override
    public void start( Stage stage )
    {
        Scanner scan = new Scanner(System.in);
        int [ ] arrayMonths = new int[12];

        String [ ] months1 = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        //case range

        int sum = 0;
        int max = -1000000;
        int min = 1000000;
        String maxText = "";
        String minText = "";
        int temporary = 0;

        for ( int i = 0; i < 12; i++ ) {
            String monthName = months1[i];
            System.out.println("Please enter the temperature for " + monthName);

            while (!scan.hasNextInt())
            {
                System.out.println("Please enter a valid integer");
                scan.next();
            }

            temporary = scan.nextInt();
            if (temporary > 0 && temporary<125)
            {
                arrayMonths[i] = temporary;
            }
            else
            {
                while (temporary < 0 && temporary > 125)
                {
                    if (!scan.hasNextInt())
                    {
                        System.out.println("Please enter a valid integer");
                        scan.next();
                    }
                    else if (temporary < 0 && temporary > 125)
                    {
                        System.out.println("Please enter a valid integer");
                        scan.next();
                    }
                    else
                    {
                        arrayMonths[i] = temporary;
                    }
                }
            }


            sum = sum + arrayMonths[i];
            if(arrayMonths[i]>max)
            {
                max = arrayMonths[i];
                maxText = monthName;
            }
            if(arrayMonths[i] < min)
            {
                min = arrayMonths[i];
                minText = monthName;
            }
        }
        int average = sum/12;
        String averageDisplay = "The average temperature was: " + average;
        String minDisplay = "The lowest temperature was in " +minText+ " and was: " + min;
        String maxDisplay = "The highest temperature was in " +maxText+ " and was: " + max;


        GraphicsContext gc = JIGraphicsUtility.setUpGraphics(stage, "Temperature Graph", 1200, 600 );
        m1 = new TempGraph( ).setCoordinates( 10, 400 - arrayMonths[0]).setHeight(arrayMonths[0]).setMonth("Jan");
        m2 = new TempGraph( ).setCoordinates( 110, 400 - arrayMonths[1]).setHeight(arrayMonths[1]).setMonth("Feb");
        m3 = new TempGraph( ).setCoordinates( 210, 400 - arrayMonths[2] ).setHeight(arrayMonths[2]).setMonth("Mar");
        m4 = new TempGraph( ).setCoordinates( 310, 400 - arrayMonths[3] ).setHeight(arrayMonths[3]).setMonth("Apr");
        m5 = new TempGraph( ).setCoordinates( 410, 400 - arrayMonths[4] ).setHeight(arrayMonths[4]).setMonth("May");
        m6 = new TempGraph( ).setCoordinates( 510, 400 - arrayMonths[5] ).setHeight(arrayMonths[5]).setMonth("Jun");
        m7 = new TempGraph( ).setCoordinates( 610, 400 - arrayMonths[6] ).setHeight(arrayMonths[6]).setMonth("Jul");
        m8 = new TempGraph( ).setCoordinates( 710, 400 - arrayMonths[7] ).setHeight(arrayMonths[7]).setMonth("Aug");
        m9 = new TempGraph( ).setCoordinates( 810, 400 - arrayMonths[8] ).setHeight(arrayMonths[8]).setMonth("Sep");
        m10 = new TempGraph( ).setCoordinates( 910, 400 - arrayMonths[9] ).setHeight(arrayMonths[9]).setMonth("Oct");
        m11 = new TempGraph( ).setCoordinates( 1010, 400 - arrayMonths[10] ).setHeight(arrayMonths[10]).setMonth("Nov");
        m12 = new TempGraph( ).setCoordinates( 1110, 400 - arrayMonths[11] ).setHeight(arrayMonths[11]).setMonth("Dec");
        gc.fillRect(0, 400, 1200, 2);

        //displays
        gc.fillText(averageDisplay, 575,  420);
        gc.fillText(minDisplay, 575,  440);
        gc.fillText(maxDisplay, 575,  460);


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
