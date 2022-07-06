package com.org.ita.kata.implementation.ykireyeva;

import com.org.ita.kata.Seven;

import java.text.DecimalFormat;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        return 0;
    }

    @Override
    public String seriesSum(int n) {
        double divisor = 1;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += 1 / divisor;
            divisor += 3;
        }
        return new DecimalFormat("#.00").format(sum);
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return p - bef > aft ? aft + 1 : p - bef;
    }
}
