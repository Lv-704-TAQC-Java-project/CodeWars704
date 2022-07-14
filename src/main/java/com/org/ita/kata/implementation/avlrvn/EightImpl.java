package com.org.ita.kata.implementation.avlrvn;

import com.org.ita.kata.Base;
import com.org.ita.kata.Eight;

public class EightImpl extends Base implements Eight {

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
        return (float) Math.round(100 * mpg * 1.609344 / 4.54609188) / 100;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        for (int i = 0; i < array.length; i++) {
            double sqr = Math.sqrt(array[i]);
            if (sqr == Math.round(sqr)) {
                array[i] = (int) sqr;
            } else {
                array[i] = array[i] * array[i];
            }
        }
        return array;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) return new int[]{};
        int count = 0, sum = 0;
        for (int i : input) {
            if (i > 0) count++;
            if (i < 0) sum += i;
        }
        return new int[]{count, sum};
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
