package com.suarez;

import java.io.*;
import java.util.*;

public class AveragePrice
{
    public static void main(String [] args) throws IOException
    {
        File input = new File("/Users/aariandhanani/IdeaProjects/intJava/src/com/suarez/Prices");
        Scanner input1 = new Scanner(input);

        while (input1.hasNextLine())
        {
            String line = input1.nextLine();
            Scanner lineBreak = new Scanner(line);
            String product = lineBreak.next();
            double total = 0;
            int count = 0;
            while(lineBreak.hasNextDouble())
            {
                total = total + lineBreak.nextDouble();
                count++;
            }
        }
    }
}
