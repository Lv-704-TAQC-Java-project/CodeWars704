package com.org.ita.kata.implementation.MyroslavaVynokur;

import com.org.ita.kata.Six;

import java.util.Arrays;

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

        if (lstOfArt == null | lstOfArt.length == 0 | lstOf1stLetter == null | lstOf1stLetter.length == 0) {
            return "";
        }
        String answer = "";

        for (int i = 0; i < lstOf1stLetter.length; i++) {
            int sum = 0;
            for (int t = 0; t < lstOfArt.length; t++) {
                if (lstOfArt[t].charAt(0) == lstOf1stLetter[i].charAt(0)) {
                    String[] element = lstOfArt[t].split(" ");
                    System.out.println(Arrays.toString(element));
                    sum += Integer.parseInt(element[1]);
                }
            }
            answer += "(" + lstOf1stLetter[i] + " : " + sum + ")";
            if ((lstOf1stLetter.length - 1) != i) {
                answer += " - ";
            }
        }
        return answer;
    }
}
