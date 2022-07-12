package com.org.ita.kata.implementation.clarmmym;

import com.org.ita.kata.Six;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SIxImpl implements Six {
    @Override
    public long findNb(long m) {
        final int THREE = 3;
        int current = 1;
        long result = (long) Math.pow(current, THREE);

        while (result != m) {
            if (result > m) {
                current = -1;
                break;
            }
            current++;
            result += (long) Math.pow(current, THREE);
        }
        return current;
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
        return x / (Math.pow(1 + x, 1.0 / 2) + 1);
    }

    @Override
    public double mean(String town, String strng) {
        return Arrays.stream(dataNumbers(town, strng)).average().getAsDouble();
    }

    @Override
    public double variance(String town, String strng) {
        double avg = mean(town, strng);
        if (avg == -1) {
            return -1;
        }
        double[] data = dataNumbers(town, strng);

        double vars = 0;
        for (double d : data) {
            vars += Math.pow(d - avg, 2);

        }
        return vars / data.length;
    }

    private double[] dataNumbers(String town, String strng) {
        final int MONTH = 12;
        String regex = "^" + town + ":.+$";
        String townData = "";
        Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(strng);

        while (matcher.find()) {
            townData = matcher.group();
        }

        if (townData.equals("")) {
            return new double[]{-1};
        }

        double[] nb = new double[MONTH];
        String[] townDataPerMonth = townData.split(",");

        for (int i = 0; i < nb.length; i++) {
            nb[i] = Double.parseDouble(townDataPerMonth[i].split(" ")[1]);
        }
        return nb;
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
        StringBuilder result = new StringBuilder();

        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) {
            return "";
        }

        for (var firstLetter : lstOf1stLetter) {
            int temp = 0;
            for (var dataOfBook : lstOfArt) {
                if (firstLetter.charAt(0) == (dataOfBook.charAt(0))) {
                    System.out.println(Integer.parseInt(dataOfBook.split(" ")[1]));
                    temp += Integer.parseInt(dataOfBook.split(" ")[1]);
                }
            }
            result.append("(").append(firstLetter).append(" : ").append(temp).append(")");
            if (!firstLetter.equals(lstOf1stLetter[lstOf1stLetter.length - 1])) {
                result.append(" - ");
            }
        }
        return result.toString();
    }
}
