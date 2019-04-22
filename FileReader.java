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
        String words = "";

        for ( String x: list)
        {
            words = list.toString() + " ";
        }
        System.out.println(words);

        //part 2

        Collections.reverse(list);

        words = "";

        for ( String x: list)
        {
            words = list.toString() + " ";
        }
        System.out.println(words);



    }
}
