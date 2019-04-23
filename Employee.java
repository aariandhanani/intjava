package com.suarez;

public class Employee {
    private int yearNumber;
    public Employee(int years)
    {
        yearNumber = years;
    }
    public int getHours()
    {
        return 40;
    }
    public double getSalary()
    {
        return 40000.0;
    }
    public int getVacationDays()
    {
        return 2 * yearNumber + 10;
    }
    public String getVacationForm()
    {
        return "yellow";
    }
}
