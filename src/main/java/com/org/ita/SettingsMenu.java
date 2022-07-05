package com.org.ita;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class SettingsMenu {




    private static int setImplementation = 0;
    private static List<Runner> list = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void setSetImplementation(int setImplementation) {
        SettingsMenu.setImplementation = setImplementation;
    }

    public static int getSetImplementation() {
        return setImplementation;
    }

    private static void menuTitle() {
        System.out.println("1) View a list of all implementations (ID, First name Last name, github nickname)");
        String implement = "";
        if (setImplementation == 0) implement = "(You didn't choose implementation)";
        else implement = "(You choose number " + setImplementation + ")";
        System.out.println("2) Set an implementation " + implement);
        System.out.println("3) Show list of tasks");
        System.out.println("4) Start a task");
        System.out.println("0) Exit");
    }


    public static void run() {

        while (true){
            clearScreen();
            menuTitle();
            int chooseNumber = scanner.nextInt();
            list.add(new Exit());
            list.add(new ListImplementation());
            list.add(new SetImplementation());
            list.add(new ShowListOfTask());
            list.add(new StartTask());
            list.get(chooseNumber).run();
        }
    }

    public static void clearScreen() {

    }
}
