package com.suarez;
import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.*;

import java.lang.*;

public class data
{
    public static void main(String [] args)
    {
        int count = 0;
        try
        {
            Scanner file = new Scanner(new File("/Users/aariandhanani/IdeaProjects/intJava/src/com/suarez/data1.txt"));
            while(count != 2)
            {
                System.out.println(file.next());
                count++;
            }
            file.close();
        }
        catch ( IOException ioe )
        {
            ioe.printStackTrace( );
        }


        //I dont understand what #27 is asking
//        try
//        {
//            data<String> dataStream = Files.lines( Paths.get( "data.txt" ) );
//        }
//        catch ( InvalidPathException ipe )
//        {
//            System.out.println( ipe.getMessage( ) );
//        }
//        catch ( IOException ioe )
//        {
//            System.out.println( ioe.getMessage( ) );
//        }
//        catch ( SecurityException se )
//        {
//            System.out.println( se.getMessage( ) );
//        }
    }
}
