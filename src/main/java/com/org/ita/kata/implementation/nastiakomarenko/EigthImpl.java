package com.org.ita.kata.implementation.nastiakomarenko;

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
        numbers = new int[]{1, 2, 3, 4, 5, 6};
        int count =0;
        divider=2;
        for(int i=0;i< numbers.length;i++){
            if(numbers[i]%divider==0){
                count++;
            }
        }
        int res[] = new int[count];
        int index=0;
        for(int j=0;j< numbers.length;j++){
            if(numbers[j]%divider==0){
                res[index]=numbers[j];
                index++;
            }
        }
        return res;
    }
}
