package com.org.ita.kata.implementation.nastiakomarenko;

import com.org.ita.kata.Six;

import java.math.BigDecimal;
import java.math.MathContext;


public class SIxImpl implements Six {
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

        String ORIGINAL_BALANCE = "Original Balance: ",TOTAL_EXPENSE = "Total expense ",
                AVERAGE_EXPENSE = "Average expense ", BALANCE = " Balance ", ENTER = "\r\n";

        StringBuilder sb = new StringBuilder();
        String cleanedBook = book.replaceAll("([^\\n. \\da-zA-Z])", "");
        String[] lines = cleanedBook.split("[\\n]+");
        String str;
        String[] strArr;

        double totalBalance = Double.parseDouble(lines[0]);
        double totalExpense = 0;

        for (int i = 1; i < lines.length; i++) {
            str = lines[i];
            strArr = str.split("\\s+");
            totalExpense += Double.parseDouble(strArr[2]);
            totalBalance -= Double.parseDouble(strArr[2]);
            sb.append(strArr[0]).append(" ").append(strArr[1]).append(" ")
                    .append(strArr[2]).append(BALANCE).append((new DecimalFormat("#.##")
                            .format(totalBalance))).append(ENTER);
        }
        double average = totalExpense / (lines.length - 1);
        double averageExpense = Math.floor(average * 100 / 100);
        double originalBalance = Double.parseDouble(lines[0]);

        String completedString = sb.toString();
        String finalStr = ORIGINAL_BALANCE + (new DecimalFormat("#.00").format(originalBalance)) + "\n" + completedString +
                TOTAL_EXPENSE + new DecimalFormat("0.00").format(totalExpense) +
                "\n" + AVERAGE_EXPENSE + (new DecimalFormat("0.00").format(averageExpense));
        return finalStr;
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
        String[] lines = str2.split("\n");
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
    public double variance(String town, String str2) {

        double count = 0.0, sum=0.0;
        for (int i = 0; i < str2.length(); i++) {
            if (Character.isDigit(str2.charAt(i))) {
                count++;
                sum += Double.parseDouble(String.valueOf(str2.charAt(i)));
            }
        }
        double average = sum/count;
        double arr[] = new double[(int) count];
        int index=0;
        for (int j = 0; j < str2.length(); j++) {
            if (Character.isDigit(str2.charAt(j))) {
                arr[index]= (Double.parseDouble(String.valueOf(str2.charAt(j)))-average);
                index++;
            }
        }

        double result=0;
        for(int m=0;m<index;m++){
            result+=(arr[m]*arr[m]);
        }
        return result/count;

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
