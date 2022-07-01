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
        BigInteger i = n.add(BigInteger.valueOf(1));
        BigInteger num1 = BigInteger.valueOf(0);
        BigInteger num2 = BigInteger.valueOf(1);
        BigInteger sum = BigInteger.valueOf(0);
        for (BigInteger j = BigInteger.valueOf(0); j.compareTo(i) < 0; j = j.add(BigInteger.valueOf(1))) {
            sum = sum.add(num2);
            BigInteger a = num1;
            num1 = num2;
            num2 = num2.add(a);
        }
        return sum.multiply(BigInteger.valueOf(4));
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
