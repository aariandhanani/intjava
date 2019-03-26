package com.suarez;

public class Airport {
    public static String airportCode;
    private int gates;
    private static int countAirports;
    public Airport()
    {
        airportCode = "";
        countAirports++;
    }
    public Airport(String startAirportCode, int StartGates)
    {
        airportCode = startAirportCode;
        SetGates(StartGates);
    }
    public void SetCountAirports(int countAirports)
    {
        if(countAirports < 0)
        {
            System.err.println("Sorry, we do not accept negative values. We will set it to zero.");
            countAirports = 0;
        }
        else
        {
            countAirports = gates;
        }
    }
    public void SetGates(int newGates)
    {
        if(newGates > 0)
        {
            gates = newGates;
        }
        else
        {
            System.err.println("Gates must be at least 0.");
            System.err.println("Value of Gates Unchanged.");
        }
    }

    public String getAirportCode()
    {
        return airportCode;
    }
    public int getGates()
    {
        return gates;
    }
    public double getCountAirports()
    {
        return countAirports;
    }

    public String toString(String airportCode, int newGates, int countAirports)
    {
        airportCode = " ";
        return airportCode;
    }
    public boolean equals (Object object1)
    {
        if (object1 instanceof Airport)
        {
            Airport airport2 = (Airport) object1;
            return (toString().equals(airport2.toString()));
        }
        else
        {
            System.err.println("Object must be of Airport type.");
            return false;
        }
    }
}
