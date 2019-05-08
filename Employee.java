package com.suarez;

public class Employee {

    private int years;

    public Employee(int initialYears)
    {
        years = initialYears;
    }

    public int getHours()
    {
        return 40;
    }

    public double getSalary()
    {
        return 50000.0;
    }

    public int getVacationDays()
    {
        return getSeniorityBonus() + 10;
    }

    public String getVacationForm()
    {
        return "yellow";
    }

    public int getSeniorityBonus()
    {
        return 2 * years;
    }

    public int getyears()
    {
        return years;
    }
}
