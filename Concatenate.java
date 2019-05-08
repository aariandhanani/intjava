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
            Scanner file = new Scanner( new File( "/Users/aariandhanani/IdeaProjects/intJava/src/com/suarez/data1.txt" ) );
            String result = "";

            //how many lines

            int count = 0;
            int check = 1;

            while (check == 1)
            {
                if (file.next().equals("Sport"))
                {
                    check--;
                }
                count++;
            }

            Scanner fileAgain = new Scanner( new File( "/Users/aariandhanani/IdeaProjects/intJava/src/com/suarez/data1.txt" ) );

            for (int i = 0; i < count; i++)
            {
                String a = fileAgain.next();
                result = result + a;
                a = "";
            }

            System.out.println(result);
        }
        catch ( IOException ioe )
        {
            ioe.printStackTrace( );
        }


        //#29
        try
        {
            Scanner file = new Scanner( new File( "/Users/aariandhanani/IdeaProjects/intJava/src/com/suarez/data1.txt" ) );
            String result = "";

            int check = 1;
            int count = 0;

            while (check == 1)
            {
                if (file.next().equals("Sport"))
                {
                    check--;
                }
                count++;
            }

            Scanner fileAgain = new Scanner( new File( "/Users/aariandhanani/IdeaProjects/intJava/src/com/suarez/data1.txt" ) );

            for (int i = 0; i < count; i++)
            {
                String a = fileAgain.next();
//                System.out.println(a); just for testing
                if (a.startsWith("Sp"))
                {
                    result = result + a + " ";
                }
            }
            System.out.println(result);
        }
        catch ( IOException ioe )
        {
            ioe.printStackTrace( );
        }
    }
}
