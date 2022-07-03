package com.org.ita.kata.implementation.MyroslavaVynokur;

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
        int count = 0;
        for (int i = bef; i < p; i++) {
            if (p-i-1 <= aft) {
                count++;
            }
        }
        return count;
    }
}
