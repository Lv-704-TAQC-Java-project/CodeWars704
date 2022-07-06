package com.org.ita.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffer implements Reader {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    @Override
    public double readDouble() {
        try {
            return Double.parseDouble(Buffer.br.readLine());
        } catch (IOException e) {
            System.out.println("Input should be double");
            return this.readDouble();
        }
    }

    @Override
    public int readInt() {
        try {
            return Integer.parseInt(Buffer.br.readLine());
        } catch (IOException e) {
            System.out.println("Input should be int");
            return this.readInt();
        }
    }

    @Override
    public long readLong() {
        try {
            return Long.parseLong(Buffer.br.readLine());
        } catch (IOException e) {
            System.out.println("Input should be of a 'long' type");
            return this.readLong();
        }
    }

    @Override
    public String readString() {
        try {
            return Buffer.br.readLine();
        } catch (IOException e) {
            System.out.println("Input should be int");
            return this.readString();
        }
    }


}
