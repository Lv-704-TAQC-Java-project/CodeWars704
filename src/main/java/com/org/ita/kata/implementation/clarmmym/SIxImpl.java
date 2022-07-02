package com.org.ita.kata.implementation.clarmmym;

import com.org.ita.kata.Six;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SIxImpl implements Six {
    @Override
    public long findNb(long m) {
        return 0;
    }

    @Override
    public String balance(String book) {
        String[] check = book.split("\n");

        Pattern pattern = Pattern.compile("[^(\\s\\w.)]+");

        for (int i = 0; i < check.length; i++) {
            Matcher matcher = pattern.matcher(check[i]);

            while (matcher.find()) {
                check[i] = check[i].replace(matcher.group(), "");
            }
        }

        BigDecimal originalBalance = new BigDecimal(check[0]);
        BigDecimal currentBalance = originalBalance;

        check[0] = "Original Balance: " + originalBalance;

        for (int i = 1; i < check.length; i++) {
            String[] purchase = check[i].split(" ");
            BigDecimal purchaseCost = new BigDecimal(purchase[purchase.length - 1]);
            currentBalance = currentBalance.subtract(purchaseCost);
            check[i] += " Balance " + currentBalance;
        }

        BigDecimal bill = originalBalance.subtract(currentBalance);
        StringBuilder result = new StringBuilder();

        for (String c : check) {
            result.append(c).append("\\r\\n");
        }

        result.append("Total expense  ").append(bill).append("\\r\\nAverage expense  ").append(bill.divide(new BigDecimal(check.length - 1), 2, RoundingMode.HALF_UP));
        return result.toString();
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
