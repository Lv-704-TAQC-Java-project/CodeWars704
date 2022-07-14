package com.org.ita.kata.implementation.nastiakomarenko;

import com.org.ita.kata.Base;
import com.org.ita.kata.Six;


import java.util.Locale;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class SIxImpl extends Base implements Six {
    @Override
    public long findNb(long M) {

        long m = 0;
        long i = 0;
        while (m < M) {
            m += i * i * i;
            if (m == M) {
                return i;
            }
            i += 1;
        }
        return -1;

    }

    @Override
    public String balance(String book) {
        String allBalance = "";
        String[] lines = book.split("\n");
        String reg = "[ !=,:;?*{}]";
        String balance = lines[0].replaceAll(reg, "");
        allBalance = allBalance + "Original Balance: " + balance + "\n";
        double total = 0;
        int count = 0;
        for (int i = 1; i < lines.length; i++) {
            String text = lines[i].replaceAll(reg, "");
            Pattern p1 = Pattern.compile("\\d+");
            Pattern p2 = Pattern.compile("[a-zA-Z]+");
            Pattern p3 = Pattern.compile("\\d+\\.\\d+");
            Matcher m1 = p1.matcher(text);
            Matcher m2 = p2.matcher(text);
            Matcher m3 = p3.matcher(text);
            String a = "";
            String b = "";
            String c = "";
            if (m1.find()) a = text.substring(m1.start(), m1.end());
            if (m2.find()) b = text.substring(m2.start(), m2.end());
            if (m3.find()) c = text.substring(m3.start(), m3.end());
            total += Double.parseDouble(c);
            count++;
            balance = String.valueOf((Double.parseDouble(balance) - Double.parseDouble(c)));
            balance = String.format(Locale.ENGLISH, "%.2f", Double.parseDouble(balance));
            allBalance += a + " " + b + " " + c + " Balance " + balance + "\n";


        }
        double avg = total / count;
        allBalance += "Total expense  " + String.format(Locale.ENGLISH, "%.2f", total) + "\n";
        allBalance += "Average expense  " + String.format(Locale.ENGLISH, "%.2f", avg);
        return allBalance;

    }


    @Override
    public double f(double x) {
        BigDecimal bigDecimal = new BigDecimal(x);
        bigDecimal = bigDecimal.add(BigDecimal.valueOf(1));
        MathContext mc = new MathContext(50);
        bigDecimal = bigDecimal.sqrt(mc);
        bigDecimal = bigDecimal.subtract(BigDecimal.valueOf(1));
        return Double.parseDouble(String.valueOf(bigDecimal));

    }

    @Override
    public double mean(String town, String str2) {
        int size = 0;
        double sum = 0;
        String[] Data = str2.split("\n");
        for (String k : Data) {
            if (k.contains(town)) {
                String[] towns = k.split(":");
                String[] renge = towns[1].split(",");
                for (String j : renge) {
                    String[] splitedNumbers = j.split(" ");
                    sum = sum + Double.parseDouble(splitedNumbers[1]);
                    size++;
                }
            }
        }

        if (size == 0) {
            return -1.0;
        }

        sum = sum / size;

        return sum;

    }

    @Override
    public double variance(String town, String str2) {

        double temp;
        int size = 0;
        double sum = 0;

        String[] data = str2.split("\n");
        for (String k : data) {
            if (k.contains(town)) {
                String[] towns = k.split(":");
                String[] renge = towns[1].split(",");
                for (String j : renge) {
                    String[] splitedNumbers = j.split(" ");
                    temp = Double.parseDouble(splitedNumbers[1]) - mean(town, str2);
                    sum = sum + Math.pow(temp, 2);
                    size++;
                }
            }
        }

        if (size == 0) {
            return -1.0;
        }

        return sum / size;

    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {

        String[] pair = resultSheet.split(",");
        int countOfWin = 0;
        int countOfDraws = 0;
        int countOfLost = 0;
        int totalScore = 0;
        int totalConceded = 0;
        int mark = 0;

        for (String i : pair) {

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
                while (teamScoreMatcher.find()) {
                    point[j] = i.substring(teamScoreMatcher.start(), teamScoreMatcher.end());
                    j++;
                }

                if (start == 0) {
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
        if (toFind == null || toFind.length() == 0) return "";

        if ((countOfWin == countOfDraws) && (countOfDraws == countOfLost) && (countOfLost == 0)) {
            return toFind + ":This team didn't play!";

        } else {
            return toFind + ":W=" + countOfWin + ";D=" + countOfDraws + ";L=" + countOfLost + ";Scored=" + totalScore + ";Conceded=" + totalConceded + ";Points=" + mark;

        }
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {

        StringBuilder result = new StringBuilder();

        if (lstOfArt.length == 0) {
            return "";
        }

        for (String letter : lstOf1stLetter) {
            int amount = 0;
            for (String art : lstOfArt) {
                if (Pattern.compile("^" + letter).matcher(art).find()) {
                    amount += Integer.parseInt(art.replaceAll("[A-Z]", "").trim());
                }
            }
            result.append(String.format("(%s : %d) - ", letter, amount));

        }
        return result.toString().trim().replaceAll("\\s.$", "");
    }
}
