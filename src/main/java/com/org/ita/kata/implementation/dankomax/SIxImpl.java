package com.org.ita.kata.implementation.dankomax;

import com.org.ita.kata.Six;

public class SIxImpl implements Six {
    @Override
    public long findNb(long m) {
        return 0;
    }

    @Override
    public String balance(String book) {
        String cleanStr = book.replaceAll("[^\n. \\d\\w]", "");
        String[] linesArr = cleanStr.split("\\r?\\n");
        double originalBalance = Double.parseDouble(linesArr[0]);
        double currentBalance = originalBalance;
        StringBuilder finalStr = new StringBuilder(String.format("Original Balance: %.2f\\r\\n", originalBalance));

        for (int i = 1; i < linesArr.length; i++) {
            String[] currentLineArr = linesArr[i].replaceAll("\\s+", " ").split(" ");
            double currentExpense = Double.parseDouble(currentLineArr[currentLineArr.length - 1]);
            currentBalance -= currentExpense;
            finalStr.append(String.join(" ", currentLineArr));
            finalStr.append(String.format(" Balance %.2f\\r\\n", currentBalance));
        }

        double totalExpense = originalBalance - currentBalance;
        int numOfExpenses = linesArr.length - 1;
        finalStr.append(String.format("Total expense  %.2f\\r\\n", totalExpense));
        finalStr.append(String.format("Average expense  %.2f", totalExpense / numOfExpenses));

        return finalStr.toString();
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
        return null;
    }
}
