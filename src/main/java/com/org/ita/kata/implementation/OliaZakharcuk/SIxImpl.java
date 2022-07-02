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
        return 0;
    }

    @Override
    public double variance(String town, String strng) {
        return 0;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        return null;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {

        if (lstOfArt == null || lstOfArt.length == 0) return "";
        int[] sumList = new int[lstOf1stLetter.length];
        String res = "";

        for(String i : lstOfArt){
            String[] splitedLstOfArt = i.split(" ");
            for (int j = 0; j < lstOf1stLetter.length; j++){
                if(lstOf1stLetter[j].charAt(0) == splitedLstOfArt[0].charAt(0)){
                    sumList[j] = sumList[j] + Integer.parseInt(splitedLstOfArt[1]);
                }
            }
        }
        for(int i = 0; i < lstOf1stLetter.length; i++){
            res = res + "(" + lstOf1stLetter[i] + " : " + sumList[i] + ")" ;
            if(i < lstOf1stLetter.length - 1) res = res + " - ";
        }
        return res;
    }
}
