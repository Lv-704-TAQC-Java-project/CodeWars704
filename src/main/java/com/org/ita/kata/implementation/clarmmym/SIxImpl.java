package com.org.ita.kata.implementation.clarmmym;

import com.org.ita.kata.Six;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SIxImpl implements Six {
    @Override
    public long findNb(long m) {
        return 0;
    }

    @Override
    public String balance(String book) {
        String[] check = book.split("\n");

        Pattern pattern = Pattern.compile("[^(\\s\\w.)]+");

        for (int i = 0; i < check.length; i++) {
            Matcher matcher = pattern.matcher(check[i]);

            while (matcher.find()) {
                check[i] = check[i].replace(matcher.group(), "");
            }
        }

        BigDecimal originalBalance = new BigDecimal(check[0]);
        BigDecimal currentBalance = originalBalance;

        check[0] = "Original Balance: " + originalBalance;

        for (int i = 1; i < check.length; i++) {
            String[] purchase = check[i].split(" ");
            BigDecimal purchaseCost = new BigDecimal(purchase[purchase.length - 1]);
            currentBalance = currentBalance.subtract(purchaseCost);
            check[i] += " Balance " + currentBalance;
        }

        BigDecimal bill = originalBalance.subtract(currentBalance);
        StringBuilder result = new StringBuilder();

        for (String c : check) {
            result.append(c).append("\\r\\n");
        }

        result.append("Total expense  ").append(bill).append("\\r\\nAverage expense  ").append(bill.divide(new BigDecimal(check.length - 1), 2, RoundingMode.HALF_UP));
        return result.toString();
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
        if (toFind.equals("")) {
            return "";
        }

        String[] sheetParsed = resultSheet.split(",");

        StringBuilder answer = new StringBuilder();


        final int winConst = 3;
        final int drawConst = 1;

        int wins = 0;
        int draws = 0;
        int loses = 0;

        int totalWinScore = 0;
        int totalLoseScore = 0;

        for (String s : sheetParsed) {
            if (!s.contains(toFind + " ")) {
                continue;
            }

            String[] gameScore = s.split("(?<=\\d) (?=[A-Z])");
            String[] teemResult = gameScore[0].split(" ");

            int scoreFirstTeam = Integer.parseInt(teemResult[teemResult.length - 1]);

            teemResult = gameScore[1].split(" ");
            int scoreSecondTeam = Integer.parseInt(teemResult[teemResult.length - 1]);


            if (gameScore[0].contains(toFind + " ")) {
                totalWinScore += scoreFirstTeam;
                totalLoseScore += scoreSecondTeam;

                if (scoreFirstTeam > scoreSecondTeam) {
                    wins++;

                } else if (scoreFirstTeam == scoreSecondTeam) {
                    draws++;
                } else {
                    loses++;
                }
            } else {
                totalWinScore += scoreSecondTeam;
                totalLoseScore += scoreFirstTeam;
                if (scoreFirstTeam < scoreSecondTeam) {
                    wins++;
                } else if (scoreFirstTeam == scoreSecondTeam) {
                    draws++;
                } else {
                    loses++;
                }
            }

        }

        if (totalWinScore + totalLoseScore == 0) {
            answer.append(toFind).append(":This team didn't play!");
            return answer.toString();
        }

        answer.append(toFind).
                append(":W=").append(wins).append(";D=").
                append(draws).append(";L=").append(loses).
                append(";Scored=").append(totalWinScore).append(";Conceded=").append(totalLoseScore).
                append(";Points=").append(wins * winConst + draws * drawConst);
        return answer.toString();

    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return null;
    }
}
