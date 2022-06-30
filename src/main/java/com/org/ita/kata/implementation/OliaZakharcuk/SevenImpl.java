package com.org.ita.kata.implementation.OliaZakharcuk;

import com.org.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {

        double arrSum = 0;

        for (double i : arr) {
            arrSum = arrSum + i;
        }
        long donation = (long)Math.ceil((navg * (arr.length + 1)) - arrSum);

        if (donation <= 0) {
            throw new IllegalArgumentException("--- Exception 1 ---");
        }

        return donation;
    }

    @Override
    public String seriesSum(int n) {
        return null;
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return 0;
    }
}
