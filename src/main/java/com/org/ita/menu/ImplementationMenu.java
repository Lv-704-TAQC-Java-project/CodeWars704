package com.org.ita.menu;

import com.org.ita.utils.Buffer;
import com.org.ita.utils.Runner;
import com.org.ita.utils.info.GroupInfo;

import static com.org.ita.utils.Message.*;


public class ImplementationMenu implements Runner {

    Buffer br = new Buffer();
    String tableFormat = "%-2s  %-23s %-16s\n";
    String tableHeader = ANSI_YELLOW + tableFormat + ANSI_RESET;

    @Override
    public void run() {
        colorHeader("Available implementations:", ANSI_BLUE);

        System.out.format(tableHeader, "ID", "FullName", "GitHub");
        for (GroupInfo member : GroupInfo.values()) {
            System.out.format(tableFormat, member.getId(), member.getName(), member.getGitHub());
        }

        colorln(DIVIDER, ANSI_BLUE);
        colorln("0 - return to main manu", ANSI_YELLOW);
        colorln("ID from 1 to " + GroupInfo.values().length + " - select imlementation", ANSI_GREEN);

        int a = br.getValidIntFromUserInput("Invalid input! Number should be in range from 1 to 24.", 0, 9);
        if (a > 0 && a <= GroupInfo.values().length) {
            MainMenu.setCurrentImplementation(a);
        }

    }
}
