package com.org.ita.kata.implementation.dankomax;

import com.org.ita.kata.Six;

public class SIxImpl implements Six {
    @Override
    public long findNb(long m) {
        long numberOfLevels = 0;
        long totalVolume = 0;

        while (totalVolume < m) {
            numberOfLevels++;
            totalVolume += (long)Math.pow(numberOfLevels, 3);
        }

        return totalVolume == m ? numberOfLevels : -1;
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
