package com.org.ita.kata.implementation.dankomax;

import com.org.ita.kata.Six;
import java.util.Arrays;

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

    private static String[] townRainfallArr(String town, String strng) {
        return Arrays.stream(strng.split("\n"))
                .filter(t -> t.contains(town + ":"))
                .findFirst()
                .orElse(":,")
                .split(":")[1]
                .split(",");
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {

        if(toFind.isEmpty()) {
            return "";
        }

        if(!resultSheet.contains(toFind + " ")) {
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

    private static int teamScore (String teamStats) {
        return Arrays.stream(teamStats.split(" "))
                .filter(team -> team.matches("\\d+"))
                .map(Integer::parseInt)
                .findFirst()
                .orElse(0);
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
