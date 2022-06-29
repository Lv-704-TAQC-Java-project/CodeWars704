package com.org.ita.kata.implementation.clarmmym;

import com.org.ita.kata.Seven;

import java.util.Arrays;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        long result = (long) (((arr.length + 1) * navg) - Arrays.stream(arr).sum());
        if (result<=0){
            throw new IllegalArgumentException();
        }
        return result;
    }

    @Override
    public String seriesSum(int n) {
        return null;
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return 0;
    }
}
