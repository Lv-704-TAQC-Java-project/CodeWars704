package com.org.ita.kata.implementation.MyroslavaVynokur;

import com.org.ita.kata.Five;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class FiveImpl implements Five {
    @Override
    public int artificialRain(int[] v) {
        return 0;
    }

    private static boolean isPrime(double n) {
        boolean prime = true;
        for (int k = 2; k <= n / 2; k++) {
            if ((n % k) == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }

    public long[] gap(int g, long m, long n) {
        List<Long> primeLongs = new ArrayList<>();

        for (long i = m; i < n; i++)
            if (FiveImpl.isPrime(i)) {
                primeLongs.add(i);
            }

        long[] arr = new long[2];

        for (int j = 0; j < primeLongs.size() - 1; j++) {
            if ((primeLongs.get(j) + g) == primeLongs.get(j + 1)) {
                arr[0] = primeLongs.get(j);
                arr[1] = (primeLongs.get(j + 1));
                break;
            }
        }
        if (arr[0] == 0 & arr[1] == 0) arr = null;
        return arr;
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
