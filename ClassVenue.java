package com.suarez;

public abstract class ClassVenue
{
    private String name;
    private int capacity;

    public ClassVenue(String myName, int myCapacity)
    {
        name = myName;
        capacity = myCapacity;
    }

    public abstract double getRevenue();
}
