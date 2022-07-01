package com.org.ita.kata.implementation.dankomax;

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
        return BigDecimal.ONE
                .add(BigDecimal.valueOf(x))
                .sqrt(MathContext.DECIMAL128)
                .subtract(BigDecimal.ONE)
                .doubleValue();
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
