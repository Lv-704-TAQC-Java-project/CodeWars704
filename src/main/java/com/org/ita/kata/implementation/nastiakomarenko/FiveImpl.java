package com.org.ita.kata.implementation.nastiakomarenko;

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

        List<Long> primes = new ArrayList<>();

        for (long i = m; i < n; i++)
            if (FiveImpl.prime(i)) {
                primes.add(i);
            }

        long[] arr = new long[2];

        for (int j = 0; j < primes.size() - 1; j++) {
            if ((primes.get(j) + g) == primes.get(j + 1)) {
                arr[0] = primes.get(j);
                arr[1] = (primes.get(j + 1));
                break;
            }
        }
        if (arr[0] == 0 & arr[1] == 0)
        {
            arr = null;
        }
        return arr;
        }
    private static boolean prime(double n) {
        boolean prime = true;
        for (int m = 2; m <= n / 2; m++) {
            if ((n % m) == 0) {
                prime = false;
                break;
            }
        }
        return prime;
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
