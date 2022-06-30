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
        long[] numbers = null;
        BigInteger bigInteger;
        for (long i = m; i <= n - g; i++) {
            bigInteger = BigInteger.valueOf(i);
            if (! bigInteger.isProbablePrime((int) Math.log(i)))
                continue;
            bigInteger = BigInteger.valueOf(i + g);
            if (! bigInteger.isProbablePrime((int) Math.log(i + g)))
                continue;
            boolean flag = false;
            for (int j = 2; j < g; j++) {
                bigInteger = BigInteger.valueOf(i + j);
                if (bigInteger.isProbablePrime((int) Math.log(i + g))) flag = true;
            }
            if (flag) continue;
            numbers = new long[]{i, i + g};
            break;
        }
        return numbers;
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
        return new long[0];
    }
}
