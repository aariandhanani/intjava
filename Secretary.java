package com.suarez;

public class Secretary extends Employee{
    public Secretary (int yearNumber)
    {
        super(yearNumber);
    }
    public void takeDictation(String text)
    {
        System.out.println("Taking dictation of text: " + text);
    }
}
