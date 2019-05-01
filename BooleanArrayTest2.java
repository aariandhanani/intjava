package com.suarez;

public class BooleanArrayTest2 {
    public static boolean[][] makeGrid(int rows, int cols)
    {
        int number = 1;
        boolean grid[][] = new boolean[rows][cols];
        for (int tempRow = 0; tempRow < rows; tempRow++)
        {
            for (int tempColumn = 0; tempColumn < cols; tempColumn++) {
                if (number % 2 == 1)
                {
                    grid[tempRow][tempColumn] = true;
                    number = 0;
                }
                else
                {
                    grid[tempRow][tempColumn] = false;
                    number = 1;
                }
                System.out.print(" " + grid[tempRow][tempColumn]);
            }
            System.out.println(" ");
        }
        return grid;

    }

    //Just for testing:
//    public static void main(String [] args)
//    {
//        makeGrid(2,5);
//    }
}
