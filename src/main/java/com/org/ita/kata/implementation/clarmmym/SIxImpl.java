package com.org.ita.kata.implementation.clarmmym;

import com.org.ita.kata.Six;

public class SIxImpl implements Six {
    @Override
    public long findNb(long m) {
        final int THREE = 3;
        int current = 1;
        long result = (long) Math.pow(current, THREE);

        while (result != m) {
            if (result > m) {
                current = -1;
                break;
            }
            current++;
            result += (long) Math.pow(current, THREE);
        }
        return current;
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
