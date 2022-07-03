package com.org.ita.kata.implementation.nastiakomarenko;

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
    public double variance(String town, String str2) {

        double count = 0.0, sum=0.0;
        for (int i = 0; i < str2.length(); i++) {
            if (Character.isDigit(str2.charAt(i))) {
                count++;
                sum += Double.parseDouble(String.valueOf(str2.charAt(i)));
            }
        }
        double average = sum/count;
        double arr[] = new double[(int) count];
        int index=0;
        for (int j = 0; j < str2.length(); j++) {
            if (Character.isDigit(str2.charAt(j))) {
                arr[index]= (Double.parseDouble(String.valueOf(str2.charAt(j)))-average);
                index++;
            }
        }

        double result=0;
        for(int m=0;m<index;m++){
            result+=(arr[m]*arr[m]);
        }
        return result/count;

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
