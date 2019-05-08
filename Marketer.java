package com.suarez;

public class Marketer extends Employee{
    public Marketer (int years)
    {
        super(years);
    }
    public double getSalary()
    {
        return super.getSalary() + 10000.0;
    }
    public void advertise(String text)
    {
        System.out.println("I can advertise");
    }
    public int getVacationDays()
    {
        return super.getVacationDays();
    }
}
