package com.org.ita.kata.implementation.OliaZakharcuk;

import com.org.ita.kata.Eight;

import java.util.*;
import java.util.stream.*;
import java.util.ArrayList;

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

        int[] resultArr = new int[2];
        int counterOfPositiveNumbers = 0;
        int sumOfNegativeNumbers = 0;

        if (input == null || input.length == 0){
            return new int[0];
        }

        for(int i : input){
            if(i > 0){
                counterOfPositiveNumbers++;
            }else {
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
        if((fact + 1) / (n * n) % 1 == 0){
            isWilson = true;
        }else{
            isWilson = false;
        }
        return isWilson;
    }

    private static long factorial(double n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
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
