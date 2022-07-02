package com.org.ita.kata.implementation.MyroslavaVynokur;

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
        final float galonLitres = 4.54609188f;
        final float mileKilometres = 1.609344f;
        if (mpg <= 0) {
            throw new ArithmeticException("Input can't be 0");
        }
        float result = (mpg / galonLitres) * mileKilometres;
        return Float.parseFloat(result % 1 != 0 ? (String.format("%.02f", result))
                : (String.format("%.01f", result)));
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
