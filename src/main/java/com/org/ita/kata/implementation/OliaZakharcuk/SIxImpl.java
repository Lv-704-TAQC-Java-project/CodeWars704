package com.org.ita.kata.implementation.OliaZakharcuk;

import com.org.ita.kata.Base;
import com.org.ita.kata.Six;

import java.math.BigDecimal;
import java.math.MathContext;
import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SIxImpl extends Base implements Six {
    @Override
    public long findNb(long m) {

        final int CUBE = 3;
        int n = 1;
        long tempSum = 1;

        while (tempSum != m) {
            if (tempSum > m) {
                n = -1;
                break;
            }
            n++;
            tempSum += (long) Math.pow(n, CUBE);
        }
        return n;
    }

    @Override
    public String balance(String book) {

        String cleanedBook = book.replaceAll("([^\\n. \\da-zA-Z])", "");
        String[] bookLines = cleanedBook.split("[\\n]+");
        String originalBalance = bookLines[0];
        StringBuilder tempString = new StringBuilder();
        double totalExp = 0.0;
        double average;
        double newBalance = Double.parseDouble(originalBalance);

        for (int i = 1; i < bookLines.length; i++) {
            String[] currentBookLine = bookLines[i].split("\\s+");
            totalExp += Double.parseDouble(currentBookLine[2]);
            newBalance -= Double.parseDouble(currentBookLine[2]);

            tempString.append(currentBookLine[0]).append(" ").append(currentBookLine[1]).append(" ")
                    .append(currentBookLine[2]).append(" Balance ")
                    .append((new DecimalFormat("0.00")
                            .format(newBalance))).append("\\r\\n");
        }
        average = totalExp / (bookLines.length - 1);

        return "Original Balance: " + (new DecimalFormat("#.00").format(Double.parseDouble(originalBalance))) + "\\r\\n" + tempString +
                "Total expense  " + new DecimalFormat("0.00").format(totalExp) +
                "\\r\\n" + "Average expense  " + (new DecimalFormat("0.00").format(average));
    }

    @Override
    public double f(double x) {

        MathContext mc = new MathContext(100);
        BigDecimal bigDecimal = new BigDecimal(x);
        BigDecimal bigDecimalOne = new BigDecimal(1);
        bigDecimal = bigDecimal.add(bigDecimalOne);
        bigDecimal = bigDecimal.sqrt(mc);
        bigDecimal = bigDecimal.subtract(bigDecimalOne);

        return bigDecimal.doubleValue();
    }

    @Override
    public double mean(String town, String strng) {

        int size = 0;
        double sum = 0;
        String[] splitedData = strng.split("\n");
        for (String k : splitedData) {
            String[] splitedTowns = k.split(":");
            for (String i : splitedTowns)
                if (i.equals(town)) {

                    String[] splitedRenge = splitedTowns[1].split(",");
                    for (String j : splitedRenge) {
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
    public double variance(String town, String strng) {

        double temp;
        int size = 0;
        double sum = 0;

        String[] splitedData = strng.split("\n");
        for (String k : splitedData) {
            String[] splitedTowns = k.split(":");
            for (String i : splitedTowns)
                if (i.equals(town)) {
                    String[] splitedRenge = splitedTowns[1].split(",");
                    for (String j : splitedRenge) {
                        String[] splitedNumbers = j.split(" ");
                        temp = Double.parseDouble(splitedNumbers[1]) - mean(town, strng);
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
        if ((countOfWin == countOfDraws) && (countOfDraws == countOfLost) && (countOfLost == 0)) {
            return toFind + ":This team didn't play!";

        } else {
            return toFind + ":W=" + countOfWin + ";D=" + countOfDraws + ";L=" + countOfLost + ";Scored=" + totalScore + ";Conceded=" + totalConceded + ";Points=" + mark;

        }
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {

        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        for (String firstLtLetter : lstOf1stLetter) {
            int counter = 0;

            for (String book : lstOfArt) {
                String reg = "^" + firstLtLetter + "+.*";
                if (book.matches(reg)) {
                    String numOfBooks = book.replaceAll("\\D", "");
                    counter += Integer.parseInt(numOfBooks);
                }
            }

            if (result.length() > 0) {
                result.append(" - ");
            }
            result.append(String.format("(%s : %d)", firstLtLetter, counter));
        }
        return result.toString();
    }
}
