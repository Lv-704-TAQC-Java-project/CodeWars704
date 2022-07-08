package com.org.ita.kata.implementation.ykireyeva;

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
        long[] res = new long[]{Long.MAX_VALUE, 0, 0};
        StringBuilder l = new StringBuilder(Long.toString(n));
        for (int i = l.length() - 1; i >= 0; i--) {
            for (int j = l.length() - 1; j >= 0; j--) {
                char x = l.charAt(i);
                l.deleteCharAt(i);
                l.insert(j, x);
                if (Long.parseLong(l.toString()) <= res[0]) {
                    res = new long[]{Long.parseLong(l.toString()), i, j};
                }
                l = new StringBuilder(Long.toString(n));
            }
        }
        return res;
    }
}
