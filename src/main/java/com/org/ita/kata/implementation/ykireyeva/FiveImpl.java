package com.org.ita.kata.implementation.ykireyeva;

import com.org.ita.kata.Five;

import java.math.BigInteger;
import java.util.stream.LongStream;

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
        int k = 1;
        int numOfZeros = 0;
        long fact = LongStream.rangeClosed(1, n)
                .reduce(1, (x, y) -> x * y);
        double rest = fact % Math.pow(5, k);
        while (rest == 0) {
            fact /= Math.pow(5, k);
            rest = fact % Math.pow(5, k);
            numOfZeros++;
        }
        return numOfZeros;
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
