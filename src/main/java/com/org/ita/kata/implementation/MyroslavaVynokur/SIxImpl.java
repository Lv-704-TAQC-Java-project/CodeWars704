package com.org.ita.kata.implementation.MyroslavaVynokur;

import com.org.ita.kata.Base;
import com.org.ita.kata.Six;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


public class SIxImpl extends Base implements Six {
    @Override
    public long findNb(long m) {
        long sqrt1 = (long) Math.sqrt(m);
        if (sqrt1 * sqrt1 == m) {
            long n = (long) Math.sqrt(2 * sqrt1);
            if ((n * (n + 1) == 2 * sqrt1)) {
                return n;
            } else return -1;
        } else return -1;
    }

    @Override
    public String balance(String book) {
        final String ORIGINAL_BALANCE = "Original Balance: ";
        final String TOTAL_EXPENSE = "Total expense  ";
        final String AVERAGE_EXPENSE = "Average expense  ";
        final String BALANCE = " Balance ";
        final String ENTER = "\\r\\n";
        final String SPACE = " ";

        String cleanedBook = book.replaceAll("([^\\n. \\da-zA-Z])", "");
        String[] lines = cleanedBook.split("[\\n]+");

        double totalBalance = Double.parseDouble(lines[0]);
        double totalExpense = 0;

        StringBuilder sb = new StringBuilder();

        String oneLine;
        String[] oneLineArr;
        for (int i = 1; i < lines.length; i++) {
            oneLine = lines[i];
            oneLineArr = oneLine.split("\\s+");
            totalExpense += Double.parseDouble(oneLineArr[2]);
            totalBalance -= Double.parseDouble(oneLineArr[2]);
            sb.append(oneLineArr[0]).append(SPACE).append(oneLineArr[1]).append(SPACE).append(oneLineArr[2]).append(BALANCE)
                    .append((new DecimalFormat("#.##").format(totalBalance))).append(ENTER);
        }
        double averageExpense = totalExpense / (lines.length - 1);
        double averageExpenseF = Math.floor(averageExpense * 100 / 100);
        double originalBalance = Double.parseDouble(lines[0]);

        String completedString = sb.toString();

        return ORIGINAL_BALANCE + (new DecimalFormat("#.00").format(originalBalance)) + ENTER + completedString +
                TOTAL_EXPENSE + new DecimalFormat("0.00").format(totalExpense) +
                ENTER + AVERAGE_EXPENSE + (new DecimalFormat("0.00").format(averageExpense));
    }

    @Override
    public double f(double x) {
        return x / (1 + Math.sqrt(1 + x));
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

        if (!resultSheet.contains(toFind + " ")) {
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
