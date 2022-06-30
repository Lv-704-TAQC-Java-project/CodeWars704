package com.org.ita.kata.implementation.nastiakomarenko;

import com.org.ita.kata.Eight;

public class EigthImpl implements Eight {
    @Override
    public int liters(double time) {
        return 0;
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return 0;
    }

    @Override
    public float mpgToKPM(float mpg) {
        //const
        double gallon = 4.54609188; // in litres
        double mile = 1.609344; // in km
//parameters

        double res = mpg*(mile/gallon);
        if(res%10==0){
            return Math.round(res);
        }else {
            double scale = Math.pow(10, 2);
            double result = Math.ceil(res * scale) / scale;
            return (float) result;
        }

    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        return new int[0];
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        return new int[0];
    }

    @Override
    public int stringToNumber(String str) {
        return 0;
    }

    @Override
    public boolean amIWilson(double n) {
        return false;
    }

    @Override
    public double twoDecimalPlaces(double number) {
        return 0;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        return new int[0];
    }
}
