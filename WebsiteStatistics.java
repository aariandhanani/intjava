package com.suarez;

public class WebsiteStatistics {
    private String type;
    private int visitors;

    public WebsiteStatistics(String type1, int visitors1)
    {
        type = type1;
        visitors = visitors1;
    }
    public WebsiteStatistics(){
        type = "";
        visitors = 0;
    }
    public String gettype()
    {
        return type;
    }
    public int getvisitors()
    {
        return visitors;
    }
    public void settype(String type1)
    {
        type = type1;
    }

    public void setvisitors(int visitors1)
    {
        visitors = visitors1;
    }
    public String toString()
    {
        return ("" + type + visitors);
    }

    @Override
    public boolean equals (Object x)
    {
        if(x instanceof WebsiteStatistics)
        {
            WebsiteStatistics g = (WebsiteStatistics)x;
            if (type.equals(g.type) && visitors == g.visitors){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            System.out.println("The object must be of type Website Statistics");
            return false;
        }
    }
}
