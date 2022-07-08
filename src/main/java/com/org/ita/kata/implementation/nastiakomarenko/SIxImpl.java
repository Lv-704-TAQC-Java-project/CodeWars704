package com.org.ita.kata.implementation.nastiakomarenko;

import com.org.ita.kata.Six;

public class SIxImpl implements Six {
    @Override
    public long findNb(long m) {
        return 0;
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
    public double mean(String town, String str2) {
        String[] lines = str2.split("\n");
        double avg = -1;
        int count = 0;
        for (int i = 0; i < lines.length; i++) {
            String[] line = lines[i].split("[: ,]");
            if (line[0].equals(town)) {
                avg = 0;
                for (int j = 2; j < line.length; j += 2) {
                    avg = avg + Double.parseDouble(line[j]);
                    count++;
                }
                avg = avg / count;
            }
        }
        return avg;

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
