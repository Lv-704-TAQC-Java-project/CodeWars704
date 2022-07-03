package com.org.ita.kata.implementation.MyroslavaVynokur;

import com.org.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double sum = 0;
        double avg = navg * (arr.length + 1);
        for (double v : arr) {
            sum += v;
        }
        double lastDonat = (avg - sum);
        if (lastDonat <= 0) {
            throw new IllegalArgumentException("--- Exception 1 ---");
        }
        return (long) Math.ceil(lastDonat);
    }

    @Override
    public String seriesSum(int n) {
        double sum = 0.00;
        for (int i = 0; i < n; i++) {
            sum += 1.0 / (1 + 3 * i);
        }
        return String.format("%.2f", sum);
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return 0;
    }
}
