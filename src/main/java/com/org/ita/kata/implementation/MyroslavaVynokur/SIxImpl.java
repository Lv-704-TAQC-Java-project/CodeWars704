package com.org.ita.kata.implementation.MyroslavaVynokur;

import com.org.ita.kata.Six;

import java.text.DecimalFormat;

public class SIxImpl implements Six {
    @Override
    public long findNb(long m) {
        return 0;
    }

    @Override
    public String balance(String book) {
        final String ORIGINAL_BALANCE = "Original Balance: ";
        final String TOTAL_EXPENSE = "Total expense  ";
        final String AVERAGE_EXPENSE = "Average expense  ";
        final String BALANCE = " Balance ";
        final String ENTER = "\\r\\n";
        final String SPACE = " ";

        String cleanedBook = book.replaceAll("([^\\n. \\da-zA-Z])", "");
        String[] lines = cleanedBook.split("[\\n]+");

        double totalBalance = Double.parseDouble(lines[0]);
        double totalExpense = 0;

        StringBuilder sb = new StringBuilder();

        String oneLine;
        String[] oneLineArr;
        for (int i = 1; i < lines.length; i++) {
            oneLine = lines[i];
            oneLineArr = oneLine.split("\\s+");
            totalExpense += Double.parseDouble(oneLineArr[2]);
            totalBalance -= Double.parseDouble(oneLineArr[2]);
            sb.append(oneLineArr[0]).append(SPACE).append(oneLineArr[1]).append(SPACE).append(oneLineArr[2]).append(BALANCE)
                    .append((new DecimalFormat("#.##").format(totalBalance))).append(ENTER);
        }
        double averageExpense = totalExpense / (lines.length - 1);
        double averageExpenseF = Math.floor(averageExpense * 100 / 100);
        double originalBalance = Double.parseDouble(lines[0]);

        String completedString = sb.toString();

        return ORIGINAL_BALANCE + (new DecimalFormat("#.00").format(originalBalance)) + ENTER + completedString +
                TOTAL_EXPENSE + new DecimalFormat("0.00").format(totalExpense) +
                ENTER + AVERAGE_EXPENSE + (new DecimalFormat("0.00").format(averageExpense));
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
