package com.suarez;

import java.io.*;
import java.util.*;

public class FileReader {

    public static void main(String [] Args) throws FileNotFoundException {
        ArrayList<String> list = new ArrayList<String>();

        Scanner scan = new Scanner(new File("/Users/aariandhanani/IdeaProjects/intJava/src/words.txt"));

        int count = 0;
        while(scan.hasNext())
        {
            list.add(scan.next());
        }

        //part 1
        String words1 = "";

        for ( String x: list)
        {
            words1 = list.toString() + " ";
        }
        System.out.println(words1);

        //part 2

        Collections.reverse(list);

        String words = "";
        words = "";

        for ( String x: list)
        {
            words = list.toString() + " ";
        }
        System.out.println(words);

        //part 3

        Collections.reverse(list);


        Scanner scan2 = new Scanner(new File("/Users/aariandhanani/IdeaProjects/intJava/src/words.txt"));

        String words2 = "";

        for ( String x: list)
        {
            words2 += x.toUpperCase()+"S ";
        }
        System.out.println(words2);


        System.out.println(words1);
    }
}
