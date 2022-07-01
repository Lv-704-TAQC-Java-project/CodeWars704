package com.org.ita.kata.implementation.dankomax;

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
        return Arrays.stream(townRainfallArr(town, strng))
                .mapToDouble(month -> Double.parseDouble(month.split(" ")[1]))
                .average()
                .orElse(-1.0);
    }

    @Override
    public double variance(String town, String strng) {
        return Arrays.stream(townRainfallArr(town, strng))
                .mapToDouble(month -> Math.pow(Double.parseDouble(month.split(" ")[1]) - mean(town, strng), 2))
                .average()
                .orElse(-1.0);
    }

    private static String[] townRainfallArr(String town, String strng) {
        return Arrays.stream(strng.split("\n"))
                .filter(t -> t.contains(town + ":"))
                .findFirst()
                .orElse(":,")
                .split(":")[1]
                .split(",");
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
