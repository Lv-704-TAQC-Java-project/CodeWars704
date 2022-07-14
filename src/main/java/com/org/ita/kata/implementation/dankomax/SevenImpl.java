package com.org.ita.kata.implementation.dankomax;

import com.org.ita.kata.Base;
import com.org.ita.kata.Seven;

import java.util.Arrays;
import java.util.Locale;

public class SevenImpl extends Base implements Seven {
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
        final int PROGRESSION_DELTA = 3;
        int currentDelimiter = 1;
        double progressionSum = 0;

        for (int i = 0; i < n; i++) {
            progressionSum += 1.0 / currentDelimiter;
            currentDelimiter += PROGRESSION_DELTA;
        }

        return String.format(Locale.ENGLISH,"%.2f", progressionSum);
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return (p - bef > aft) ? aft + 1 : p - bef;
    }
}
