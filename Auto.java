package com.suarez;


import java.lang.*;
import java.util.ArrayList;

public class Auto {

    public static String carWords;
    private String model;
    private int milesDriven;
    private double gallonsOfGas;
    private ArrayList<Auto> carList;

    public void initialize( )
    {
        carList = new ArrayList<Auto>( );
    }

    public Auto() {
        model = "unkown";
    }

    public Auto(String name, double gallons) {
        model = name;
        SetGallons(gallons);
    }

    public Auto(String name, int miles, double gallons) {
        model = name;
        SetMiles(miles);
        SetGallons(gallons);
    }

    public Auto SetGallons(double gallons) {
        if (gallons < 0) {
            this.gallonsOfGas = 0;
        }
        else {
            this.gallonsOfGas = gallons;
        }
        return this;
    }

    public Auto SetMiles(int miles) {
        if (miles < 0) {
            this.milesDriven = 0;
        } else {
            this.milesDriven = miles;
        }
        return this;
    }

    public String GetModel() {
        return model;
    }

    public int GetMiles() {
        return milesDriven;
    }

    public double GetGallons() {
        return gallonsOfGas;
    }

    public String toString(String model, int miles, double gallonsOfGas) {
        carWords = "The model is " + model + " with " + miles + " miles and " + gallonsOfGas + " gallons of gas.";
        return carWords;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Auto)) {
            return false;
        }
        else
        {
            Auto objauto = (Auto) o;
            if (model.equals(objauto.model) && milesDriven == objauto.milesDriven && Math.abs(gallonsOfGas - objauto.gallonsOfGas) < 1)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
    public void fillWithCars( )
    {
        initialize();

        Auto car1 = new Auto( "BMW", 0, 0.0 );
        Auto car2 = new Auto( "Ferrari", 100, 500.0 );
        Auto car3 = new Auto( "Jeep", 1000, 90.0 );
        Auto car4 = new Auto( "Ferrari", 10, 3.0 );
        Auto car5 = new Auto( "BMW", 4000, 200.0 );
        Auto car6 = new Auto( "Ferrari", 1000, 50.0 );

        carList.add( car1 );
        carList.add( car2 );
        carList.add( car3 );
        carList.add( car4 );
        carList.add( car5 );
        carList.add( car6 );
    }
    public void carListWords()
    {
        fillWithCars();
        String words = "";
        for ( Auto x: carList){
            words = carList.toString() + " ";
        }
        System.out.println(words);
    }


}
