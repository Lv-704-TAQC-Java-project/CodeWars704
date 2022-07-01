package com.org.ita.kata.implementation.OliaZakharcuk;

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
    private static boolean isPrime(long n) {

        for (long i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static ArrayList<Long> getPrimeNumbers(long m, long n){

        ArrayList<Long> primeNumbers = new ArrayList<>();

        for (long i = m; i <= n; i++) {
            if (isPrime(i)) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
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
