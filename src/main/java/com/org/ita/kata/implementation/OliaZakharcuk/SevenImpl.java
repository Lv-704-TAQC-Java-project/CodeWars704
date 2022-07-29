package com.org.ita.kata.implementation.OliaZakharcuk;

import com.org.ita.kata.BaseKata;
import com.org.ita.kata.Seven;

public class SevenImpl extends BaseKata implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {

        double arrSum = 0;

        for (double i : arr) {
            arrSum = arrSum + i;
        }
        long donation = (long) Math.ceil((navg * (arr.length + 1)) - arrSum);

        if (donation <= 0) {
            throw new IllegalArgumentException("--- Exception 1 ---");
        }

        return donation;
    }

    @Override
    public String seriesSum(int n) {

        final int INCR = 3;
        final double NUMERATOR = 1.0;
        double resultSum = 0;
        int divider = 1;

        for (int i = 0; i < n; i++) {
            resultSum = resultSum + NUMERATOR / divider;
            divider += INCR;
        }

        return String.format("%.2f", resultSum);
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {

        int temp = p - bef;
        int possiblePositions;

        if (temp > aft) {
            possiblePositions = aft + 1;
        } else {
            possiblePositions = p - bef;
        }

        return possiblePositions;
    }
}
