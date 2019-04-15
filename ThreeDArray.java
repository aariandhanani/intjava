package com.suarez;

import java.util.Scanner;

public class ThreeDArray {
    public static void main(String []args)
    {
//        int [][][][] studentsmarks = new int[3][2][2][4];

        int[][][][] studentsmarks1 = {{{{33,66},{55,99}}, {{44,55},{67,90}}, {{14,15},{10,20}}, {{80,99},{34,56}}}};
        int[][][][] studentsmarks2 = {{{{31,65},{54,98}}, {{43,53},{63,93}}, {{43,53},{13,23}}, {{83,93},{33,53}}}};
        int[][][][] studentsmarks3 = {{{{31,65},{54,98}}, {{43,53},{63,93}}, {{43,53},{13,23}}, {{83,93},{33,53}}}};
        int[][][][] studentsmarks4 = {{{{31,65},{54,98}}, {{43,53},{63,93}}, {{43,53},{13,23}}, {{83,93},{33,53}}}};


        display(studentsmarks1);
        display(studentsmarks2);
        display(studentsmarks3);
        display(studentsmarks4);




    }
    public static void display(int studentmarks[][][][])
    {
        for (int row = 0; row<studentmarks.length;row++)
        {
            for (int column = 0; column<studentmarks[row].length;column++)
            {
                for(int third = 0; third < studentmarks[row][column].length; third++)
                {
                    for(int fourth = 0; fourth < studentmarks[row][column][third].length; fourth++)
                    {
                        System.out.print(studentmarks[row][column][third][fourth]+"\t");
                    }
                }
            }
            System.out.println();
        }
    }
}
