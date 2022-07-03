package com.org.ita.kata.implementation.ykireyeva;

import com.org.ita.kata.Eight;

import java.text.DecimalFormat;
import java.util.Arrays;


public class EigthImpl implements Eight {
    @Override
    public int liters(double time) {
        return (int) (time * 0.5);
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
        int[] outputArray = new int[2];
        int countOfPositives = 0;
        int sumOfNegatives = 0;

        if (input == null || input.length == 0) {
            return new int[0];
        }

        for (int i : input) {
            if (i > 0) {
                countOfPositives++;
            } else {
                sumOfNegatives += i;
            }
        }

        outputArray[0] = countOfPositives;
        outputArray[1] = sumOfNegatives;

        return outputArray;
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
        return Double.parseDouble(new DecimalFormat("#.##").format(number));
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        return Arrays.stream(numbers)
                .filter(x -> x % divider == 0)
                .toArray();
    }
}
