package com.suarez;

public class DomainClient {
    public static void main(String [] args)
    {
        DomainName team1 = new DomainName(".Baarian.com");
        //Setting up
        String domaincheck = team1.getdomain();

        String dot = team1.dots();

        String first = team1.FirstLetters();

        String last = team1.LastLetters();

        if (dot == "yes")
        {
        }
        else{
            System.out.println("Unknown Domain");
            System.exit(2);
        }


        if (first.equals("www"))
        {
            System.out.println("Domain is valid");
        }
        else{
            System.out.println("Domain is not valid! Does not start with \"www\"");
        }
    }
}
