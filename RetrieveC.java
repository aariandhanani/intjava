package com.suarez;
import java.util.Scanner;

public class RetrieveC
{
    //25
    public static void main(String [] args)
    {
        Scanner parse = new Scanner( "A-B-C-D" );
        parse.useDelimiter( "-" );
        String s = "";
        int check = 0;

        while(check == 0)
        {
            s = parse.next();
            if (s.equals("C"))
            {
                check = 1;
            }
        }

        System.out.println(s);
    }
}
