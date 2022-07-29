package com.org.ita.kata.implementation.clarmmym;

import com.org.ita.kata.BaseKata;
import com.org.ita.kata.Five;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FiveImpl extends BaseKata implements Five {
    @Override
    public int artificialRain(int[] v) {
        if (v.length == 1) {
            return 1;
        }

        int result = 0;

        for (int i = 1; i < v.length; i++) {
            int left = i;
            int right = i;
            int current = i;

            int lCount = 0;
            int rCount = 0;

            while (left != 0) {
                if (v[left - 1] <= v[current]) {
                    lCount++;
                    current = left - 1;
                    left--;
                } else {
                    break;
                }
            }

            current = i;

            while (right != v.length - 1) {
                if (v[right + 1] <= v[current]) {
                    rCount++;
                    current = right + 1;
                    right++;
                } else {
                    break;
                }
            }

            if (lCount + rCount + 1 >= result) {
                result = lCount + rCount + 1;
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
        int count = 0;
        for (int i = 5; i < n; i *= 5) {
            count += n / i;
        }
        return count;
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
        return (2 * m - Math.sqrt(4 * m + 1) + 1) / (2 * m);
    }

    @Override
    public long[] smallest(long n) {
        char[] numbers = ("" + n).toCharArray();

        int firstNumber = Integer.parseInt(String.valueOf(numbers[0]));
        int minNumber = firstNumber;
        int biggerThenFirth = Integer.parseInt(String.valueOf(numbers[1]));
        int subtraction = biggerThenFirth - firstNumber;
        int positionMinNumber = 0;
        int indexBiggerThenFirst = 0;
        boolean isBiggerThenFirst = false;

        for (int i = 1; i < numbers.length; i++) {
            int currentN = Integer.parseInt(String.valueOf(numbers[i]));
            if (currentN <= minNumber) {
                minNumber = currentN;
                positionMinNumber = i;
            }
        }


        if (positionMinNumber == 0) {
            for (int i = 1; i < numbers.length; i++) {
                int currentN = Integer.parseInt(String.valueOf(numbers[i]));
                if (currentN - firstNumber < subtraction) {
                    isBiggerThenFirst = true;
                    positionMinNumber = i;
                    if (currentN == minNumber) {
                        indexBiggerThenFirst = i;
                    }

                    subtraction = currentN - firstNumber;
                    biggerThenFirth = currentN;
                }
            }
        }

        StringBuilder numbInString = new StringBuilder("" + n);

        long[] result;
        if (isBiggerThenFirst) {
            numbInString.deleteCharAt(positionMinNumber);
            numbInString.insert(indexBiggerThenFirst + 1, biggerThenFirth);

            result = new long[]{Integer.parseInt(String.valueOf(numbInString)), positionMinNumber, indexBiggerThenFirst + 1};
        } else {
            StringBuilder secondNumbInString = new StringBuilder(numbInString);

            numbInString.deleteCharAt(positionMinNumber);
            numbInString.insert(0, minNumber);

            secondNumbInString.deleteCharAt(0);
            secondNumbInString.insert(positionMinNumber, firstNumber);

            boolean firstOrSecond = Integer.parseInt(String.valueOf(numbInString)) < Integer.parseInt(String.valueOf(secondNumbInString));
            if (firstOrSecond) {
                result = new long[]{Integer.parseInt(String.valueOf(numbInString)), positionMinNumber, 0};
            } else {
                result = new long[]{Integer.parseInt(String.valueOf(secondNumbInString)), 0, positionMinNumber};
            }
        }
        return result;
    }
}
