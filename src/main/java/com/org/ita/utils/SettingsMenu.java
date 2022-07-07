package com.org.ita.utils;

import java.util.ArrayList;
import java.util.List;
import static com.org.ita.utils.Message.*;

public class SettingsMenu {

    private static int setImplementation = 0;
    private static final List<Runner> list = new ArrayList<>();

    Buffer br = new Buffer();

    public static void setSetImplementation(int setImplementation) {
        SettingsMenu.setImplementation = setImplementation;
    }

    public static int getSetImplementation() {
        return setImplementation;
    }

    private void menuTitle() {
        colorln(DIVIDER_MAIN, ANSI_BLUE);
        System.out.print("1) Select implementation ");
        
        String implement;
        if (setImplementation == 0) {
            implement = "(No implementation selected)";
        } else {
            implement = "(Current implementation: " + Group.getMemberNameById(setImplementation) + ")";
        }
        colorln(implement, setImplementation == 0 ? ANSI_YELLOW : ANSI_GREEN);

        System.out.println("2) Task descriptions");
        System.out.println("3) Task runner");
        System.out.print("0) ");
        colorln("Exit", ANSI_RED);
    }

    public void run() {

        while (true){
            clearScreen();
            menuTitle();
            int chooseNumber;
            boolean invalidNum;

            do {
                chooseNumber = br.readInt();
                invalidNum =  chooseNumber < 0 || chooseNumber > 3;
                if (invalidNum) {
                    colorln("Invalid input! Number should be in range from 0 to 3.", ANSI_RED);
                }
            }
            while (invalidNum);

            list.add(new Exit());
            list.add(new ListImplementation());
            list.add(new ShowListOfTask());
            list.add(new StartTask());
            list.get(chooseNumber).run();
        }
    }

    public static void clearScreen() {

    }
}
