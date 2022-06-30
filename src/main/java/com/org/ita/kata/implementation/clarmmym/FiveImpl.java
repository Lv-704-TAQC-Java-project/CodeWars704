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
        return 0;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        return null;
    }

    @Override
    public double solveSum(double m) {
        double floor = 0;
        double top = 1;
        double x = (top - floor) / 2 + floor;
        double exp = 1e-12;

        double actual = f(x);
        while (Math.abs(m - actual) > exp) {
            if (m> actual) {
                floor = x;
            } else {
                top = x;
            }
            x = floor + (top - floor) / 2;
            actual = f(x);
        }
        return x;
    }

    private double f(double x) {
        int U = 1_000_000;
        double sum = 0;

        for (int i = 0; i < U; i++) {
            sum += i * Math.pow(x, i);
        }
        return sum;
    }

    @Override
    public long[] smallest(long n) {
        return new long[0];
    }
}
