package com.org.ita.menu;

import com.org.ita.utils.info.GroupInfo;
import com.org.ita.utils.*;

import java.util.ArrayList;
import java.util.List;
import static com.org.ita.utils.Message.*;

public class MainMenu {

    private static int currentImplementation = 0;
    private static final List<Runner> list = new ArrayList<>();

    Buffer br = new Buffer();

    public static void setCurrentImplementation(int currentImplementation) {
        MainMenu.currentImplementation = currentImplementation;
    }

    public static int getCurrentImplementation() {
        return currentImplementation;
    }

    private void menuTitle() {
        colorln(DIVIDER_MAIN, ANSI_BLUE);
        System.out.print("1) Select implementation ");
        
        String implement;
        if (currentImplementation == 0) {
            implement = "(No implementation selected)";
        } else {
            implement = "(Current implementation: " + GroupInfo.getMemberNameById(currentImplementation) + ")";
        }
        colorln(implement, currentImplementation == 0 ? ANSI_YELLOW : ANSI_GREEN);

        System.out.println("2) Task descriptions");
        System.out.println("3) Task runner");
        System.out.print("0) ");
        colorln("Exit", ANSI_RED);
    }

    public void run() {

        while (true){
            clearScreen();
            menuTitle();
            int chooseNumber = br.getValidIntFromUserInput("Invalid input! Number should be in range from 0 to 3.", 0, 3);

            list.add(new Exit());
            list.add(new ImplementationMenu());
            list.add(new TaskDescriptionMenu());
            list.add(new TaskRunnerMenu());
            list.get(chooseNumber).run();
        }
    }

    public static void clearScreen() {

    }
}
