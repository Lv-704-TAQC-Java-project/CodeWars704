package com.org.ita.kata.implementation.OliaZakharcuk;

import com.org.ita.kata.Six;

public class SIxImpl implements Six {
    @Override
    public long findNb(long m) {
        return 0;
    }

    @Override
    public String balance(String book) {
        return null;
    }

    @Override
    public double f(double x) {
        return 0;
    }

    @Override
    public double mean(String town, String strng) {

        int size = 0;
        double sum = 0;
        String[] splitedData = strng.split("\n");
        for (String k: splitedData){
            if(k.contains(town)){
                String[] splitedTowns = k.split(":");
                String[] splitedRenge = splitedTowns[1].split(",");
                for(String j : splitedRenge){
                    String[] splitedNumbers = j.split(" ");
                    sum = sum + Double.parseDouble(splitedNumbers[1]);
                    size++;
                }
            }
        }

        if(size == 0){
            return -1.0;
        }

        sum = sum / size;

        return sum;
    }

    @Override
    public double variance(String town, String strng) {

        double temp ;
        int size = 0;
        double sum = 0;

        String[] splitedData = strng.split("\n");
        for (String k: splitedData){
            if(k.contains(town)){
                String[] splitedTowns = k.split(":");
                String[] splitedRenge = splitedTowns[1].split(",");
                for(String j : splitedRenge){
                    String[] splitedNumbers = j.split(" ");
                    temp = Double.parseDouble(splitedNumbers[1]) - mean(town, strng);
                    sum = sum + Math.pow(temp, 2);
                    size++;
                }
            }
        }

        if(size == 0){
            return -1.0;
        }

        return sum / size;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        return null;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return null;
    }
}
