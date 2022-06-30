package com.org.ita.kata.implementation.OliaZakharcuk;

import com.org.ita.kata.Eight;

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
