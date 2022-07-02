package com.org.ita.kata.implementation.OliaZakharcuk;

import com.org.ita.kata.Five;

import java.math.BigInteger;

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
    public int zeros(int n) {
        return 0;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {

        BigInteger firstElem = BigInteger.valueOf(0);
        BigInteger secondElem = BigInteger.valueOf(1);
        BigInteger sum = BigInteger.valueOf(0);

        for (BigInteger j = BigInteger.valueOf(0); j.compareTo(n.add(BigInteger.valueOf(1))) < 0; j = j.add(BigInteger.valueOf(1))) {
            sum = sum.add(secondElem);
            BigInteger temp = firstElem;
            firstElem = secondElem;
            secondElem = secondElem.add(temp);
        }
        return sum.multiply(BigInteger.valueOf(4));
    }

    @Override
    public double solveSum(double m) {

        return  1 + (1 - Math.sqrt(1+4*m)) / (2*m);

    }

    @Override
    public long[] smallest(long n) {

        StringBuilder num = new StringBuilder(String.valueOf(n));
        long smallestNumber = n;
        long firstIndex = 0;
        long secondIndex = 0;

        for (int i = 0; i < num.length(); i++) {
            for (int j = 0; j < num.length(); j++) {

                StringBuilder tempNum = new StringBuilder(String.valueOf(n));
                char currenrChar = num.charAt(i);
                tempNum.deleteCharAt(i);
                tempNum.insert(j, currenrChar);

                long longTempNum = Long.parseLong(tempNum.toString());
                if (longTempNum < smallestNumber) {
                    smallestNumber = longTempNum;
                    firstIndex = i;
                    secondIndex = j;
                }
            }
        }
        return new long[]{smallestNumber, firstIndex, secondIndex};
    }
}
