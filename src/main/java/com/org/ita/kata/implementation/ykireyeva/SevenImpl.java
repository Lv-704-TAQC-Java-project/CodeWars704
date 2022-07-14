package com.org.ita.kata.implementation.ykireyeva;

import com.org.ita.kata.Base;
import com.org.ita.kata.Seven;

import java.text.DecimalFormat;
import java.util.stream.DoubleStream;

public class SevenImpl extends Base implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double sum = DoubleStream.of(arr).reduce(0, Double::sum);
        if (navg < sum / arr.length) {
            throw new IllegalArgumentException();
        }
        return (long) Math.ceil(navg * (arr.length + 1) - sum);
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
