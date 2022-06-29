package com.org.ita.kata.implementation.MyroslavaVynokur;

import com.org.ita.kata.Six;

public class SIxImpl implements Six {
    @Override
    public long findNb(long m) {
        long sqrt1 = (long) Math.sqrt(m);
        if (sqrt1 * sqrt1 == m) {
            long n = (long) Math.sqrt(2 * sqrt1);
            if ((n * (n + 1) == 2 * sqrt1)) {
                return n;
            } else return -1;
        } else return -1;
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
