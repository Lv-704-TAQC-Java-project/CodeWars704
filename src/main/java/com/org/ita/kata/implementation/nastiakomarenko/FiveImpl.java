package com.org.ita.kata.implementation.nastiakomarenko;

import com.org.ita.kata.Five;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FiveImpl implements Five {
    @Override
    public int artificialRain(int[] v) {
        return 0;
    }

    @Override
    public long[] gap(int g, long m, long n) {
        return new long[0];
    }

    @Override
    public int zeros(int factor) {

        int number = getFactorial(factor);
        String str = String.valueOf(number);
        int zeros = str.length() - str.replaceAll("0", "").length();
       return zeros;

    }
    public static int getFactorial(int f) {
        if (f <= 1) {
            return 1;
        } else {
            return f * getFactorial(f - 1);
        }
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        return null;
    }

    @Override
    public double solveSum(double m) {
        return 0;
    }

    @Override
    public long[] smallest(long n) {

            ArrayList<Integer> listOfDigits = numIntoDigits(n);
            StringBuilder s = new StringBuilder();
            long[] arr = new long[3];
            int min = Integer.MAX_VALUE;
            int indexOfMin = 0;
            int newIndex = 0;
            int resultNumber;
            for (int i = 1; i < listOfDigits.size(); i++){
                if (listOfDigits.get(i) < min){
                    min = listOfDigits.get(i);
                    indexOfMin = i;
                }
            }
            listOfDigits.remove(indexOfMin);
            if (min == 0 && indexOfMin == 1){
                indexOfMin = 0;
                newIndex = 1;
            }
            if (min < listOfDigits.get(0)){
                listOfDigits.add(0, min);
            } else {
                listOfDigits.add(1, min);
                newIndex = 1;
            }

            listOfDigits.forEach(s::append);
            resultNumber = Integer.parseInt(s.toString());
            arr[0] = resultNumber;
            arr[1] = indexOfMin;
            arr[2] = newIndex;
            System.out.println(Arrays.toString(arr));
            return arr;
        }

        private ArrayList<Integer> numIntoDigits(long n){
            ArrayList<Integer> list = new ArrayList<>();
            while (n > 0){
                list.add((int) (n % 10));
                n = n/10;
            }
            Collections.reverse(list);
            return list;
        }
}
