package com.suarez;
import java.io.*;
import java.util.*;

public class StartsWithSP
{
    public static void main(String [] args)
    {
        //#29
        try
        {
            String result = "";


            Scanner fileAgain = new Scanner( new File( "/Users/aariandhanani/IdeaProjects/intJava/src/com/suarez/data1.txt" ) );

            while (fileAgain.hasNext())
            {
                String a = fileAgain.next();
//                System.out.println(a); just for testing
                if (a.startsWith("Sp"))
                {
                    result = result + a + " ";
                }
            }

            System.out.println(result);
            fileAgain.close();
        }
        catch ( IOException ioe )
        {
            ioe.printStackTrace( );
        }
    }
}