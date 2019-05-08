package com.suarez;

public class LegalSecretary extends Employee{
    public LegalSecretary (int years)
    {
        super(years);
    }
    public double getSalary()
    {
        return super.getSalary() + 5000.0;
    }
    public void fileLegalBriefs(String text)
    {
        System.out.println("Legal Document: " + text);
    }
    public int getVacationDays()
    {
        return super.getVacationDays();
    }
}
