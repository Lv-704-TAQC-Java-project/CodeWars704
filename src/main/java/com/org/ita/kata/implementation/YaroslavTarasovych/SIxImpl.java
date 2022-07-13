package com.org.ita.kata.implementation.YaroslavTarasovych;

import com.org.ita.kata.Base;
import com.org.ita.kata.Six;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.Locale;
import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class SIxImpl extends Base implements Six {
    @Override
    public long findNb(long m) {
        BigInteger big = new BigInteger(String.valueOf(0));
        int i = 1;
        int n = -1;
        BigInteger mNum = new BigInteger(String.valueOf(m));
        while (big.compareTo(mNum) < 0) {
            long math = (long) Math.pow(i, 3);
            big = big.add(BigInteger.valueOf(math));
            n = i;
            i++;
        }
        if (big.compareTo(mNum) == 0) {
            return n;
        } else {
            return -1;
        }
    }

    @Override
    public String balance(String book) {

        String allBalance = "";
        String[] lines = book.split("\\n|\\r");
        String reg = "[ !=,:;?*{}]";
        String balance = lines[0].replaceAll(reg, "");
        allBalance = allBalance + "Original Balance: " + balance + "\\r\\n";
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
            allBalance += a + " " + b + " " + c + " Balance " + balance + "\\r\\n";

        }
        double avg = total / count;
        allBalance += "Total expense  " + String.format(Locale.ENGLISH, "%.2f", total) + "\\r\\n";
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
    public double mean(String town, String strng) {
        String[] lines = strng.split("\n");
        double avg = -1;
        int count = 0;
        for (String s : lines) {
            String[] line = s.split("[: ,]");
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
    public double variance(String town, String strng) {
        double avg = mean(town, strng);
        if (avg == -1) return -1;
        int count = 0;
        double var = 0;
        String[] lines = strng.split("\n");
        for (String s : lines) {
            String[] line = s.split("[: ,]");
            if (line[0].equals(town)) {
                for (int j = 2; j < line.length; j += 2) {
                    var = var + Math.pow(Double.parseDouble(line[j]) - avg, 2);
                    count++;
                }
                var = var / count;
            }
        }
        return var;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        if (toFind == null || toFind.length() == 0) return "";
        String[] lines = resultSheet.split(",");
        int win = 0;
        int draws = 0;
        int lost = 0;
        int pointScore = 0;
        int pointConceded = 0;
        int points = 0;

        for (String line : lines) {

            Pattern p = Pattern.compile("\\b" + toFind + "\\b");
            Matcher m = p.matcher(line);
            Pattern p1 = Pattern.compile("\\b\\d+\\b");
            Matcher m1 = p1.matcher(line);
            if (m.find()) {
                Pattern p2 = Pattern.compile("\\b\\d+\\.\\d+\\b");
                Matcher m2 = p2.matcher(line);
                if (m2.find()) return "Error(float number):" + line;
                String[] point = new String[2];
                int pointTeam;
                int pointOther;
                int start = m.start();
                int j = 0;
                while (m1.find()) {
                    point[j] = line.substring(m1.start(), m1.end());
                    j++;
                }
                if (start == 0) {
                    pointTeam = Integer.parseInt(point[0]);
                    pointOther = Integer.parseInt(point[1]);
                } else {
                    pointTeam = Integer.parseInt(point[1]);
                    pointOther = Integer.parseInt(point[0]);
                }
                if (pointTeam > pointOther) {
                    win++;
                    points += 3;
                }
                if (pointTeam == pointOther) {
                    draws++;
                    points += 1;
                }
                if (pointTeam < pointOther) lost++;
                pointScore += pointTeam;
                pointConceded += pointOther;
            }
        }
        return ((win == draws) && (draws == lost) && (lost == 0)) ? toFind + ":This team didn't play!" :
                toFind + ":W=" + win + ";D=" + draws + ";L=" + lost + ";Scored=" + pointScore + ";Conceded=" + pointConceded + ";Points=" + points;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOfArt == null || lstOfArt.length == 0) return "";
        int[] sum = new int[lstOf1stLetter.length];
        for (String s : lstOfArt) {
            String[] line = s.split(" ");
            for (int j = 0; j < lstOf1stLetter.length; j++) {
                if (line[0].charAt(0) == lstOf1stLetter[j].charAt(0)) sum[j] += Integer.parseInt(line[1]);
            }
        }
        StringJoiner joiner = new StringJoiner(" - ", "", "");
        for (int i = 0; i < lstOf1stLetter.length; i++) {
            joiner.add("(" + lstOf1stLetter[i] + " : " + sum[i] + ")");
        }
        return joiner.toString();
    }

}
