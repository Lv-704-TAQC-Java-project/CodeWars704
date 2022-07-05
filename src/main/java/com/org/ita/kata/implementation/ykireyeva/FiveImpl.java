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
        long[] arr = new long[2];
        outer:
        for (long i = m; i <= i + g && i < n; i++) {
            if (checkForPrime(i) && checkForPrime(i + g)) {
                for (long j = i + 1; j < i + g; j++) {
                    if (checkForPrime(j) && checkForPrime(j + g)) {
                        return null;
                    }
                    if (checkForPrime(j)) {
                        i = i + g - 1;
                        continue outer;
                    }
                }
                arr[0] = i;
                arr[1] = i + g;
                return arr;
            }
        }
        return null;
    }

    private boolean checkForPrime(long inputNumber) {
        boolean isItPrime = true;
        if (inputNumber <= 1) {
            isItPrime = false;
        } else {
            for (int i = 2; i <= inputNumber / 2; i++) {
                if ((inputNumber % i) == 0) {
                    isItPrime = false;
                    break;
                }
            }
        }
        return isItPrime;
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
        double x = Math.sqrt(4 * m + 1);
        return (2 * m + 1 - x) / (2 * m);
    }

    @Override
    public long[] smallest(long n) {
        return new long[0];
    }
}
