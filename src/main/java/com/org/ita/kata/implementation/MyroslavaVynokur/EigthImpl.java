package com.org.ita.kata.implementation.MyroslavaVynokur;

import com.org.ita.kata.Eight;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;


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
        return Integer.parseInt(str);
    }

    @Override
    public boolean amIWilson(double n) {
        return false;
    }

    @Override
    public double twoDecimalPlaces(double number) {
        final DecimalFormat df = new DecimalFormat("0.00");
        return Double.parseDouble(df.format(number));
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        List<Integer> arrayList = new ArrayList<>();
        for (int number : numbers) {
            if (number % divider == 0) {
                arrayList.add(number);
            }
        }
        return arrayList.stream().mapToInt(Integer::intValue).toArray();
    }
}
