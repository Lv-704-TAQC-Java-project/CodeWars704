package com.org.ita.kata.implementation.nastiakomarenko;

import com.org.ita.kata.BaseKata;
import com.org.ita.kata.Eight;

import java.util.Arrays;

public class EightImpl extends BaseKata implements Eight {
    public static double factorial(double number) {
        if (number <= 1) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }

    }

    @Override
    public int liters(double time) {
        return (int) Math.floor(time * 0.5);

    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {

        return length * width * height;
    }

    @Override
    public float mpgToKPM(float mpg) {
        //const
        float gallon = 4.54609188f;
        float mile = 1.609344f;
        float round = 100f;

        return Math.round(mpg / gallon * mile * round) / round;

    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {

        int[] res = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int a = array[i];
            if (Math.sqrt(a) % 1 == 0) {
                res[i] = (int) Math.sqrt(a);
            } else {
                res[i] = a * a;
            }

        }
        return res;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        int[] res = new int[2];
        int count = 0, sum = 0;
        if (input != null && input.length > 0) {
            for (int i = 0; i < input.length; i++) {
                if (input[i] > 0) {
                    count++;
                } else {
                    sum += input[i];
                }
            }
            res[0] = count;
            res[1] = sum;
        } else {
            System.out.println("0");
        }
        return res;
    }

    @Override
    public int stringToNumber(String str) {
        return Integer.parseInt(str);

    }

    @Override
    public boolean amIWilson(double n) {
        return (factorial(n - 1) + 1) % (n * n) == 0;
    }

    @Override
    public double twoDecimalPlaces(double number) {

        return (double) Math.round(number * 100) / 100;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        int[] newArray = new int[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0) {
                newArray = Arrays.copyOf(newArray, newArray.length + 1);
                newArray[newArray.length - 1] = numbers[i];

            }
        }
        return newArray;
    }
}
