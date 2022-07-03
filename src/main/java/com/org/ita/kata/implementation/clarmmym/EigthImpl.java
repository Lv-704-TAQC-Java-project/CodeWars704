package com.org.ita.kata.implementation.clarmmym;

import com.org.ita.kata.Eight;

import java.util.ArrayList;
import java.util.List;

public class EigthImpl implements Eight {
    @Override
    public int liters(double time) {
        final double LITER_PER_HOUR = 0.5;
        return (int) Math.floor(time * LITER_PER_HOUR);
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return length * width * height;
    }

    @Override
    public float mpgToKPM(float mpg) {
        final float GAL_L = 4.54609188f;
        final float MILE_KM = 1.609344f;
        final float MPG_TO_KPM = GAL_L / MILE_KM;
        final float HUNDRED = 100.0f;

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
        int[] result = new int[2];
        if (input != null) {
            if (input.length != 0) {
                int count = 0;
                int sum = 0;

                for (int element : input) {
                    if (element > 0) {
                        count++;
                    } else if (element < 0) {
                        sum += element;
                    }
                }

                result[0] = count;
                result[1] = sum;
            }
        }
        return result;
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
        return Math.round(number * 100.0) / 100.0;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        List<Integer> result = new ArrayList<>();
        for (int n : numbers) {
            if (n % divider == 0) {
                result.add(n);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}
