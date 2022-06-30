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

        int[] squareOrSquareRootArr = new int[array.length];

        for(int i = 0; i < array.length; i++){
            if(Math.sqrt(array[i]) % 1 == 0.0){
                squareOrSquareRootArr[i] = (int)Math.sqrt(array[i]);
            } else {
                squareOrSquareRootArr[i] = array[i] * array[i];
            }
        }
        return squareOrSquareRootArr;
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
