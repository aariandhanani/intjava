package com.suarez;

import java.io.*;
import java.util.*;

public class numberReader {
    public static void main(String [] Args) throws FileNotFoundException {
        ArrayList<Integer> list = new ArrayList<Integer>();

        Scanner scan = new Scanner(new File("/Users/aariandhanani/IdeaProjects/intJava/src/numbers"));

        int sum = 0;
        int numberOfNumbers = 0;
        int max = -10000000;
        int min = 1000000000;
        int temporary;
        String words = "";

        while(scan.hasNext())
        {
            temporary = scan.nextInt();
            list.add(temporary);
            sum = sum + temporary;
            numberOfNumbers++;
            if (temporary > max)
            {
                max = temporary;
            }
            if (temporary < min)
            {
                min = temporary;
            }
            words = words + temporary + " ";
        }

        System.out.println("All numbers: " + words);

        //part 2
        int average = sum/numberOfNumbers;
        System.out.println("The average is: " + average);

        //part 3

        System.out.println("The max is "+ max + " and the min is " + min);

        //part 4

        words = "";

        Scanner scan2 = new Scanner(new File("/Users/aariandhanani/IdeaProjects/intJava/src/numbers"));

        while(scan2.hasNext())
        {
            temporary = scan2.nextInt();
            if (temporary % 2 == 1)
            {
                words = words + temporary + " ";
            }
        }

        System.out.println("Even numbers: " + words);
    }
}
