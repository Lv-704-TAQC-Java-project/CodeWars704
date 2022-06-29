package com.org.ita.kata.implementation.YaroslavTarasovych;

import com.org.ita.kata.Six;


import java.util.Locale;

public class SIxImpl implements Six {
    @Override
    public long findNb(long m) {
        return 0;
    }

    @Override
    public String balance(String book) {

        String allBalance="";

       String[] lines=book.split("\\n|\\r");

        String reg="[!=,:;?*{}]";
        String balance=lines[0].replaceAll(reg,"");

        allBalance = allBalance + "Original Balance: "+balance + "\n";

        double total=0;
        int count=0;



        for (int i = 1; i < lines.length; i++) {

            lines[i] = lines[i].replaceAll(reg,"");
            String[] line = lines[i].split(" ");

            line[0] = line[0].replaceAll(reg,"");
            line[1] = line[1].replaceAll(reg,"");

            line[2] = line[2].replaceAll(reg,"");
            System.out.println("0 "+line[0]+"1 "+line[1]+"2 "+line[2]+" length "+line.length);
            total += Double.parseDouble(line[2]);

            count++;
            balance = String.valueOf((Double.parseDouble(balance)-Double.parseDouble(line[2])));
            balance = String.format(Locale.ENGLISH,"%.2f",Double.parseDouble(balance));

            allBalance += line[0] + " " + line[1] + " " + line[2] + " Balance " + balance + "\n";

        }
        double avg=total/count;
        allBalance += "Total expense  "+String.format(Locale.ENGLISH,"%.2f",total)+"\n";
        allBalance += "Average expense  "+String.format(Locale.ENGLISH,"%.2f",avg);

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

    public static void main(String[] args) {
        SIxImpl sIx=new SIxImpl();
        System.out.println(sIx.balance("1864.00\n" +
                "001 Video ;! 128.00 ?;\n" +
                "002 Flowers ;! 12.22 ?;\n" +
                "003 Video  34.00 \n" +
                "004 Gasoline  13.65 \n" +
                "005 Vegetables  93.50 \n" +
                "006 Flowers ;! 12.00 ?;\n" +
                "007 Books  3.20 \n" +
                "008 Market ;! 13.65 ?;\n" +
                "009 Grocery  93.50 \n" +
                "010 Beauty  17.50"));
    }
}
