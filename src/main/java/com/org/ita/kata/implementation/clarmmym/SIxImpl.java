package com.org.ita.kata.implementation.clarmmym;

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
        StringBuilder result = new StringBuilder();

        for (var firstLetter : lstOf1stLetter) {
            int temp = 0;
            for (var dataOfBook : lstOfArt) {
                if (firstLetter.charAt(0) == (dataOfBook.charAt(0))) {
                    System.out.println(Integer.parseInt(dataOfBook.split(" ")[1]));
                    temp += Integer.parseInt(dataOfBook.split(" ")[1]);
                }
            }
            result.append("(").append(firstLetter).append(" : ").append(temp).append(")");
            if (!firstLetter.equals(lstOf1stLetter[lstOf1stLetter.length - 1])) {
                result.append(" - ");
            }
        }
        return result.toString();
    }
}
