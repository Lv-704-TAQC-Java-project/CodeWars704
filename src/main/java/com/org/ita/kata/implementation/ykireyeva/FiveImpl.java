package com.org.ita.kata.implementation.ykireyeva;

import com.org.ita.kata.Base;
import com.org.ita.kata.Five;

import java.math.BigInteger;
import java.util.stream.IntStream;

public class FiveImpl extends Base implements Five {
    private static int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    @Override
    public int artificialRain(int[] v) {
        int[] right = countRight(v);
        int[] left = countLeft(v);
        int result = 0;

        for (int i = 0; i < left.length; i++) {
            result = Math.max(left[i] + right[i] + 1, result);
        }

        return result;
    }

    static boolean canFlowLeft(int[] v, int i) {
        if (i == 0)
            return false;
        return v[i - 1] <= v[i];
    }

    static boolean canFlowRight(int[] v, int i) {
        if (v.length - 1 == i)
            return false;
        return v[i + 1] <= v[i];
    }


    static int[] countLeft(int[] v) {
        int[] result = new int[v.length];

        for (int i = 0; i < v.length; i++) {
            if (canFlowLeft(v, i)) {
                result[i] = result[i - 1] + 1;
            } else {
                result[i] = 0;
            }
        }
        return result;
    }

    static int[] countRight(int[] v) {
        int[] result = new int[v.length];

        for (int i = v.length - 1; i >= 0; i--) {
            if (canFlowRight(v, i)) {
                result[i] = result[i + 1] + 1;
            } else {
                result[i] = 0;
            }
        }
        return result;
    }

    @Override
    public long[] gap(int g, long m, long n) {
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
                return new long[]{i, i + g};
            }
        }
        return null;
    }

    private boolean checkForPrime(long inputNumber) {
        boolean isItPrime = true;
        for (int i = 2; i <= inputNumber / 2; i++) {
            if ((inputNumber % i) == 0) {
                isItPrime = false;
                break;
            }
        }
        return isItPrime;
    }

    @Override
    public int zeros(int n) {
        int i = 5;
        int numOfZeros = 0;
        while (n / i >= 1) {
            numOfZeros += n / i;
            i *= 5;
        }
        return numOfZeros;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        int sum = IntStream.rangeClosed(1, n.intValue() + 1)
                .map(FiveImpl::fibonacci).sum();
        return BigInteger.valueOf(4L * sum);
    }

    @Override
    public double solveSum(double m) {
        double x = Math.sqrt(4 * m + 1);
        return (2 * m + 1 - x) / (2 * m);
    }

    @Override
    public long[] smallest(long n) {
        long[] res = new long[]{Long.MAX_VALUE, 0, 0};
        StringBuilder str = new StringBuilder(Long.toString(n));
        for (int i = str.length() - 1; i >= 0; i--) {
            for (int j = str.length() - 1; j >= 0; j--) {
                char elToReplace = str.charAt(i);
                str.deleteCharAt(i);
                str.insert(j, elToReplace);
                if (Long.parseLong(str.toString()) <= res[0]) {
                    res = new long[]{Long.parseLong(str.toString()), i, j};
                }
                str = new StringBuilder(Long.toString(n));
            }
        }
        return res;
    }
}
