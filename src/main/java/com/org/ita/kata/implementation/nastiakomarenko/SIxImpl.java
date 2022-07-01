package com.org.ita.kata.implementation.nastiakomarenko;

import com.org.ita.kata.Six;

public class SIxImpl implements Six {
    @Override
    public long findNb(long M) {

        long m = 0;
        long i = 0;
        while (m < M) {
            m += i*i*i;
            if (m == M) {
                return i;
            }
            i += 1;
        }
        return -1;

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
