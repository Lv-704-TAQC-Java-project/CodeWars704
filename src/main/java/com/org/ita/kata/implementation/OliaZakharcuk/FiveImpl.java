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

        int count = 0;
        double kMax = customLog(n);
        for(int k = 1; k < kMax; k++){
            count = count + (int)(n / Math.pow(5, k));
        }
        return count;
    }
    private static double customLog(double logNumber) {
        double base = 5;
        return Math.log(logNumber) / Math.log(base);
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
