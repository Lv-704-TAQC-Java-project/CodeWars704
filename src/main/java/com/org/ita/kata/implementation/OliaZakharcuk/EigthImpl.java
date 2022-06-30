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

        final float GAL_PER_L = 4.54609188f;
        final float MILE_PER_KM = 1.609344f;

        float KM_PER_L = (mpg / GAL_PER_L) * MILE_PER_KM;

        String result = KM_PER_L % 1 != 0 ? (String.format("%.02f", KM_PER_L))
                : (String.format("%.01f", KM_PER_L));

        return Float.parseFloat(result);
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
