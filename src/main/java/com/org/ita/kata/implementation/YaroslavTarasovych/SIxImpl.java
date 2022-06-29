package com.org.ita.kata.implementation.YaroslavTarasovych;

import com.org.ita.kata.Six;

import java.math.BigInteger;

public class SIxImpl implements Six {
    @Override
    public long findNb(long m) {
        BigInteger big = new BigInteger(String.valueOf(0));
        int i = 1;
        int n = -1;
        BigInteger mNum=new BigInteger(String.valueOf(m));
        while (big.compareTo(mNum) < 0){
            long math = (long) Math.pow(i, 3);
            big=big.add(BigInteger.valueOf(math));
            n = i;
            i++;
        }
        if (big.compareTo(mNum) == 0) {
            return n;
        } else {
            return -1;
        }
    }

    @Override
    public String balance(String book) {
        return null;
    }

    @Override
    public double f(double x) {
        return 0;
    }

    @Override
    public double mean(String town, String strng) {
        return 0;
    }

    @Override
    public double variance(String town, String strng) {
        return 0;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        return null;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return null;
    }

}
