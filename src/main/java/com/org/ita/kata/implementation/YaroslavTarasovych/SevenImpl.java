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

        if (n == 0) return "0.00";
        double sum = 1;
        int a = 4;
        for (int i = 0; i < n-1; i++) {
            double div = (double) 1 / a;
            sum = sum + div;
            a += 3;
        }
        return String.format("%.2f", sum);
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return 0;
    }

}
