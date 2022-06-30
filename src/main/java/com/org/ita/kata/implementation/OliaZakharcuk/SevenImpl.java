package com.org.ita.kata.implementation.OliaZakharcuk;

import com.org.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        return 0;
    }

    @Override
    public String seriesSum(int n) {

        final int INCR = 3;
        final double NUMERATOR = 1.0;
        double resultSum = 0;
        int divider = 1;

        for(int i = 0; i < n; i ++){
            resultSum = resultSum + NUMERATOR / divider;
            divider += INCR;
        }

        return String.format("%.2f", resultSum);
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return 0;
    }
}
