package com.org.ita.kata.implementation.YaroslavTarasovych;

import com.org.ita.kata.Eight;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;


public class EigthImpl implements Eight {
    @Override
    public int liters(double time) {
        return (int) Math.floor(time * 0.5);
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
        return 0;
    }

    @Override
    public boolean amIWilson(double n) {
        BigDecimal factorial = new BigDecimal(String.valueOf(1));
        if (n == 0 || n == 1) {
            return false;
        } else {
            BigDecimal bi = new BigDecimal(String.valueOf(n - 1));
            do {
                factorial = factorial.multiply(BigDecimal.valueOf(bi.intValue()));
                bi = bi.subtract(BigDecimal.valueOf(1));
            }while (bi.intValue() != 1);
        }
        factorial = new BigDecimal(String.valueOf(factorial.add(BigDecimal.valueOf(1))));
        BigDecimal numWilson = new BigDecimal(String.valueOf(factorial.divide(BigDecimal.valueOf(n * n),
                2, RoundingMode.HALF_UP)));
        return factorial.compareTo(numWilson.multiply(BigDecimal.valueOf(n * n))) == 0;
    }

    @Override
    public double twoDecimalPlaces(double number) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String result = decimalFormat.format(number);
        return Double.valueOf(result);
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        int[] newArray = new int[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0) {
                newArray = Arrays.copyOf(newArray,newArray.length+1);
                newArray[newArray.length - 1] = numbers[i];
            }
        }
        return newArray;
    }

}
