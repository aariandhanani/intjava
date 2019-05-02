package com.suarez;

public class ClassStadium extends ClassVenue
{
    private final int $_PREMIUM_SEAT = 200;
    private final int $_GENERAL_SEAT = 75;
    private final int MAX_PREMIUM_SEATS;
    private final int MAX_GENERAL_SEATS;

    private int premiumSeatsSold, generalSeatsSold;

    public ClassStadium(String name, int capacity, int premiumSeats)
    {
        super(name, capacity);
        MAX_PREMIUM_SEATS = premiumSeats;
        MAX_GENERAL_SEATS = capacity - premiumSeats;
    }

    public double getRevenue()
    {
        int premiumNumber = $_PREMIUM_SEAT * premiumSeatsSold;
        int generalNumber = $_GENERAL_SEAT * generalSeatsSold;
        return generalNumber + premiumNumber;
    }
}
