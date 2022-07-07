package com.org.ita.utils;

import static com.org.ita.utils.Message.*;


public class ListImplementation implements Runner{

    Buffer br = new Buffer();
    String tableFormat = "%-2s  %-23s %-16s\n";
    String tableHeader = ANSI_YELLOW + tableFormat + ANSI_RESET;

    @Override
    public void run() {
        SettingsMenu.clearScreen();
        colorHeader("Available implementations:", ANSI_BLUE);

        System.out.format(tableHeader, "ID", "FullName", "GitHub");
        for (Group member: Group.values()) {
            System.out.format(tableFormat, member.getId(), member.getName(), member.getGitHub());
        }

        colorln(DIVIDER, ANSI_BLUE);
        colorln("0 - return to main manu", ANSI_YELLOW);
        colorln("ID from 1 to " + Group.values().length + " - select imlementation", ANSI_GREEN);

        int a = br.getValidIntFromUserInput("Invalid input! Number should be in range from 1 to 24.", 0, 9);
        if (a > 0 && a <= Group.values().length) {
            SettingsMenu.setSetImplementation(a);
        }

    }
}
