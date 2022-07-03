package com.org.ita.kata.implementation.OliaZakharcuk;

import com.org.ita.kata.Five;

import java.math.BigInteger;
import java.util.ArrayList;

public class FiveImpl implements Five {
    private static boolean isPrime(long n) {

        for (long i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static ArrayList<Long> getPrimeNumbers(long m, long n) {

        ArrayList<Long> primeNumbers = new ArrayList<>();

        for (long i = m; i <= n; i++) {
            if (isPrime(i)) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }

    private static double customLog(double logNumber) {
        double base = 5;
        return Math.log(logNumber) / Math.log(base);
    }

    @Override
    public int artificialRain(int[] v) {
        return 0;
    }

    @Override
    public long[] gap(int g, long m, long n) {

        ArrayList<Long> primeNumbers = getPrimeNumbers(m, n);
        long firstElem = primeNumbers.get(0);


        for (long currentElem : primeNumbers) {
            if (currentElem - firstElem == g) {
                return new long[]{firstElem, currentElem};
            } else {
                firstElem = currentElem;
            }
        }
        return null;
    }

    @Override
    public int zeros(int n) {

        int count = 0;
        double kMax = customLog(n);
        for (int k = 1; k < kMax; k++) {
            count = count + (int) (n / Math.pow(5, k));
        }
        return count;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {

        BigInteger firstElem = BigInteger.valueOf(0);
        BigInteger secondElem = BigInteger.valueOf(1);
        BigInteger sum = BigInteger.valueOf(0);

        for (BigInteger j = BigInteger.valueOf(0); j.compareTo(n.add(BigInteger.valueOf(1))) < 0; j = j.add(BigInteger.valueOf(1))) {
            sum = sum.add(secondElem);
            BigInteger temp = firstElem;
            firstElem = secondElem;
            secondElem = secondElem.add(temp);
        }
        return sum.multiply(BigInteger.valueOf(4));
    }

    @Override
    public double solveSum(double m) {

        return 1 + (1 - Math.sqrt(1 + 4 * m)) / (2 * m);

    }

    @Override
    public long[] smallest(long n) {

        StringBuilder num = new StringBuilder(String.valueOf(n));
        long smallestNumber = n;
        long firstIndex = 0;
        long secondIndex = 0;

        for (int i = 0; i < num.length(); i++) {
            for (int j = 0; j < num.length(); j++) {

                StringBuilder tempNum = new StringBuilder(String.valueOf(n));
                char currenrChar = num.charAt(i);
                tempNum.deleteCharAt(i);
                tempNum.insert(j, currenrChar);

                long longTempNum = Long.parseLong(tempNum.toString());
                if (longTempNum < smallestNumber) {
                    smallestNumber = longTempNum;
                    firstIndex = i;
                    secondIndex = j;
                }
            }
        }
        return new long[]{smallestNumber, firstIndex, secondIndex};
    }
}
