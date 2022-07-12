package com.org.ita.kata.implementation.nastiakomarenko;

import com.org.ita.kata.Base;
import com.org.ita.kata.Five;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class FiveImpl extends Base implements Five {
    @Override
    public int artificialRain(int[] v) {
        return 0;
    }

    @Override
    public long[] gap(int g, long m, long n) {

        List<Long> primes = new ArrayList<>();

        for (long i = m; i < n; i++)
            if (FiveImpl.prime(i)) {
                primes.add(i);
            }

        long[] arr = new long[2];

        for (int j = 0; j < primes.size() - 1; j++) {
            if ((primes.get(j) + g) == primes.get(j + 1)) {
                arr[0] = primes.get(j);
                arr[1] = (primes.get(j + 1));
                break;
            }
        }
        if (arr[0] == 0 & arr[1] == 0)
        {
            arr = null;
        }
        return arr;
        }
    private static boolean prime(double n) {
        boolean prime = true;
        for (int m = 2; m <= n / 2; m++) {
            if ((n % m) == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }

    @Override
    public int zeros(int factor) {
            int count = 0;
            double Max = Math.log(factor) / Math.log(5);
            for (int k = 1; k < Max; k++) {
                count = count + (int) (factor / Math.pow(5, k));
            }
            return count;


    }


    @Override
    public BigInteger perimeter(BigInteger n) {

        BigInteger first = BigInteger.valueOf(0);
        BigInteger second = BigInteger.valueOf(1);
        BigInteger sum = BigInteger.valueOf(0);
        BigInteger result = BigInteger.valueOf(0);

        for (int i = 0; i <= n.intValue(); i++) {
            first = second;
            second = sum;
            sum = first.add(second);
            result = result.add(sum);
        }
        return result.multiply(BigInteger.valueOf(4));
    }

    @Override
    public double solveSum(double m) {
        double  U = Math.sqrt(4 * m + 1);
        return (2 * m + 1 - U) / (2 * m);
    }

    @Override
    public long[] smallest(long n) {

            ArrayList<Integer> listOfDigits = numIntoDigits(n);
            StringBuilder s = new StringBuilder();
            long[] arr = new long[3];
            int min = Integer.MAX_VALUE;
            int indexOfMin = 0;
            int newIndex = 0;
            int resultNumber;
            for (int i = 1; i < listOfDigits.size(); i++){
                if (listOfDigits.get(i) < min){
                    min = listOfDigits.get(i);
                    indexOfMin = i;
                }
            }
            listOfDigits.remove(indexOfMin);
            if (min == 0 && indexOfMin == 1){
                indexOfMin = 0;
                newIndex = 1;
            }
            if (min < listOfDigits.get(0)){
                listOfDigits.add(0, min);
            } else {
                listOfDigits.add(1, min);
                newIndex = 1;
            }

            listOfDigits.forEach(s::append);
            resultNumber = Integer.parseInt(s.toString());
            arr[0] = resultNumber;
            arr[1] = indexOfMin;
            arr[2] = newIndex;
            System.out.println(Arrays.toString(arr));
            return arr;
        }

        private ArrayList<Integer> numIntoDigits(long n){
            ArrayList<Integer> list = new ArrayList<>();
            while (n > 0){
                list.add((int) (n % 10));
                n = n/10;
            }
            Collections.reverse(list);
            return list;
        }
}
