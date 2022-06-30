package com.org.ita.kata.implementation.OliaZakharcuk;

import com.org.ita.kata.Eight;

public class EigthImpl implements Eight {
    @Override
    public int liters(double time) {

        final double LITERS_PER_HOUR = 0.5;

        return (int)Math.floor(LITERS_PER_HOUR * time);
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {

        return length * width * height;
    }

    @Override
    public float mpgToKPM(float mpg) {
        return 0;
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
