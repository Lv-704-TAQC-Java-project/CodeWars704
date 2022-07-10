package com.org.ita.kata.implementation.nastiakomarenko;

import com.org.ita.kata.Six;

import java.math.BigDecimal;
import java.math.MathContext;

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
        BigDecimal bigDecimal = new BigDecimal(x);
        bigDecimal = bigDecimal.add(BigDecimal.valueOf(1));
        MathContext mc = new MathContext(50);
        bigDecimal = bigDecimal.sqrt(mc);
        bigDecimal = bigDecimal.subtract(BigDecimal.valueOf(1));
        return Double.parseDouble(String.valueOf(bigDecimal));
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
