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
    public double mean(String town, String strng) {
        return 0;
    }

    @Override
    public double variance(String town, String str2) {

        double temp;
        int size = 0;
        double sum = 0;

        String[] data = str2.split("\n");
        for (String k : data) {
            if (k.contains(town)) {
                String[] towns = k.split(":");
                String[] renge = towns[1].split(",");
                for (String j : renge) {
                    String[] splitedNumbers = j.split(" ");
                    temp = Double.parseDouble(splitedNumbers[1]) - mean(town, str2);
                    sum = sum + Math.pow(temp, 2);
                    size++;
                }
            }
        }

        if (size == 0) {
            return -1.0;
        }

        return sum / size;

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
