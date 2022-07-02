package com.org.ita.kata.implementation.dankomax;

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
    public double variance(String town, String strng) {
        return 0;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        return null;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) {
            return "";
        }

        final String DIVIDER = " - ";
        StringBuilder finalStr = new StringBuilder();

        for (String letter : lstOf1stLetter) {
            int categoryQuantity = 0;

            for (String art : lstOfArt) {
                if (art.matches("^" + letter + "+.*")) {
                    categoryQuantity += Integer.parseInt(art.replaceAll("\\D", ""));
                }
            }

            if (finalStr.length() > 0) {
                finalStr.append(DIVIDER);
            }
            finalStr.append(String.format("(%s : %d)", letter, categoryQuantity));
        }
        return finalStr.toString();
    }
}
