package com.org.ita.kata.implementation.clarmmym;

import com.org.ita.kata.Base;
import com.org.ita.kata.Eight;

import java.util.ArrayList;
import java.util.List;

public class EightImpl extends Base implements Eight {
    private static boolean hasIntegerRoot(int number) {
        int root = (int) Math.sqrt(number);
        return Math.pow(root, 2) == number;

    }


    @Override
    public int liters(double time) {
        if (time <= 0) {
            return 0;
        }
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
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int element = array[i];

            if (hasIntegerRoot(element)) {
                result[i] = (int) Math.sqrt(element);
            } else {
                result[i] = (int) Math.pow(element, 2);
            }
        }
        return result;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
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

                return new int[]{count, sum};
            }
        }
        return new int[]{};
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
