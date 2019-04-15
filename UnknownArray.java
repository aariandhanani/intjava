package com.suarez;

import java.util.Scanner;

public class UnknownArray {
    public static void main(String[]args)
    {
        System.out.println(average(43,56,76,8));
    }

    public static int average(int...numbers)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers?");

        int numberAmount = scan.nextInt();

        int[]arrayNumbers = new int[numberAmount];

        int total = 0;

        for(int x:numbers)
        {
            total+=x;
        }

        return total/numbers.length;
    }
}