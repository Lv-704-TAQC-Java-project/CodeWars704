package com.org.ita.kata.implementation.clarmmym;

import com.org.ita.kata.Five;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FiveImpl implements Five {
    @Override
    public int artificialRain(int[] v) {
        if(v.length==1){
            return 1;
        }

        int result = 0;

        for (int i = 0; i < v.length; i++) {
            int left = i;
            int right = i;
            int current = i;

            int lCount = 0;
            int rCount = 0;

            while (left != 0) {
                if (v[left] <= v[current]) {
                    lCount++;
                    current = left;
                    left--;
                } else {
                    break;
                }
            }

            current = i;

            while (right != v.length - 1) {
                if (v[right] <= v[current]) {
                    rCount++;
                    current = right;
                    right++;
                } else {
                    break;
                }
            }

            if (lCount + rCount >= result) {
                result = lCount + rCount;
            }

        }

        return result;
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
        double floor = 0;
        double top = 1;
        double x = (top - floor) / 2 + floor;
        double exp = 1e-12;

        double actual = f(x);
        while (Math.abs(m - actual) > exp) {
            if (m > actual) {
                floor = x;
            } else {
                top = x;
            }
            x = floor + (top - floor) / 2;
            actual = f(x);
        }
        return x;
    }

    private double f(double x) {
        int U = 1_000_000;
        double sum = 0;

        for (int i = 0; i < U; i++) {
            sum += i * Math.pow(x, i);
        }
        return sum;
    }

    @Override
    public long[] smallest(long n) {
        return new long[0];
    }
}
