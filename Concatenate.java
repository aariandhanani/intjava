package com.suarez;
import java.io.*;
import java.util.*;

public class Concatenate
{
    public static void main(String [] args)
    {
        //#28:
        try
        {
            String result = "";

            Scanner fileAgain = new Scanner( new File( "/Users/aariandhanani/IdeaProjects/intJava/src/com/suarez/data1.txt" ) );

            while (fileAgain.hasNext())
            {
                String a = fileAgain.next();
                result = result + a + " ";
                a = "";
            }

            System.out.println(result);
        }
        catch ( IOException ioe )
        {
            ioe.printStackTrace( );
        }
    }
}
