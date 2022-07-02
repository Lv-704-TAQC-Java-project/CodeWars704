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
        long currentPrime;
        long previousPrime = 0;

        for (long i = m; i <= n; i++) {
            if (isPrime(i)) {
                currentPrime = i;
                if (previousPrime != 0 && currentPrime - previousPrime == g) {
                    return new long[]{previousPrime, currentPrime};
                }
                previousPrime = currentPrime;
            }
        }
        return null;
    }

    private static boolean isPrime(long n) {
        if (n <= 1) {
            return false;
        }
        for (long i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
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
