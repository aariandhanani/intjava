package com.suarez;
import java.util.*;
import java.io.*;

public class DataClass
{
    public static void main(String [] args)
    {
        int n = 0;

        try
        {
            Scanner file1 = new Scanner( new File( "/Users/aariandhanani/IdeaProjects/intJava/src/com/suarez/data.txt" ) );

            while (file1.hasNextLine())
            {
                String line = file1.nextLine();
                Scanner line1 = new Scanner(line);

                while(line1.hasNextInt())
                {
                    n = line1.nextInt();

                    System.out.println(n);
                }
            }
        }
        catch ( IOException ioe )
        {
            ioe.printStackTrace( );
        }
    }
}
