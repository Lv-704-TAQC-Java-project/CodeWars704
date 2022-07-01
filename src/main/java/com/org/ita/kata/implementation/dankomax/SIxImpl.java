package com.org.ita.kata.implementation.dankomax;

import com.org.ita.kata.Six;
import java.util.Arrays;
import java.util.Optional;


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
        Optional townData = Arrays.stream(strng.split("\n")).filter(t -> t.contains(town + ":")).findFirst();
        if (townData.isPresent()) {
            String[] townRainfallArr = townData.get().toString().split(":")[1].split(",");
            double townRainfallTotal = Arrays.stream(townRainfallArr).mapToDouble(month -> Double.parseDouble(month.split(" ")[1])).sum();

            return townRainfallTotal / townRainfallArr.length;
        }

        return -1.0;
    }

    @Override
    public double variance(String town, String strng) {
        Optional townData = Arrays.stream(strng.split("\n")).filter(t -> t.contains(town + ":")).findFirst();
        if (townData.isPresent()) {
            String[] townRainfallArr = townData.get().toString().split(":")[1].split(",");
            double townRainfallTotalDeviation = Arrays.stream(townRainfallArr).mapToDouble(month -> Math.pow(Double.parseDouble(month.split(" ")[1]) - mean(town, strng), 2)).sum();

            return townRainfallTotalDeviation / townRainfallArr.length;
        }

        return -1.0;
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
