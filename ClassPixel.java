package com.suarez;

public class ClassPixel
{
    public static int reds[][] = {{50,9},{50,9}};
    public static int greens[][] = {{40,9},{51,10}};
    public static int blues[][] = {{8,70},{52,11}};



    public int[][][] generatePixelArray(int[][]reds1, int[][] greens1, int[][]blues1)
    {
        int colors[][][] = {{{findNumber(reds, 0, 0),findNumber(reds, 0, 1)}, {findNumber(reds, 1, 0),findNumber(reds, 1, 1)}},{{findNumber(greens, 0, 0),findNumber(greens, 0, 1)}, {findNumber(greens, 1, 0),findNumber(greens, 1, 1)}}, {{findNumber(blues, 0, 0),findNumber(blues, 0, 1)}, {findNumber(blues, 1, 0),findNumber(blues, 1, 1)}}};
        return colors;
    }

//    public Pixel[][] flipImage(ClassPixel[][] image, boolean horiz)
//    {
//
//    }

    public int findNumber(int[][] reds, int index, int index2)
    {
        return reds[index][index2];
    }

    public static void main(String [] args)
    {
        print(reds);
        Pixel test = new Pixel(400,300,200);
        System.out.println(test.toString());
    }

    public static void print(int x[][])
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
