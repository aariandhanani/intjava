package com.suarez;
import java.lang.*;

public class Auto {
    public static String carWords;
    private String model;
    private int milesDriven;
    private double gallonsOfGas;

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
}
