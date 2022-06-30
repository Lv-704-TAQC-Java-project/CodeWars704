package com.org.ita.kata.implementation.YaroslavTarasovych;

import com.org.ita.kata.Six;

import java.util.StringJoiner;

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
    public double variance(String town, String strng) {
        return 0;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        return null;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOfArt == null || lstOfArt.length == 0) return "";
        int[] sum = new int[lstOf1stLetter.length];
        for (int i = 0; i < lstOfArt.length; i++) {
            String[] line = lstOfArt[i].split(" ");
            for (int j = 0; j < lstOf1stLetter.length; j++) {
                if (line[0].charAt(0) == lstOf1stLetter[j].charAt(0)) sum[j] += Integer.parseInt(line[1]);
            }
        }
        StringJoiner joiner = new StringJoiner(" - ", "", "");
        for (int i = 0; i < lstOf1stLetter.length; i++) {
            joiner.add("(" + lstOf1stLetter[i] + " : " + sum[i] + ")");
        }
        return joiner.toString();
    }
}
