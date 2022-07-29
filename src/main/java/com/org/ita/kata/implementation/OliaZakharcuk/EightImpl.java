package com.org.ita.kata.implementation.OliaZakharcuk;


import com.org.ita.kata.BaseKata;
import com.org.ita.kata.Eight;

import java.util.Arrays;
import java.util.stream.IntStream;

public class EightImpl extends BaseKata implements Eight {
    private static long factorial(double n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    @Override
    public int liters(double time) {

        final double LITERS_PER_HOUR = 0.5;

        return (int) Math.floor(LITERS_PER_HOUR * time);
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

        String answer = result.replace(",", ".");
        return Float.parseFloat(answer);
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {

        int[] squareOrSquareRootArr = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (Math.sqrt(array[i]) % 1 == 0.0) {
                squareOrSquareRootArr[i] = (int) Math.sqrt(array[i]);
            } else {
                squareOrSquareRootArr[i] = array[i] * array[i];
            }
        }
        return squareOrSquareRootArr;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {

        int[] resultArr = new int[2];
        int counterOfPositiveNumbers = 0;
        int sumOfNegativeNumbers = 0;

        if (input == null || input.length == 0) {
            return new int[0];
        }

        for (int i : input) {
            if (i > 0) {
                counterOfPositiveNumbers++;
            } else {
                sumOfNegativeNumbers += i;
            }
        }

        resultArr[0] = counterOfPositiveNumbers;
        resultArr[1] = sumOfNegativeNumbers;
        return resultArr;
    }

    @Override
    public int stringToNumber(String str) {

        return Integer.parseInt(str);
    }

    @Override
    public boolean amIWilson(double n) {

        long fact;
        boolean isWilson;

        fact = factorial(n - 1);
        isWilson = (fact + 1) / (n * n) % 1 == 0;
        return isWilson;
    }

    @Override
    public double twoDecimalPlaces(double number) {

        return Math.round(number * 100) / 100.0;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {

        IntStream stream = Arrays.stream(numbers);

        return stream.filter(i -> i % divider == 0).toArray();
    }
}
