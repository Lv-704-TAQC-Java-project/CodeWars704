package com.org.ita.kata.implementation.YaroslavTarasovych;

import com.org.ita.kata.Five;

import java.math.BigInteger;
import java.util.Arrays;

public class FiveImpl implements Five {
    @Override
    public int artificialRain(int[] v) {
        if (v.length == 1) return 1;
        int array[] = new int[v.length];
        for (int i = 0; i < v.length - 1; i++) {
            boolean up = true;
            boolean down = true;
            int count = 1;
            for (int j = i; j < v.length - 1; j++) {
                if (v[j] >= v[j + 1]&&up) {
                    count++;
                    continue;
                } else {
                    up = false;
                }
                if (v[j] <= v[j + 1]&&down) {
                    count++;
                    continue;
                } else {
                    down = false;
                }
                break;
            }
            array[i] = count;
        }
        int max=array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]>max) max=array[i];
        }
        System.out.println();
        return max;
    }

    @Override
    public long[] gap(int g, long m, long n) {
        long[] numbers = null;
        BigInteger bigInteger;
        for (long i = m; i <= n - g; i++) {
            bigInteger = BigInteger.valueOf(i);
            if (!bigInteger.isProbablePrime((int) Math.log(i)))
                continue;
            bigInteger = BigInteger.valueOf(i + g);
            if (!bigInteger.isProbablePrime((int) Math.log(i + g)))
                continue;
            boolean flag = false;
            for (int j = 2; j < g; j++) {
                bigInteger = BigInteger.valueOf(i + j);
                if (bigInteger.isProbablePrime((int) Math.log(i + g))) flag = true;
            }
            if (flag) continue;
            numbers = new long[]{i, i + g};
            break;
        }
        return numbers;
    }

    @Override
    public int zeros(int n) {
        if (n < 5) return 0;
        int count = 0;
        for (int i = 5; n / i >= 1; i *= 5)
            count += n / i;
        return count;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        BigInteger i = n.add(BigInteger.valueOf(1));
        BigInteger num1 = BigInteger.valueOf(0);
        BigInteger num2 = BigInteger.valueOf(1);
        BigInteger sum = BigInteger.valueOf(0);
        for (BigInteger j = BigInteger.valueOf(0); j.compareTo(i) < 0; j = j.add(BigInteger.valueOf(1))) {
            sum = sum.add(num2);
            BigInteger a = num1;
            num1 = num2;
            num2 = num2.add(a);
        }
        return sum.multiply(BigInteger.valueOf(4));
    }

    @Override
    public double solveSum(double m) {
        double s = Math.sqrt(4 * m + 1);
        return (2 * m + 1 - s) / (2 * m);
    }

    @Override
    public long[] smallest(long n) {
        StringBuilder num = new StringBuilder(String.valueOf(n));
        long min = n;
        long minStart = 0;
        long minEnd = 0;
        for (int i = 0; i < num.length(); i++) {
            for (int j = 0; j < num.length(); j++) {
                char c = num.charAt(i);
                StringBuilder anotherNum = new StringBuilder(String.valueOf(n));
                anotherNum.deleteCharAt(i);
                anotherNum.insert(j, c);
                long a = Long.parseLong(String.valueOf(anotherNum));
                if (a < min) {
                    min = a;
                    minStart = i;
                    minEnd = j;
                }
            }
        }
        return new long[]{min, minStart, minEnd};
    }

    public static void main(String[] args) {
        FiveImpl five = new FiveImpl();
        System.out.println(five.artificialRain(new int[]{2}));
        System.out.println(five.artificialRain(new int[]{1,2,1,2,1}));
        System.out.println(five.artificialRain(new int[]{4,2,3,3,2}));
    }
}
