package com.org.ita.kata.implementation.nastiakomarenko;

import com.org.ita.kata.Six;

import java.text.DecimalFormat;
import java.util.regex.Pattern;

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
        String result = finalStr.replaceAll(" ", "_");
        return result;
        }

    @Override
    public double f(double x) {
        x = (Math.exp(1)) - 15;
        double answer = 0;
        if (x < 0) {
            double mult = x * (-1);
            answer = Math.sqrt(1 + mult) - 1;

            System.out.println(answer);
        } else {
            answer = Math.sqrt(1 + x) - 1;
        }

        return answer;
    }

    @Override
    public double mean(String town, String str2) {
        int count = 0, sum=0;
        for (int i = 0; i < str2.length(); i++) {
            if (Character.isDigit(str2.charAt(i))) {
                count++;
                sum += Integer.parseInt(String.valueOf(str2.charAt(i)));
            }
        }
        return   sum/count;
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
        return null;
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
