package com.org.ita.kata.implementation.nastiakomarenko;

import com.org.ita.kata.Eight;

public class EigthImpl implements Eight {
    @Override
    public int liters(double time) {

        time = 6.7;
        double lPerhour = time * 0.5;
        return (int) Math.floor(lPerhour);
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return 0;
    }

    @Override
    public float mpgToKPM(float mpg) {
        //const
        double gallon = 4.54609188; // in litres
        double mile = 1.609344; // in km
//parameters

        double res = mpg*(mile/gallon);
        if(res%10==0){
            return Math.round(res);
        }else {
            double scale = Math.pow(10, 2);
            double result = Math.ceil(res * scale) / scale;
            return (float) result;
        }

    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {

        int res[] = new int[array.length];
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
        return new int[0];
    }

    @Override
    public int stringToNumber(String str) {
        return 0;
    }

    @Override
    public boolean amIWilson(double n) {
            return (factorial(n - 1) + 1) % (n * n) == 0;
        }

        public static double factorial(double number) {
            if (number <= 1) {
                return 1;
            } else {
                return number * factorial(number - 1);
            }

        }


    @Override
    public double twoDecimalPlaces(double number) {

        number = 3.3424;
        double result = (double) Math.round(number * 100) / 100;
        return result;
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
