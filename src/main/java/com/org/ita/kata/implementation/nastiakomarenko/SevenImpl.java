package com.org.ita.kata.implementation.nastiakomarenko;

import com.org.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        return 0;
    }

    @Override
    public String seriesSum(int n) {

        Double sum = 0.00;
        if (n == 0) {
            return String.valueOf(sum);
        } else {
            for (Integer i = 0; i < n; i++) {
                sum += Double.valueOf(1) / Double.valueOf(1 + i * 3);
            }
            return String.format("%.2f", sum);
        }
    }



    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return 0;
    }
}
