package com.suarez;
import java.lang.String;

public class DomainName {
    public static String domain;

    public DomainName(String domain1)
    {
        domain = domain1;
    }
    public DomainName(){
        domain = "";
    }
    public String getdomain()
    {
        return domain;
    }
    public void setdomain(String domain1)
    {
        domain = domain1;
    }
    public String toString()
    {
        return domain;
    }
    public String dots()
    {
        String dotsyes = "";
        if(domain.indexOf(".", domain.indexOf(".") + 1) != -1) {
            dotsyes = "yes";
        }
        else
        {
            dotsyes = "unknown";
        }
        return dotsyes;
    }
    public String LastLetters()
    {
        String endingLetters = domain.substring(domain.length() - 3);
        return endingLetters;
    }
    public String FirstLetters()
    {
        String firstLetters = "";
        firstLetters = domain.substring(0, 3);
        String returnValue = "";
        return firstLetters;
    }
}
