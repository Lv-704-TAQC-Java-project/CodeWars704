package com.org.ita.kata.implementation.nastiakomarenko;

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
            throw new IllegalArgumentException("error");
        }
        return (long) Math.ceil(lastDonat);
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
        int sum = bef + aft;
        int count = 0;
        int posPosit = p - sum;
        for (int i = 0; i < posPosit; i++) {
            int res = p - (aft + i);
            System.out.println(res);
            count++;    //possible positions
        }


        return count;
    }
}

