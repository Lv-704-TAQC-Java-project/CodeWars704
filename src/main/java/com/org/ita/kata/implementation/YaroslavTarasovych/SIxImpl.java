package com.org.ita.kata.implementation.YaroslavTarasovych;

import com.org.ita.kata.Six;


import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.StringJoiner;


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
        String[] lines = strng.split("\n");
        double avg = -1;
        int count = 0;
        for (int i = 0; i < lines.length; i++) {
            String[] line = lines[i].split("[: ,]");
            if (line[0].equals(town)) {
                avg = 0;
                for (int j = 2; j < line.length; j += 2) {
                    avg = avg + Double.parseDouble(line[j]);
                    count++;
                }
                avg = avg / count;
            }
        }
        return avg;
    }

    @Override
    public double variance(String town, String strng) {
        double avg = mean(town, strng);
        if (avg == -1) return -1;
        int count = 0;
        double var = 0;
        String[] lines = strng.split("\n");
        for (int i = 0; i < lines.length; i++) {
            String[] line = lines[i].split("[: ,]");
            if (line[0].equals(town)) {
                for (int j = 2; j < line.length; j += 2) {
                    var = var + Math.pow(Double.parseDouble(line[j]) - avg, 2);
                    count++;
                }
                var = var / count;
            }
        }
        return var;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        if (toFind == null || toFind.length() == 0) return "";
        String[] lines = resultSheet.split(",");
        int win = 0;
        int draws = 0;
        int lost = 0;
        int pointScore = 0;
        int pointConceded = 0;
        int points = 0;

        for (int i = 0; i < lines.length; i++) {

            Pattern p = Pattern.compile("\\b" + toFind + "\\b");
            Matcher m = p.matcher(lines[i]);
            Pattern p1 = Pattern.compile("\\b\\d+\\b");
            Matcher m1 = p1.matcher(lines[i]);
            Pattern p2 = Pattern.compile("\\b\\d+\\.\\d+\\b");
            Matcher m2 = p2.matcher(lines[i]);
            if (m2.find()) return "Error(float number):" + lines[i];
            if (m.find()) {
                String[] point = new String[2];
                int pointTeam;
                int pointOther;
                int start = m.start();
                int j = 0;
                while (m1.find()){
                    point[j] = lines[i].substring(m1.start(), m1.end());
                    j++;
                }
                if (start == 0){
                    pointTeam = Integer.parseInt(point[0]);
                    pointOther = Integer.parseInt(point[1]);
                } else {
                    pointTeam = Integer.parseInt(point[1]);
                    pointOther = Integer.parseInt(point[0]);
                }
                if (pointTeam > pointOther) {
                    win++;
                    points += 3;
                }
                if (pointTeam == pointOther) {
                    draws++;
                    points += 1;
                }
                if (pointTeam < pointOther) lost++;
                pointScore += pointTeam;
                pointConceded += pointOther;
            }
        }
        return ((win == draws) && (draws == lost) && (lost == 0)) ? toFind + ":This team didn't play!" :
                toFind + ":W=" + win + ";D=" + draws + ";L=" + lost + ";Scored=" + pointScore + ";Conceded=" + pointConceded + ";Points=" + points;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOfArt == null || lstOfArt.length == 0) return "";
        int[] sum = new int[lstOf1stLetter.length];
        for (int i = 0; i < lstOfArt.length; i++) {
            String[] line = lstOfArt[i].split(" ");
            for (int j = 0; j < lstOf1stLetter.length; j++) {
                if (line[0].charAt(0) == lstOf1stLetter[j].charAt(0)) sum[j] += Integer.parseInt(line[1]);
            }
        }
        StringJoiner joiner = new StringJoiner(" - ", "", "");
        for (int i = 0; i < lstOf1stLetter.length; i++) {
            joiner.add("(" + lstOf1stLetter[i] + " : " + sum[i] + ")");
        }
        return joiner.toString();
    }

}
