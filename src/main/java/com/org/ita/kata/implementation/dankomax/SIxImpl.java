package com.org.ita.kata.implementation.dankomax;

import com.org.ita.kata.BaseKata;
import com.org.ita.kata.Six;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Arrays;
import java.util.Locale;


public class SIxImpl extends BaseKata implements Six {
    private static String[] townRainfallArr(String town, String strng) {
        return Arrays.stream(strng.split("\n"))
                .filter(t -> t.contains(town + ":"))
                .findFirst()
                .orElse(":,")
                .split(":")[1]
                .split(",");
    }

    private static int teamScore(String teamStats) {
        return Arrays.stream(teamStats.split(" "))
                .filter(team -> team.matches("\\d+"))
                .map(Integer::parseInt)
                .findFirst()
                .orElse(0);
    }

    @Override
    public long findNb(long m) {
        long numberOfLevels = 0;
        long totalVolume = 0;

        while (totalVolume < m) {
            numberOfLevels++;
            totalVolume += (long) Math.pow(numberOfLevels, 3);
        }

        return totalVolume == m ? numberOfLevels : -1;
    }

    @Override
    public String balance(String book) {
        String cleanStr = book.replaceAll("[^\n. \\d\\w]", "");
        String[] linesArr = cleanStr.split("\\r?\\n");
        double originalBalance = Double.parseDouble(linesArr[0]);
        double currentBalance = originalBalance;
        StringBuilder finalStr = new StringBuilder(String.format(Locale.ENGLISH, "Original Balance: %.2f\\r\\n", originalBalance));

        for (int i = 1; i < linesArr.length; i++) {
            String[] currentLineArr = linesArr[i].replaceAll("\\s+", " ").split(" ");
            double currentExpense = Double.parseDouble(currentLineArr[currentLineArr.length - 1]);
            currentBalance -= currentExpense;
            finalStr.append(String.join(" ", currentLineArr));
            finalStr.append(String.format(Locale.ENGLISH, " Balance %.2f\\r\\n", currentBalance));
        }

        double totalExpense = originalBalance - currentBalance;
        int numOfExpenses = linesArr.length - 1;
        finalStr.append(String.format(Locale.ENGLISH, "Total expense  %.2f\\r\\n", totalExpense));
        finalStr.append(String.format(Locale.ENGLISH, "Average expense  %.2f", totalExpense / numOfExpenses));

        return finalStr.toString();
    }

    @Override
    public double f(double x) {
        return BigDecimal.ONE
                .add(BigDecimal.valueOf(x))
                .sqrt(MathContext.DECIMAL128)
                .subtract(BigDecimal.ONE)
                .doubleValue();
    }

    @Override
    public double mean(String town, String strng) {
        return Arrays.stream(townRainfallArr(town, strng))
                .mapToDouble(month -> Double.parseDouble(month.split(" ")[1]))
                .average()
                .orElse(-1.0);
    }

    @Override
    public double variance(String town, String strng) {
        return Arrays.stream(townRainfallArr(town, strng))
                .mapToDouble(month -> Math.pow(Double.parseDouble(month.split(" ")[1]) - mean(town, strng), 2))
                .average()
                .orElse(-1.0);
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {

        if (toFind.isEmpty()) {
            return "";
        }

        if (!resultSheet.contains(toFind + " ")) {
            return String.format("%s:This team didn't play!", toFind);
        }

        String[] relevantGames = Arrays.stream(resultSheet.split(","))
                .filter(game -> game.contains(toFind))
                .toArray(String[]::new);

        int wins = 0;
        int draws = 0;
        int loses = 0;
        int scored = 0;
        int conceded = 0;

        for (String currentGame : relevantGames) {
            if (currentGame.contains(".")) {
                return String.format("Error(float number):%s", currentGame);
            }

            String opponentTeam = currentGame.replaceAll(toFind + " \\d+", "").trim();
            String ourTeam = currentGame.replaceAll(opponentTeam, "").trim();

            int opponentTeamScore = teamScore(opponentTeam);
            int ourTeamScore = teamScore(ourTeam);

            if (ourTeamScore > opponentTeamScore) {
                wins++;
            } else if (ourTeamScore < opponentTeamScore) {
                loses++;
            } else {
                draws++;
            }

            scored += ourTeamScore;
            conceded += opponentTeamScore;
        }

        int rank = wins * 3 + draws;

        return String.format("%s:W=%d;D=%d;L=%d;Scored=%d;Conceded=%d;Points=%d", toFind, wins, draws, loses, scored, conceded, rank);
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) {
            return "";
        }

        final String DIVIDER = " - ";
        StringBuilder finalStr = new StringBuilder();

        for (String letter : lstOf1stLetter) {
            int categoryQuantity = 0;

            for (String art : lstOfArt) {
                if (art.matches("^" + letter + "+.*")) {
                    categoryQuantity += Integer.parseInt(art.replaceAll("\\D", ""));
                }
            }

            if (finalStr.length() > 0) {
                finalStr.append(DIVIDER);
            }
            finalStr.append(String.format("(%s : %d)", letter, categoryQuantity));
        }
        return finalStr.toString();
    }
}
