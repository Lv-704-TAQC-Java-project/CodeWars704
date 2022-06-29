package com.org.ita.kata.implementation.YaroslavTarasovych;

import com.org.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double allSum = navg * (arr.length + 1);
        double sumArr = 0;
        for (double v : arr) {
            sumArr += v;
        }
        if (sumArr < allSum) {
            return (long) Math.ceil((allSum - sumArr));
        } else throw new IllegalArgumentException();

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
