package com.org.ita.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

import static com.org.ita.utils.Message.*;


public class ConsoleReader implements Reader {

    public static BufferedReader br;

    public ConsoleReader() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public double readDouble() {
        try {
            return Double.parseDouble(ConsoleReader.br.readLine());
        } catch (IOException | NumberFormatException e) {
            colorln("Input should be double", ANSI_RED);
            return this.readDouble();
        }
    }

    @Override
    public int readInt() {
        try {
            return Integer.parseInt(ConsoleReader.br.readLine());
        } catch (IOException | NumberFormatException e) {
            colorln("Input should be int", ANSI_RED);
            return this.readInt();
        }
    }

    @Override
    public long readLong() {
        try {
            return Long.parseLong(ConsoleReader.br.readLine());
        } catch (IOException | NumberFormatException e) {
            colorln("Input should be of a 'long' type", ANSI_RED);
            return this.readLong();
        }
    }

    @Override
    public BigInteger readBigInteger() {
        try {
            return new BigInteger(ConsoleReader.br.readLine());
        } catch (IOException | NumberFormatException e) {
            colorln("Input should be BI", ANSI_RED);
            return this.readBigInteger();
        }
    }

    @Override
    public String readString() {
        try {
            return ConsoleReader.br.readLine();
        } catch (IOException e) {
            colorln(e.getMessage(), ANSI_RED);
            return this.readString();
        }
    }

    @Override
    public float readFloat() {
        try {
            return Float.parseFloat(ConsoleReader.br.readLine());
        } catch (IOException | NumberFormatException e) {
            colorln("Input should be float", ANSI_RED);
            return this.readFloat();
        }
    }

    @Override
    public String[] readStringArr() {
        try {
            return ConsoleReader.br.readLine().trim().split("\\s+");
        } catch (IOException e) {
            colorln(e.getMessage(), ANSI_RED);
            return this.readStringArr();
        }
    }

    @Override
    public String[] readStringArrSplitByComma() {
        try {
            return ConsoleReader.br.readLine().trim().split(",");
        } catch (IOException e) {
            colorln("Input should be String", ANSI_RED);
            return this.readStringArrSplitByComma();
        }
    }

    @Override
    public int[] readIntArr() {
        try {
            String[] in = br.readLine().trim().split("\\s+");
            int[] arr = new int[in.length];
            for (int i = 0; i < arr.length; i++)
                arr[i] = Integer.parseInt(in[i]);
            return arr;
        } catch (IOException | NumberFormatException e) {
            colorln("Input should be int", ANSI_RED);
            return this.readIntArr();
        }
    }

    @Override
    public double[] readDoubleArr() {
        try {
            String[] in = br.readLine().trim().split("\\s+");
            double[] arr = new double[in.length];

            for (int i = 0; i < in.length; i++) {
                arr[i] = Double.parseDouble(in[i]);
            }

            return arr;
        } catch (IOException | NumberFormatException e) {
            colorln("Input should be double", ANSI_RED);
            return this.readDoubleArr();
        }
    }

    public double getPositiveDoubleInput() {
        double number;
        boolean invalidNum;

        do {
            number = this.readDouble();
            invalidNum = number < 0;
            if (invalidNum) {
                colorErrorLn("Enter positive number.");
            }
        } while (invalidNum);

        return number;
    }

    public int getValidIntFromUserInput(String invalidMessage, int start, int end) {
        int number;
        boolean invalidNum;

        do {
            number = this.readInt();
            invalidNum = number < start || number > end;
            if (invalidNum) {
                colorln(invalidMessage, ANSI_RED);
            }
        } while (invalidNum);

        return number;
    }
}
