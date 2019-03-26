package com.suarez;

public class AutoClient {
    public static void main(String [] args)
    {
        Auto carCheck = new Auto();
        String carFinal = carCheck.toString("Toyota",9,7.8);
        System.out.println(carFinal);
    }
}
