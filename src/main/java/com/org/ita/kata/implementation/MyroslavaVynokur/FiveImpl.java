package com.org.ita.kata.implementation.MyroslavaVynokur;

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
        return null;
    }

    @Override
    public double solveSum(double m) {
        return 0;
    }

    @Override
    public long[] smallest(long n) {
        StringBuilder sb = new StringBuilder(String.valueOf(n));

        long smallest = n;
        long lastIndex = 0;
        long currentIndex = 0;

        for (int i = 0; i < sb.length(); i++) {
            for (int r = 0; r < sb.length(); r++) {
                char thisDigit = sb.charAt(i);
                StringBuilder buffer = new StringBuilder(String.valueOf(n));
                buffer.deleteCharAt(i);
                buffer.insert(r, thisDigit);

                long currentNumber = Long.parseLong(String.valueOf(buffer));
                if (currentNumber < smallest) {
                    smallest = currentNumber;
                    lastIndex = i;
                    currentIndex = r;
                }
            }

        }
        return new long[]{smallest, lastIndex, currentIndex};
    }
}
