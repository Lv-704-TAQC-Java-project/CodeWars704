package com.org.ita.kata.implementation.YaroslavTarasovych;

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
    public double mean(String town, String strng) {
        String[] lines = strng.split("\n");
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
        double avg = mean(town, strng);
        if (avg == -1) return -1;
        int count = 0;
        double var = 0;
        String[] lines = strng.split("\n");
        for (int i = 0; i < lines.length; i++) {
            String[] line = lines[i].split("[: ,]");
            if (line[0].equals(town)) {
                for (int j = 2; j < line.length; j += 2) {
                    var = var + Math.pow(Double.parseDouble(line[j]) - avg, 2);
                    count++;
                }
                var = var / count;
            }
        }
        return var;
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
