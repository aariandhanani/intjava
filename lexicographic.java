package com.suarez;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class lexicographic
{
    public static void main(String [] args)
    {
        try
        {
            Scanner file = new Scanner( new File( "/Users/aariandhanani/IdeaProjects/intJava/src/com/suarez/data1.txt" ) );

            for(int i = 0; i < 2; i++)
            {
                System.out.println(file.nextLine());
            }

            String s = "";
            String temp = " ";

            while(file.hasNextLine())
            {
                s = file.nextLine();
                if (s.compareTo(temp) > 0)
                {
                    temp = s;
                }

                System.out.println(temp);

                if(!s.contains(" "))
                {
                    System.out.println(s);
                }
            }

        }
        catch ( InvalidPathException ipe )
        {
            System.out.println( ipe.getMessage( ) );
        }
        catch ( IOException ioe )
        {
            System.out.println( ioe.getMessage( ) );
        }
        catch ( SecurityException se )
        {
            System.out.println( se.getMessage( ) );
        }
    }
}
