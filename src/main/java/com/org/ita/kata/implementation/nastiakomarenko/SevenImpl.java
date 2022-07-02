package com.org.ita.kata.implementation.nastiakomarenko;

import com.org.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] array, double navg) {

        array = new double[]{14, 30, 5, 7, 9, 11, 15};
        navg = 92;
        double sum = 0;
        int count = 1;
        if (navg <= 0) {
            throw new IllegalArgumentException();
        } else {
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
                count++;
            }
            double mult = count * navg;
            double result = mult - sum;
            return (long) result;
        }
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
