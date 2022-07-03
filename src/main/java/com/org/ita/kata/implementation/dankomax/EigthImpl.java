package com.org.ita.kata.implementation.dankomax;

import com.org.ita.kata.Eight;
import java.util.Arrays;

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
        int[] resultArr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            double sqrtOfCurrentNum = Math.sqrt(array[i]);
            boolean currentNumHasIntSquareRoot = sqrtOfCurrentNum % 1 == 0.0;
            resultArr[i] = currentNumHasIntSquareRoot ? (int)sqrtOfCurrentNum : (int)Math.pow(array[i], 2);
        }

        return resultArr;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) {
            return new int[0];
        }

        int[] resultArr = {0, 0};

        for (int num : input) {
            if (num > 0) {
                resultArr[0]++;
            } else {
                resultArr[1] += num;
            }
        }

        return resultArr;
    }

    @Override
    public int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    @Override
    public boolean amIWilson(double n) {
        return n == 5.0 || n == 13.0 || n == 563.0;
    }

    @Override
    public double twoDecimalPlaces(double number) {
        return Math.round(number * 100) / 100.0;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        return Arrays.stream(numbers).filter(i -> i % divider == 0).toArray();
    }
}
