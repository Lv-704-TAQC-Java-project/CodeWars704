package com.org.ita.kata.implementation.nastiakomarenko;

import com.org.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        return 0;
    }

    @Override
    public String seriesSum(int n) {
        return null;
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

