package com.suarez;

public class BooleanArrayTest2 {
    public static void main(String[]args)
    {
        boolean firstarray[][] = {{true,false,true,false},{false,true,false,true},{true,false,true,false}};
        display(firstarray);
    }
    public static void display(boolean x[][])
    {
        for (int row = 0; row<x.length;row++)
        {
            for (int column = 0; column<x[row].length;column++)
            {
                System.out.print(x[row][column]+"\t");
            }
            System.out.println();
        }
    }
}
