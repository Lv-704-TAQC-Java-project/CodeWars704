package com.org.ita.kata.implementation.ykireyeva;

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
        return Arrays.stream(array)
                .map(x -> (x % Math.sqrt(x) == 0) ? (int) Math.sqrt(x) : x * x)
                .toArray();
    }

        @Override
        public int[] countPositivesSumNegatives ( int[] input){
            return new int[0];
        }

        @Override
        public int stringToNumber (String str){
            return 0;
        }

        @Override
        public boolean amIWilson ( double n){
            return false;
        }

        @Override
        public double twoDecimalPlaces ( double number){
            return 0;
        }

        @Override
        public int[] divisibleBy ( int[] numbers, int divider){
            return new int[0];
        }
    }
