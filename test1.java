//package com.suarez;
//
//import java.util.Random;
//
//public class test1 {
//    public static int [ ] convert( char [ ] letters )
//    {
//        int[] newArrayProject = new int[0];
//
//        for (int i = 0; i < letters.length-1; i++)
//        {
//            if (letters[i] == 'A')
//            {
//                newArrayProject[i] = 1;
//            }
//            else
//            {
//                newArrayProject[i] = 0;
//            }
//
//        }
//        return newArrayProject;
//    }
//
//    private double price;
//    private char service;
//
//    public Ticket(double newPrice, char newService) {
//        setPrice(newPrice);
//        setService(newService);
//    }
//
//    public void setPrice(double price) {
//        if (price >= 0)
//        {
//            this.price = price;
//        }
//    }
//
//    public void setService(char service) {
//        if (service == 'A')
//        {
//            this.service = service;
//        }
//        else
//        {
//            this.service = 'B';
//        }
//    }
//
//    public char getService() {
//        return service;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//}
//
