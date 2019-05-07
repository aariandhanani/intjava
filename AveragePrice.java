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
            Scanner line1 = new Scanner(line);
            String product = line1.next();
            double total = 0;
            int count = 0;
            while(line1.hasNextDouble())
            {
                total = total + line1.nextDouble();
                count++;
            }
            System.out.println("Average price of " + product + ": " + total/count);
        }
    }
}
