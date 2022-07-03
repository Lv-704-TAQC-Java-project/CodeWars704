package com.org.ita.kata.implementation.clarmmym;

import com.org.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        return 0;
    }

    @Override
    public String seriesSum(int n) {
        final int PROGRESSION = 3;
        double sum = 0;

        for (int i = 0; i < n; i++) {
            sum += 1.0 / (PROGRESSION * i +1);
        }
        return String.format("%.2f", sum);
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return 0;
    }
}
