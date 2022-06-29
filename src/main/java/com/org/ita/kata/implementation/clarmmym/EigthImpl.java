package com.org.ita.kata.implementation.clarmmym;

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
        final float GAL_L = 4.54609188f;
        final float MILE_KM = 1.609344f;
        final float MPG_TO_KPM = GAL_L / MILE_KM;
        final float HUNDRED = GAL_L / MILE_KM;

        float result = mpg / MPG_TO_KPM;

        result = Math.round(result * HUNDRED) / HUNDRED;

        return result;

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
