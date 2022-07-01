package com.org.ita.kata.implementation.clarmmym;

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
        int countOf2 = 0;
        int countOf5 = 0;
        for (int i = 1; i < n; i++) {
            int currentNumber = i;
            while (currentNumber % 2 == 0) {
                countOf2++;
                currentNumber /= 2;

            }
            while (currentNumber % 5 == 0) {
                countOf5++;
                currentNumber /= 5;
            }
        }

        return Math.min(countOf2, countOf5);
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
        return new long[0];
    }
}
