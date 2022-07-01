package com.org.ita.kata.implementation.clarmmym;

import com.org.ita.kata.Six;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        return Arrays.stream(dataNumbers(town, strng)).average().getAsDouble();
    }

    @Override
    public double variance(String town, String strng) {
        double avg = mean(town, strng);
        double[] data = dataNumbers(town, strng);

        double vars = 0;
        for (double d : data) {
            vars += Math.pow(d - avg, 2);

        }
        return vars / data.length;
    }

    private double[] dataNumbers(String town, String strng) {
        final int MONTH = 12;
        String regex = "^" + town + ".+$";
        String townData = "";
        Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(strng);

        while (matcher.find()) {
            townData = matcher.group();
        }

        double[] nb = new double[MONTH];
        String[] townDataPerMonth = townData.split(",");

        for (int i = 0; i < nb.length; i++) {
            nb[i] = Double.parseDouble(townDataPerMonth[i].split(" ")[1]);
        }
        return nb;
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
