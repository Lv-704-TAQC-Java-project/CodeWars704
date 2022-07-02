package com.org.ita.kata.implementation.YaroslavTarasovych;

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
        double s = Math.sqrt(4 * m + 1);
        return (2 * m + 1 - s) / (2 * m);
    }

    @Override
    public long[] smallest(long n) {
        StringBuilder num = new StringBuilder(String.valueOf(n));
        long min = n;
        long minStart = 0;
        long minEnd = 0;
        for (int i = 0; i < num.length(); i++) {
            for (int j = 0; j < num.length(); j++) {
                char c = num.charAt(i);
                StringBuilder anotherNum = new StringBuilder(String.valueOf(n));
                anotherNum.deleteCharAt(i);
                anotherNum.insert(j, c);
                long a = Long.parseLong(String.valueOf(anotherNum));
                if (a < min) {
                    min = a;
                    minStart = i;
                    minEnd = j;
                }
            }
        }
        return new long[]{min, minStart, minEnd};
    }
}
