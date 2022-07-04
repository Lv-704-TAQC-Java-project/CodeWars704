package com.org.ita.kata.implementation.ykireyeva;

import com.org.ita.kata.Six;

import java.text.DecimalFormat;
import java.util.regex.Pattern;


public class SIxImpl implements Six {
    @Override
    public long findNb(long m) {
        long sum = 0L;
        long n = 0;
        while (sum != m) {
            sum += Math.pow(1 + n, 3);
            n++;
        }
        return n;
    }

    @Override
    public String balance(String book) {
        String[] lines = book.split("\\r\\n|\\n");
        String regex = "[!:=;?,{}]";
        StringBuilder resultBook = new StringBuilder("Original Balance: "
                + lines[0].replaceAll(regex, "") + "\\r\\n");
        double actualBalance = Double.parseDouble(lines[0].replaceAll(regex, ""));
        double totalExpense = 0;
        double averageExpense;

        for (int i = 1; i < lines.length; i++) {
            String line = lines[i].replaceAll(regex, "");
            String[] elements = line.split("\\s+");
            actualBalance -= Double.parseDouble(elements[2]);
            totalExpense += Double.parseDouble(elements[2]);
            resultBook.append(String.format("%s %s %s Balance %s\\r\\n",
                    elements[0], elements[1], elements[2], new DecimalFormat("#.00").format(actualBalance)));
        }

        averageExpense = totalExpense / (lines.length - 1);
        resultBook.append(String.format("Total expense  %s\\r\\nAverage expense  %s",
                new DecimalFormat("0.00").format(totalExpense),
                new DecimalFormat("0.00").format(averageExpense)));

        return resultBook.toString();
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

        if (lstOfArt.length == 0) {
            return "";
        }

        for (String letter : lstOf1stLetter) {
            int amount = 0;
            for (String art : lstOfArt) {
                if (Pattern.compile("^" + letter).matcher(art).find()) {
                    amount += Integer.parseInt(art.replaceAll("[A-Z]", "").trim());
                }
            }
            result.append(String.format("(%s : %d) - ", letter, amount));

        }
        return result.toString().trim().replaceAll("\\s.$", "");
    }
}
