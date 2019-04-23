package com.suarez;

public class Marketer extends Employee{
    public Marketer (int yearNumber)
    {
        super(yearNumber);
    }
    public double getSalary()
    {
        return super.getSalary() + 10000.0;
    }
    public void advertise(String text)
    {
        System.out.println("I can advertise");
    }
}
