package com.org.ita.kata.implementation.clarmmym;

import com.org.ita.kata.Five;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class FiveImpl implements Five {
    @Override
    public int artificialRain(int[] v) {
        return 0;
    }

    @Override
    public long[] gap(int g, long m, long n) {
        List<Long> primeNumbers = new ArrayList<>();

        for (long i = m; i <= n; i++) {
            if (isPrimeNumber(i)) {
                primeNumbers.add(i);
            }
        }

        long start = primeNumbers.get(0);
        long end = primeNumbers.get(primeNumbers.size() - 1);
        for (int i = 0; start != end; i++) {
            long currentNumber = primeNumbers.get(i);
            if (currentNumber - start == g) {
                return new long[]{start, currentNumber};
            } else {
                start = currentNumber;
            }
        }
        return null;
    }

    private boolean isPrimeNumber(long number) {
        boolean result = true;
        long controlNumber = (long) Math.sqrt(number);
        for (long i = 2; i <= controlNumber; i++) {
            if (number % i == 0) {
                result = false;
                break;
            }
        }
        return result;
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
