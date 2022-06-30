package com.org.ita.kata.implementation.nastiakomarenko;

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
        return new int[0];
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        int res [] = new int[2];
        int count =0,sum=0;
        if(input!=null&&input.length>0) {
            for (int i = 0; i < input.length; i++) {
                if (input[i] > 0) {
                    count++;
                } else {
                    sum += input[i];
                }
            }
            res[0] = count;
            res[1] = sum;
            System.out.println(Arrays.toString(res));
        }else{
            System.out.println("0");
        }
        return new int[0];

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
        return 0;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        return new int[0];
    }
}
