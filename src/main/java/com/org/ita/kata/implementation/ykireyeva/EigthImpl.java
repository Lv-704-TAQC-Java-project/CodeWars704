package com.org.ita.kata.implementation.ykireyeva;

import com.org.ita.kata.Base;
import com.org.ita.kata.Eight;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;

public class EigthImpl extends Base implements Eight {

    private static BigDecimal findFactorial(double n) {
        BigDecimal factorial = BigDecimal.valueOf(1);
        for (int i = 2; i <= n; i++) {
            factorial = factorial.multiply(BigDecimal.valueOf(i));
        }
        return factorial;
    }

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
        return Float.parseFloat(new DecimalFormat("0.00")
                .format(mpg / 2.8248094)
                .replace(",", "."));
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        return Arrays.stream(array)
                .map(x -> (x % Math.sqrt(x) == 0) ? (int) Math.sqrt(x) : x * x)
                .toArray();
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
        return Integer.parseInt(str.trim());
    }

    @Override
    public boolean amIWilson(double n) {
        BigDecimal bi1 = new BigDecimal("1");
        if (n == 0 || n == 1) {
            return false;
        }
        BigDecimal num = findFactorial(n - 1)
                .add(bi1)
                .divide((BigDecimal.valueOf((long) (n * n))), 4, RoundingMode.CEILING);
        return num.remainder(BigDecimal.ONE).compareTo(BigDecimal.ZERO) == 0;
    }

    @Override
    public double twoDecimalPlaces(double number) {
        return Double.parseDouble(new DecimalFormat("#.##")
                .format(number)
                .replace(",", "."));
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        return Arrays.stream(numbers)
                .filter(x -> x % divider == 0)
                .toArray();
    }
}
