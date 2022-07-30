package com.org.ita.menu;

import com.org.ita.utils.ConsoleReader;
import com.org.ita.utils.Runner;
import com.org.ita.utils.info.TaskInfo;

import static com.org.ita.utils.Message.*;

public class TaskDescriptionMenu implements Runner {

    final ConsoleReader reader = new ConsoleReader();

    @Override
    public void run() {
        colorHeader("Select task to view a description:", ANSI_BLUE);

        TaskInfo.showAllTasks();

        colorln(DIVIDER, ANSI_BLUE);
        colorln("1..24 - to view task description", ANSI_GREEN);
        colorln("0 - return to menu", ANSI_YELLOW);

        int number = reader.getValidIntFromUserInput("Invalid input! Number should be in range from 1 to 24.", 0, 24);

        if (number != 0) {
            description(number);
        }
    }

    private void description(int num) {
        colorln(DIVIDER_MAIN, ANSI_BLUE);
        System.out.println(TaskInfo.getTaskById(num));
        colorln(DIVIDER, ANSI_BLUE);
        System.out.println(TaskInfo.getDescriptionById(num));
        colorln(DIVIDER, ANSI_BLUE);
        System.out.println("Click enter to return: ");

        reader.readString();
        new TaskDescriptionMenu().run();
    }
}
