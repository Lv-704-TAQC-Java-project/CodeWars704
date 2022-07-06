package com.org.ita.kata.implementation.MyroslavaVynokur;

import com.org.ita.kata.Five;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class FiveImpl implements Five {
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

    @Override
    public int artificialRain(int[] v) {
        return 0;
    }

    @Override
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
        BigInteger result = BigInteger.valueOf(1);
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return String.valueOf(result).chars()
                .reduce(0, (count, ch) -> (ch == '0') ? count + 1 : 0);
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        BigInteger first;
        BigInteger second = BigInteger.valueOf(1);
        BigInteger sum = BigInteger.valueOf(0);
        BigInteger perimetr = BigInteger.valueOf(0);

        for (int i = 0; i <= n.intValue(); i++) {
            first = second;
            second = sum;
            sum = first.add(second);
            perimetr = perimetr.add(sum);
        }
        return perimetr.multiply(BigInteger.valueOf(4));
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
