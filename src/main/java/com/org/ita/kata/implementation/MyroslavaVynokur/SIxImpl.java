package com.org.ita.kata.implementation.MyroslavaVynokur;

import com.org.ita.kata.Six;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


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
        return Arrays.stream(strng.split("\n"))
                .filter(line -> line.startsWith(town + ":"))
                .map(String::toLowerCase)
                .map(s -> s.replaceAll(":| |[a-z]", ""))
                .findFirst()
                .map(s -> Arrays.stream(s.split(","))
                        .mapToDouble(Double::parseDouble)
                        .sum() / 12).orElse(-1.0);
    }

    @Override
    public double variance(String town, String strng) {
        double average = mean(town, strng);
        return Arrays.stream(strng.split("\n"))
                .filter(line -> line.startsWith(town + ":"))
                .map(String::toLowerCase)
                .map(s -> s.replaceAll(":| |[a-z]", ""))
                .findFirst()
                .map(s -> Arrays.stream(s.split(","))
                        .mapToDouble(Double::parseDouble)
                        .map(x -> (x - average) * (x - average))
                        .sum() / 12)
                .orElse(-1.0);
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        int won = 0;
        int draws = 0;
        int lost = 0;
        int rank = 0;

        String[] allRecords = resultSheet.split(",");
        List<String> teamRecords = new ArrayList<>();
        for (String allRecord : allRecords) {
            if (allRecord.contains(toFind + " ")) {
                teamRecords.add(allRecord);
            }
        }

        List<String> teamScores = new ArrayList<>();
        List<String> opponentScores = new ArrayList<>();

        for (String teamRecord : teamRecords) {
            Pattern p = Pattern.compile("\\b\\d+\\.\\d+\\b");
            Matcher m = p.matcher(teamRecord);
            if (m.find()) return "Error(float number):" + teamRecord;

            List<String> elementsLine = Arrays.stream(teamRecord.split(" ")).collect(Collectors.toList());

            for (int y = 0; y < elementsLine.size(); y++) {
                if (toFind.endsWith(elementsLine.get(y))) {
                    teamScores.add(elementsLine.get(y + 1));
                }
                if (elementsLine.get(y).matches("\\d+") && !toFind.endsWith(elementsLine.get(y - 1))) {
                    opponentScores.add(elementsLine.get(y));
                }
            }
        }

        List<Integer> teamScoresInt = teamScores.stream().map(Integer::valueOf).collect(Collectors.toList());
        List<Integer> opponentScoresInt = opponentScores.stream().map(Integer::valueOf).collect(Collectors.toList());

        int pointsScored = teamScoresInt.stream().mapToInt(Integer::intValue).sum();
        int pointsConceded = opponentScoresInt.stream().mapToInt(Integer::intValue).sum();

        for (int i = 0; i < teamScoresInt.size(); i++) {
            if (teamScoresInt.get(i) - opponentScoresInt.get(i) > 0) {
                won++;
                rank += 3;
            } else {
                lost++;
            }
            if (teamScoresInt.get(i) - opponentScoresInt.get(i) == 0) {
                draws++;
                rank += 1;
            }
        }

        if ((won == 0) & (draws == 0) & (lost == 0) & toFind != "") {
            return toFind + ":This team didn't play!";
        }

        return toFind == "" ? "" : toFind + ":W=" + won + ";D=" + draws
                + ";L=" + lost + ";Scored=" + pointsScored + ";Conceded=" + pointsConceded + ";Points=" + rank;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {

        if (lstOfArt == null | lstOfArt.length == 0 | lstOf1stLetter == null | lstOf1stLetter.length == 0) {
            return "";
        }
        String answer = "";

        for (int i = 0; i < lstOf1stLetter.length; i++) {
            int sum = 0;
            for (int t = 0; t < lstOfArt.length; t++) {
                if (lstOfArt[t].charAt(0) == lstOf1stLetter[i].charAt(0)) {
                    String[] element = lstOfArt[t].split(" ");
                    System.out.println(Arrays.toString(element));
                    sum += Integer.parseInt(element[1]);
                }
            }
            answer += "(" + lstOf1stLetter[i] + " : " + sum + ")";
            if ((lstOf1stLetter.length - 1) != i) {
                answer += " - ";
            }
        }
        return answer;
    }
}
