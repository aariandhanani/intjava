package com.suarez;

import java.util.Scanner;

public class Lawyer extends Employee {
    public Lawyer (int years)
    {
        super(years);
    }
    public void howToSue(String text)
    {
        System.out.println("Who do you want to sue?");
        Scanner scan = new Scanner(System.in);
        text = scan.next();
        System.out.println("Sue: " + text);
    }
    public int getVacationDays()
    {
        return super.getVacationDays() + 5;
    }
    public String getVacationForm()
    {
        return "pink";
    }
}
