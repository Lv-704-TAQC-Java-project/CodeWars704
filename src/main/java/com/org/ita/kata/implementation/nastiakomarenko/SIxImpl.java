package com.org.ita.kata.implementation.nastiakomarenko;

import com.org.ita.kata.Six;

import java.text.DecimalFormat;

public class SIxImpl implements Six {
    @Override
    public long findNb(long m) {
        return 0;
    }

    @Override
    public String balance(String book) {

        String ORIGINAL_BALANCE = "Original Balance: ",TOTAL_EXPENSE = "Total expense ",
                AVERAGE_EXPENSE = "Average expense ", BALANCE = " Balance ", ENTER = "\r\n";

        StringBuilder sb = new StringBuilder();
        String cleanedBook = book.replaceAll("([^\\n. \\da-zA-Z])", "");
        String[] lines = cleanedBook.split("[\\n]+");
        String str;
        String[] strArr;

        double totalBalance = Double.parseDouble(lines[0]);
        double totalExpense = 0;

        for (int i = 1; i < lines.length; i++) {
            str = lines[i];
            strArr = str.split("\\s+");
            totalExpense += Double.parseDouble(strArr[2]);
            totalBalance -= Double.parseDouble(strArr[2]);
            sb.append(strArr[0]).append(" ").append(strArr[1]).append(" ")
                    .append(strArr[2]).append(BALANCE).append((new DecimalFormat("#.##")
                            .format(totalBalance))).append(ENTER);
        }
        double average = totalExpense / (lines.length - 1);
        double averageExpense = Math.floor(average * 100 / 100);
        double originalBalance = Double.parseDouble(lines[0]);

        String completedString = sb.toString();
        String finalStr = ORIGINAL_BALANCE + (new DecimalFormat("#.00").format(originalBalance)) + "\n" + completedString +
                TOTAL_EXPENSE + new DecimalFormat("0.00").format(totalExpense) +
                "\n" + AVERAGE_EXPENSE + (new DecimalFormat("0.00").format(averageExpense));
        String result = finalStr.replaceAll(" ", "_");
        return result;
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
