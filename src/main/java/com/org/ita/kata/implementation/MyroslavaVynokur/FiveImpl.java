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
        BigInteger first;
        BigInteger second = BigInteger.valueOf(1);
        BigInteger sum = BigInteger.valueOf(0);
        BigInteger perimetr = BigInteger.valueOf(0);

        for (int i = 0; i <= n.intValue(); i++) {
            first = second;
            second = sum;
            sum = first.add(second);
            perimetr = perimetr.add(sum);
        }
        return perimetr.multiply(BigInteger.valueOf(4));
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
