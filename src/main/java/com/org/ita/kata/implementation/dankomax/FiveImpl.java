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
        int count = 0;

        for (int i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }

        return count;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        BigInteger currentValue = BigInteger.ONE;
        BigInteger prevValue = BigInteger.ZERO;
        BigInteger sum = BigInteger.ONE;
        BigInteger temp;

        if (n.equals(sum)) {
            return sum;
        }

        BigInteger i = BigInteger.valueOf(2);
        while (n.add(BigInteger.valueOf(2)).compareTo(i) > 0) {
            temp = currentValue;
            currentValue = prevValue.add(currentValue);
            prevValue = temp;
            i = i.add(BigInteger.ONE);
            sum = sum.add(currentValue);
        }

        return sum.multiply(BigInteger.valueOf(4));
    }

    @Override
    public double solveSum(double m) {
        double s = Math.sqrt(4 * m + 1);
        return (2 * m + 1 - s) / (2 * m);
    }

    @Override
    public long[] smallest(long n) {
        return new long[0];
    }
}
