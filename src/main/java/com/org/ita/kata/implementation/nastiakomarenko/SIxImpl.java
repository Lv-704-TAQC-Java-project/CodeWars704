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
         x =(Math.exp(1)) - 15;
        double answer =0;
        if(x<0){
            double mult = x *(-1);
             answer = (double) Math.sqrt(1 + mult) - 1;

            System.out.println(answer);
        }else {
             answer = (double) Math.sqrt(1 + x) - 1;
        }

        return answer;
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
