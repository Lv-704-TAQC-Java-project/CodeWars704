package com.org.ita.kata.implementation.YaroslavTarasovych;

import com.org.ita.kata.Six;


import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SIxImpl implements Six {
    @Override
    public long findNb(long m) {
        return 0;
    }

    @Override
    public String balance(String book) {

        String allBalance = "";
        String[] lines = book.split("\\n|\\r");
        String reg = "[ !=,:;?*{}]";
        String balance = lines[0].replaceAll(reg,"");
        allBalance = allBalance + "Original Balance: "+balance + "\n";
        double total=0;
        int count=0;
        for (int i = 1; i < lines.length; i++) {
            String text = lines[i].replaceAll(reg,"");
            Pattern p1 = Pattern.compile("\\d+");
            Pattern p2 = Pattern.compile("[a-zA-Z]+");
            Pattern p3 = Pattern.compile("\\d+\\.\\d+");
            Matcher m1 = p1.matcher(text);
            Matcher m2 = p2.matcher(text);
            Matcher m3 = p3.matcher(text);
            String a = "";
            String b = "";
            String c = "";
            if (m1.find()) a = text.substring(m1.start(), m1.end());
            if (m2.find()) b = text.substring(m2.start(), m2.end());
            if (m3.find()) c = text.substring(m3.start(), m3.end());
            total += Double.parseDouble(c);
            count++;
            balance = String.valueOf((Double.parseDouble(balance) - Double.parseDouble(c)));
            balance = String.format(Locale.ENGLISH,"%.2f", Double.parseDouble(balance));
            allBalance +=  a + " " + b + " " + c + " Balance " + balance + "\n";

        }
        double avg = total / count;
        allBalance += "Total expense  " + String.format(Locale.ENGLISH,"%.2f", total) + "\n";
        allBalance += "Average expense  " + String.format(Locale.ENGLISH,"%.2f", avg);
        return allBalance;
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
