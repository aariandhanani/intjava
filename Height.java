package com.suarez;

import java.util.Scanner;

public class Height {
    private int feet;
    private int inches;

    public Height(int ft, int in)
    {
        feet = ft;
        inches = in;
    }
    public Height(int in)
    {
        inches = in;
    }
    public void simplify()
    {
        while (inches >= 12)
        {
            //subtracts the inches and adds 1 foot per 12 inches
            inches = inches - 12;
            feet++;
        }
    }
    public void add(int in)
    {
        Scanner scan = new Scanner(System.in);
        in = scan.nextInt();
        inches = inches + in;
        simplify(); //to make sure it is then in the simplest form
    }
    public void add(Height ht)
    {
        ht = new Height(2,5);
        simplify(); //to make sure it is then in the simplest form
    }

    public int getFeet()
    {
        return feet;
    }

    public int getInches()
    {
        return inches;
    }
}
