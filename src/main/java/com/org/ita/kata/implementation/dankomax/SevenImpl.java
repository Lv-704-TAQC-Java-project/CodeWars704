package com.org.ita.kata.implementation.dankomax;

import com.org.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        return 0;
    }

    @Override
    public String seriesSum(int n) {
        final int PROGRESSION_DELTA = 3;
        int currentDelimiter = 1;
        double progressionSum = 0;

        for (int i = 0; i < n; i++) {
            progressionSum += 1.0 / currentDelimiter;
            currentDelimiter += PROGRESSION_DELTA;
        }

        return String.format("%.2f", progressionSum);
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return (p - bef > aft) ? aft + 1 : p - bef;
    }
}
