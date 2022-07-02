package com.org.ita.kata.implementation.OliaZakharcuk;

import com.org.ita.kata.Six;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

        if (toFind == null || toFind.length() == 0) return "";
        String[] splitedPair = resultSheet.split(",");
        int countOfWin = 0;
        int countOfDraws = 0;
        int countOfLost = 0;
        int totalScore = 0;
        int totalConceded = 0;
        int mark = 0;

        for (String i : splitedPair) {

            Pattern teamNamePattern = Pattern.compile("\\b" + toFind + "\\b");
            Matcher teamNameMatcher = teamNamePattern.matcher(i);
            Pattern teamScorePattern = Pattern.compile("\\b\\d+\\b");
            Matcher teamScoreMatcher = teamScorePattern.matcher(i);
            Pattern wrongScorePattern = Pattern.compile("\\b\\d+\\.\\d+\\b");
            Matcher wrongScoreMatcher = wrongScorePattern.matcher(i);
            if (wrongScoreMatcher.find()) return "Error(float number):" + i;

            if (teamNameMatcher.find()) {
                String[] point = new String[2];
                int firstTeamScore;
                int secondTeamScore;
                int start = teamNameMatcher.start();
                int j = 0;
                while (teamScoreMatcher.find()){
                    point[j] = i.substring(teamScoreMatcher.start(), teamScoreMatcher.end());
                    j++;
                }

                if (start == 0){
                    firstTeamScore = Integer.parseInt(point[0]);
                    secondTeamScore = Integer.parseInt(point[1]);
                } else {
                    firstTeamScore = Integer.parseInt(point[1]);
                    secondTeamScore = Integer.parseInt(point[0]);
                }


                if (firstTeamScore > secondTeamScore) {
                    countOfWin++;
                    mark += 3;
                }
                if (firstTeamScore == secondTeamScore) {
                    countOfDraws++;
                    mark += 1;
                }
                if (firstTeamScore < secondTeamScore) countOfLost++;
                totalScore += firstTeamScore;
                totalConceded += secondTeamScore;
            }
        }
        if ((countOfWin == countOfDraws) && (countOfDraws == countOfLost) && (countOfLost == 0)){
            return toFind + ":This team didn't play!";

        }else{
            return toFind + ":W=" + countOfWin + ";D=" + countOfDraws + ";L=" + countOfLost + ";Scored=" + totalScore + ";Conceded=" + totalConceded + ";Points=" + mark;

        }
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
