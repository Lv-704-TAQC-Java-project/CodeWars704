package com.org.ita.kata.implementation.ykireyeva;

import com.org.ita.kata.Eight;

import java.math.BigDecimal;
import java.math.RoundingMode;

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
        return 0;
    }

    @Override
    public boolean amIWilson(double n) {
        BigDecimal bi1 = new BigDecimal("1");
        if (n == 0 || n == 1) {
            return false;
        }
        BigDecimal num = findFactorial(n - 1)
                .add(bi1)
                .divide((BigDecimal.valueOf((long) (n * n))),  4, RoundingMode.CEILING);
        return num.remainder(BigDecimal.ONE).compareTo(BigDecimal.ZERO) == 0;
    }

    private static BigDecimal findFactorial(double n) {
        BigDecimal factorial = BigDecimal.valueOf(1);
        for (int i = 2; i <= n; i++) {
            factorial = factorial.multiply(BigDecimal.valueOf(i));
        }
        return factorial;
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
