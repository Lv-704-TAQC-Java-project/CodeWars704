package com.org.ita.utils;

import java.io.IOException;

import static com.org.ita.utils.Message.*;
import static com.org.ita.utils.Message.ANSI_BLUE;

public class ShowListOfTask implements Runner {

    Buffer br = new Buffer();

    @Override
    public void run() {
        SettingsMenu.clearScreen();
        colorHeader("Select task to view a description:", ANSI_BLUE);

        Tasks.showAllTasks();

        colorln(DIVIDER, ANSI_BLUE);
        colorln("1..24 - to view task description", ANSI_GREEN);
        colorln("0 - return to menu", ANSI_YELLOW);

        int number = br.getValidIntFromUserInput("Invalid input! Number should be in range from 1 to 24.", 0, 24);

        if (number != 0) {
            description(number);
        }
    }

    private void description(int num) {
        colorln(DIVIDER_MAIN, ANSI_BLUE);
        System.out.println(Tasks.getTaskById(num));
        colorln(DIVIDER, ANSI_BLUE);
        System.out.println(Tasks.getDescriptionById(num));
        colorln(DIVIDER, ANSI_BLUE);
        System.out.println("Click enter to return: ");

        br.readString();
        new ShowListOfTask().run();
    }
}
