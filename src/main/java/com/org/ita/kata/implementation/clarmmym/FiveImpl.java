package com.org.ita.kata.implementation.clarmmym;

import com.org.ita.kata.Five;

import java.math.BigInteger;
import java.util.Arrays;

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
        int countOf2 = 0;
        int countOf5 = 0;
        for (int i = 1; i < n; i++) {
            int currentNumber = i;
            while (currentNumber % 2 == 0) {
                countOf2++;
                currentNumber /= 2;

            }
            while (currentNumber % 5 == 0) {
                countOf5++;
                currentNumber /= 5;
            }
        }

        return Math.min(countOf2, countOf5);
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        final int PERIMETER_CONST = 4;
        int result = PERIMETER_CONST * Arrays.stream((fib(n.add(BigInteger.valueOf(1))))).sum();
        return BigInteger.valueOf(result);
    }

    private int[] fib(BigInteger n) {
        int[] f = new int[n.add(BigInteger.valueOf(2)).intValue()];

        f[0] = 0;
        f[1] = 1;

        for (int i = 2; i <= n.intValue(); i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f;
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
