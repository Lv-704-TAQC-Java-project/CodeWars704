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
        int i = 5;
        int numOfZeros = 0;
        while (n / i >= 1) {
            numOfZeros += n / i;
            i*=5;
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
