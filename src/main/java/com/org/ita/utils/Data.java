package com.org.ita.utils;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Data {

    public static void menu() {

        System.out.println("Please select your pick:\n1 - show list of all implementations " +
                "\n2 - show all tasks \n3 - set somebody's implementation \n4 - run somebody's implementation");
    }

    public static void groupInfo() {
        File directoryPath = new File("src/main/java/com/org/ita/kata/implementation");
        //List of all files and directories
        String implementations[] = directoryPath.list();
        System.out.println("List of members:");
        for (int i = 1; i < implementations.length; i++) {
            System.out.println(i + " - " + implementations[i]);

        }
    }

}
