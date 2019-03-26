package com.suarez;

public class AirportClient {
    public static void main(String [] args)
    {
        Airport airport1 = new Airport("DFW", 8);
        System.out.println(airport1.toString());
        Airport airport2 = new Airport("DFW", 8);
        System.out.println(airport2.toString());

        if (airport1.equals(airport2))
        {
            System.out.println("Airports are the same.");
        }
        else
        {
            System.out.println("Airports are different.");
        }
    }
}
