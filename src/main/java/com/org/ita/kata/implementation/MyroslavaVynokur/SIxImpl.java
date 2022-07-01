package com.org.ita.kata.implementation.MyroslavaVynokur;

import com.org.ita.kata.Six;

import java.util.Arrays;

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
        return Arrays.stream(strng.split("\n"))
                .filter(line -> line.startsWith(town + ":"))
                .map(String::toLowerCase)
                .map(s -> s.replaceAll(":| |[a-z]", ""))
                .findFirst()
                .map(s -> Arrays.stream(s.split(","))
                        .mapToDouble(Double::parseDouble)
                        .sum() / 12).orElse(-1.0);
    }

    @Override
    public double variance(String town, String strng) {
        double average = mean(town, strng);
        return Arrays.stream(strng.split("\n"))
                .filter(line -> line.startsWith(town + ":"))
                .map(String::toLowerCase)
                .map(s -> s.replaceAll(":| |[a-z]", ""))
                .findFirst()
                .map(s -> Arrays.stream(s.split(","))
                        .mapToDouble(Double::parseDouble)
                        .map(x -> (x - average) * (x - average))
                        .sum() / 12)
                .orElse(-1.0);
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
