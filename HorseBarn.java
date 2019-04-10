package com.suarez;

public class HorseBarn
{

private Horse[] barnSpots;
    public HorseBarn(int barnStalls)
    {
        barnSpots = new Horse[barnStalls];
    }

    public String toString()
    {
        String result = "";
        Horse number;
        for (int i = 0; i < barnSpots.length; i++)
        {

            number = barnSpots[i];

            result = result + "space: " + i;
            if (number == null)
            {
                result = result + "null";
            }
            else
            {
                result = result + number.toString();
            }
        }
        return result;
    }
}