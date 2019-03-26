package com.suarez;
/*
Aarian Dhanani
3/19/19
*/

public class TelevisionChannel {
    private String name;
    private int number;
    private boolean cable;

    public TelevisionChannel(String name1, int number1, boolean cable1)
    {
        name = name1;
        number = number1;
        cable = cable1;
    }
    public TelevisionChannel(){
        name = "";
        number = 0;
        cable = false;
    }
    public String getname()
    {
        return name;
    }
    public int getnumber()
    {
        return number;
    }
    public boolean getcable()
    {
        return cable;
    }

    public void setname(String name1)
    {
        name = name1;
    }

    public void setnumber(int number1)
    {
        number = number1;
    }

    public void setname(boolean cable1)
    {
        cable = cable1;
    }

    public String toString()
    {
        return ("" + name + number + cable);
    }

    @Override
    public boolean equals (Object x)
    {
        if(x instanceof TelevisionChannel)
        {
            TelevisionChannel g = (TelevisionChannel)x;
            if (name.equals(g.name) && number == g.number && cable == g.cable){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            System.out.println("The object must be of type Television Channel");
            return false;
        }
    }
}