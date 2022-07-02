package com.org.ita.kata.implementation.dankomax;

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
        StringBuilder originalNum = new StringBuilder(String.valueOf(n));
        long smallestNum = n;
        long takeIdx = 0;
        long insertIdx = 0;
        for (int i = 0; i < originalNum.length(); i++) {
            for (int j = 0; j < originalNum.length(); j++) {
                char c = originalNum.charAt(i);
                StringBuilder tempNum = new StringBuilder(String.valueOf(n))
                        .deleteCharAt(i)
                        .insert(j, c);
                long currentNum = Long.parseLong(String.valueOf(tempNum));
                if (currentNum < smallestNum) {
                    smallestNum = currentNum;
                    takeIdx = i;
                    insertIdx = j;
                }
            }
        }
        return new long[]{smallestNum, takeIdx, insertIdx};
    }
}
