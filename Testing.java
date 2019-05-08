package com.suarez;
import java.util.*;

public class Testing {
    private String name;

    public static void main(String [] args)
    {
//        ArrayList<String> cities=new ArrayList<String>();
//
//
//
//        cities.add("Oakland");
//        cities.add("Chicago");
//        cities.add("Milwaukee");
//        cities.add("Seattle");
//        cities.add("Denver");
//        cities.add("Boston");
//
//        for (int i = 0; i < cities.size(); i++) {
//            System.out.println(cities.get(i));
//        }
//        System.out.println();
//
//        cities.remove(2);
//        cities.add("Detroit");
//        cities.remove(4);
//        cities.add("Cleveland");
//
//        for (int i = 0; i < cities.size(); i++) {
//            System.out.println(cities.get(i));
//        }
//
//        int [ ] values = { 7, 9, 4, 1, 6, 3, 8, 5};
//
//        for (int i = 3; i < values.length; i +=2)
//        {
//            System.out.print(values[i - 2]);
//
//        }

        int number = 13;
        int [] values={ 0, 1, 2, 3, 4, 5};
        for (int val = 0; val < values.length;  val++)
        {
            number += val;
        }
        System.out.println(number);
    }


}
