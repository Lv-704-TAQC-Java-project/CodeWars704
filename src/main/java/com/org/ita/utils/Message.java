package com.org.ita.utils;

public class Message {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String DIVIDER_MAIN = "\n=================================================================================";
    public static final String DIVIDER = "---------------------------------------------------------------------------------";

    public static void color(String message, String color) {
        System.out.print(color + message + ANSI_RESET);
    }

    public static void colorln(String message, String color) {
        System.out.println(color + message + ANSI_RESET);
    }
}
