package com.org.ita.kata.implementation.ykireyeva;

import com.org.ita.kata.Six;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


public class SIxImpl implements Six {
    @Override
    public long findNb(long m) {
        long sum = 0L;
        long n = 0;
        while (sum != m) {
            sum += Math.pow(1 + n, 3);
            n++;
        }
        return n;
    }

    @Override
    public String balance(String book) {
        String[] lines = book.split("\\r\\n|\\n");
        String regex = "[!:=;?,{}]";
        StringBuilder resultBook = new StringBuilder("Original Balance: "
                + lines[0].replaceAll(regex, "") + "\\r\\n");
        double actualBalance = Double.parseDouble(lines[0].replaceAll(regex, ""));
        double totalExpense = 0;
        double averageExpense;

        for (int i = 1; i < lines.length; i++) {
            String line = lines[i].replaceAll(regex, "");
            String[] elements = line.split("\\s+");
            actualBalance -= Double.parseDouble(elements[2]);
            totalExpense += Double.parseDouble(elements[2]);
            resultBook.append(String.format("%s %s %s Balance %s\\r\\n",
                    elements[0], elements[1], elements[2], new DecimalFormat("#.00").format(actualBalance)));
        }

        averageExpense = totalExpense / (lines.length - 1);
        resultBook.append(String.format("Total expense  %s\\r\\nAverage expense  %s",
                new DecimalFormat("0.00").format(totalExpense),
                new DecimalFormat("0.00").format(averageExpense)));

        return resultBook.toString();
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
        int numOfDraws = 0;
        int numOfWin = 0;
        int numOfLose = 0;
        int totalScored = 0;
        int totalConceded = 0;
        int sumOfPoints = 0;
        int indexOfRequiredTeam;
        int indexOfOtherTeam;
        Pattern pattern = Pattern.compile(".*" + toFind + ".*");
        StringBuilder result = new StringBuilder();

        if (!Pattern.compile(toFind + "\\s").matcher(resultSheet).find()) {
            return toFind + ":This team didn't play!";
        }
        if (toFind.length() == 0) {
            return "";
        }

        ArrayList<String> listOfMatches = Arrays.stream(resultSheet.split(","))
                .filter(e -> pattern.matcher(e).matches())
                .collect(Collectors.toCollection(ArrayList::new));

        ArrayList<String> listOfTeams = new ArrayList<>();
        for (String m : listOfMatches) {
            if (Pattern.compile("\\d+\\.\\d+").matcher(m).find()) {
                return "Error(float number):" + m;
            }
            listOfTeams.addAll(List.of(m.split("(?<=[0-9]\\s)")));
        }

        for (int i = 0; i < listOfTeams.size(); i += 2) {
            if (pattern.matcher(listOfTeams.get(i)).find()) {
                indexOfRequiredTeam = i;
                indexOfOtherTeam = i + 1;
            } else {
                indexOfRequiredTeam = i + 1;
                indexOfOtherTeam = i;
            }
            int scoreOfRequired = Integer.parseInt(listOfTeams.get(indexOfRequiredTeam)
                    .trim()
                    .replaceAll(".*[^\\d](\\d+).*", "$1"));
            int scoreOfOther = Integer.parseInt(listOfTeams.get(indexOfOtherTeam)
                    .trim()
                    .replaceAll(".*[^\\d](\\d+).*", "$1"));

            totalScored += scoreOfRequired;
            totalConceded += scoreOfOther;

            if (scoreOfRequired > scoreOfOther) {
                numOfWin++;
                sumOfPoints += 3;
            } else if (scoreOfRequired < scoreOfOther) {
                numOfLose++;
            } else {
                numOfDraws++;
                sumOfPoints += 1;
            }
        }
        result.append(String.format("%s:W=%d;D=%d;L=%d;Scored=%d;Conceded=%d;Points=%d",
                toFind, numOfWin, numOfDraws, numOfLose, totalScored, totalConceded, sumOfPoints));
        return result.toString();
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
