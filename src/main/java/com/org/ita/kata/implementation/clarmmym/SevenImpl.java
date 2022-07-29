package com.org.ita.kata.implementation.clarmmym;

import com.org.ita.kata.BaseKata;
import com.org.ita.kata.Seven;

import java.util.Arrays;

public class SevenImpl extends BaseKata implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double result = ((arr.length + 1) * navg) - Arrays.stream(arr).sum();
        if (result <= 0) {
            throw new IllegalArgumentException();
        }
        return Math.round(Math.ceil(result));
    }

    @Override
    public String seriesSum(int n) {
        final int PROGRESSION = 3;
        double sum = 0;

        for (int i = 0; i < n; i++) {
            sum += 1.0 / (PROGRESSION * i + 1);
        }
        return String.format("%.2f", sum).replace(',','.');
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return (p - bef) - ((p - bef > aft) ? (p - bef - aft - 1) : 0);
    }
}
