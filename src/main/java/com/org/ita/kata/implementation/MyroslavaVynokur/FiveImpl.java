package com.org.ita.kata.implementation.MyroslavaVynokur;

import com.org.ita.kata.Base;
import com.org.ita.kata.Five;

import java.math.BigInteger;

public class FiveImpl extends Base implements Five {

    @Override
    public int artificialRain(int[] v) {

        int length = v.length;
        int result = 0;
        int[] left = new int[length];
        int[] right = new int[length];
        for (int i = 0; i < length; i++) {
            left[i] = 0;
            right[i] = 0;
        }

        for (int i = 1; i < length; i++) {
            if (v[i] >= v[i - 1]) {
                left[i] += left[i - 1] + 1;
            }
            if (v[length - i - 1] >= v[length - i]) {
                right[length - 1 - i] += right[length - i] + 1;
            }
        }

        for (int i = 0; i < length; i++) {
            if (result < left[i] + right[i] + 1) {
                result = left[i] + right[i] + 1;
            }
        }
        return result;
    }

    private static boolean isPrime(double n) {
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
    public long[] gap(int g, long m, long n) {
        long last = Long.MIN_VALUE;
        for (long i = m; i < n; i++) {
            if (isPrime(i)) {
                if (i - last == g) {
                    return new long[]{last, i};
                }
                last = i;
            }
        }
        return null;
    }

    @Override
    public int zeros(int n) {
        int count = 0;
        for (int i = 5; n / i >= 1; i *= 5)
            count += n / i;
        return count;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        BigInteger first;
        BigInteger second = BigInteger.valueOf(1);
        BigInteger sum = BigInteger.valueOf(0);
        BigInteger perimeter = BigInteger.valueOf(0);

        for (int i = 0; i <= n.intValue(); i++) {
            first = second;
            second = sum;
            sum = first.add(second);
            perimeter = perimeter.add(sum);
        }
        return perimeter.multiply(BigInteger.valueOf(4));
    }

    @Override
    public double solveSum(double m) {
        return -(-2 * m + Math.sqrt(4 * m + 1) - 1) / (2 * m);
    }

    @Override
    public long[] smallest(long n) {
        StringBuilder sb = new StringBuilder(String.valueOf(n));

        long smallest = n;
        long lastIndex = 0;
        long currentIndex = 0;

        for (int i = 0; i < sb.length(); i++) {
            for (int r = 0; r < sb.length(); r++) {
                char thisDigit = sb.charAt(i);
                StringBuilder buffer = new StringBuilder(String.valueOf(n));
                buffer.deleteCharAt(i);
                buffer.insert(r, thisDigit);

                long currentNumber = Long.parseLong(String.valueOf(buffer));
                if (currentNumber < smallest) {
                    smallest = currentNumber;
                    lastIndex = i;
                    currentIndex = r;
                }
            }

        }
        return new long[]{smallest, lastIndex, currentIndex};
    }
}
