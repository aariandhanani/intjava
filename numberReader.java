package com.suarez;

import java.io.*;
import java.util.*;

public class numberReader {
    public static void main(String [] Args) throws FileNotFoundException {
        ArrayList<String> list = new ArrayList<String>();

        Scanner scan = new Scanner(new File("/Users/aariandhanani/IdeaProjects/intJava/src/numbers"));

        int sum = 0;
        int numberOfNumbers = 0;
        int max = -10000000;
        int min = 1000000000;
        int temporary = 0;
        while(scan.hasNext())
        {
            temporary = scan.nextInt();
            list.add(scan.next());
            sum = sum + scan.nextInt();
            numberOfNumbers++;
            if (scan.nextInt() > max)
            {
                max = scan.nextInt();
            }
            if (scan.nextInt() < min)
            {
                min = scan.nextInt();
            }
        }

        //part 1
        String words = "";

        for ( String x: list)
        {
            words = list.toString() + " ";
        }
        System.out.println(words);

        //part 2
        int average = sum/numberOfNumbers;
        System.out.println("The average is: " + average);

        //part 3

        System.out.println("The max is "+ max + " and the min is " + min);

        //part 4

        words = "";

        Scanner scan2 = new Scanner(new File("/Users/aariandhanani/IdeaProjects/intJava/src/numbers"));

        while(scan.hasNext())
        {
            if (scan.nextInt() % 2 == 0) {
                words = list.toString() + " ";
            }
        }

        System.out.println("Without even numbers is: " +words);


    }
}
