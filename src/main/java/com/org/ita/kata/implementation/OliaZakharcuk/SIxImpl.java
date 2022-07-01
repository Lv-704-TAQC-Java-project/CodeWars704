package com.org.ita.kata.implementation.OliaZakharcuk;

import com.org.ita.kata.Six;
import java.math.*;

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

        MathContext mc = new MathContext(100);
        BigDecimal bigDecimal = new BigDecimal(x);
        BigDecimal bigDecimalOne = new BigDecimal(1);
        bigDecimal = bigDecimal.add(bigDecimalOne);
        bigDecimal = bigDecimal.sqrt(mc);
        bigDecimal = bigDecimal.subtract(bigDecimalOne);

        return bigDecimal.doubleValue();
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
