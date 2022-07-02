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

        return Math.round(number * 100) / 100.0;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {

        IntStream stream = Arrays.stream(numbers);

        return stream.filter(i -> i % divider == 0).toArray();
    }
}
