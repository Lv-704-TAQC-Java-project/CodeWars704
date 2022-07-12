package com.org.ita.kata.implementation.MyroslavaVynokur;

import com.org.ita.kata.Base;
import com.org.ita.kata.Eight;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;


public class EigthImpl extends Base implements Eight {
    @Override
    public int liters(double time) {
        if(time > 0){
            return (int) Math.floor(time * 0.5);
        }
        return 0;
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        double volume = length * width * height;
        if (volume > 0) {
            return volume;
        } else throw new ArithmeticException("Input numbers should be bigger than 0");
    }

    @Override
    public float mpgToKPM(float mpg) {
        final float galonLitres = 4.54609188f;
        final float mileKilometres = 1.609344f;
        float result = (mpg / galonLitres) * mileKilometres;
        String resultStr = result % 1 != 0 ? (String.format("%.02f", result))
                : (String.format("%.01f", result));
        String answer = resultStr.replaceAll(",", ".");
        return Float.parseFloat(answer);
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (Math.sqrt(array[i]) % 1 == 0) {
                array[i] = (int) Math.sqrt(array[i]);
            } else {
                array[i] = (int) Math.pow(array[i], 2);
            }
        }
        return array;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) {
            return new int[]{};
        }
        int amountOfPositive = 0;
        int sumOfNegative = 0;
        for (int i : input) {
            if (i > 0) {
                amountOfPositive++;
            } else {
                sumOfNegative += i;
            }
        }
        return new int[]{amountOfPositive, sumOfNegative};
    }

    @Override
    public int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    @Override
    public boolean amIWilson(double n) {
        return n == 5 || n == 13 || n == 563;
    }

    @Override
    public double twoDecimalPlaces(double number) {
        DecimalFormat df = new DecimalFormat("0.00");
        String resultStr = df.format(number);
        resultStr = resultStr.replaceAll(",", ".");
        return Double.parseDouble(resultStr);
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        List<Integer> arrayList = new ArrayList<>();
        for (int number : numbers) {
            if (number % divider == 0) {
                arrayList.add(number);
            }
        }
        return arrayList.stream().mapToInt(Integer::intValue).toArray();
    }
}
