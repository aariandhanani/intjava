package com.suarez;

public class ClassClub extends ClassVenue
{
    private String genre;
    private final double $_SEAT;
    private int ticketsSold;

    public ClassClub(String name, int capacity, String musicType, double ticketPrice)
    {
        super(name, capacity);
        $_SEAT = ticketPrice;
        genre = musicType;
    }

    public double getRevenue()
    {
        return $_SEAT * ticketsSold;
    }
}
