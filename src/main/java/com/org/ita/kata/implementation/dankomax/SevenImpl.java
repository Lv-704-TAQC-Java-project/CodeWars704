package com.org.ita.kata.implementation.dankomax;

import com.org.ita.kata.Seven;
import java.util.Arrays;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double currentDonationSum = Arrays.stream(arr).sum();
        long nextDonation = (long) Math.ceil((navg * (arr.length + 1)) - currentDonationSum);

        if (nextDonation <= 0) {
            throw new IllegalArgumentException("Next donation must be positive.");
        }

        return nextDonation;
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
