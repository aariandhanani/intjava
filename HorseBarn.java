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
    public static void main (String[] args)
    {
        HorseBarn barn1 = new HorseBarn(7);
        barn1.barnSpots[0] = new Horse("Bob");
        barn1.barnSpots[1] = new Horse("Joe");
        barn1.barnSpots[3] = new Horse("Steve");
        barn1.barnSpots[4] = new Horse("Joe2");


        HorseBarn barn2 = new HorseBarn(15);
        barn2.barnSpots[2] = new Horse("Bob2");
        barn2.barnSpots[7] = new Horse("Joe2");
        barn2.barnSpots[8] = new Horse("Steve2");
        barn2.barnSpots[10] = new Horse("Joe22");
        barn2.barnSpots[12] = new Horse("Mike");
        barn2.barnSpots[14] = new Horse("Steven");
        barn2.barnSpots[15] = new Horse("Steven15");

        HorseBarn barn3 = new HorseBarn(5);
        barn2.barnSpots[2] = new Horse("Alex");
        barn2.barnSpots[7] = new Horse("Nick");




    }
}