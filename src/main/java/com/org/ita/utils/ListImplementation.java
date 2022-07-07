package com.org.ita.utils;

import java.util.ArrayList;
import java.util.List;
import static com.org.ita.utils.Message.*;

public class ListImplementation implements Runner{

    private static final List<String> list = new ArrayList<>();
    Buffer br = new Buffer();

    @Override
    public void run() {
        SettingsMenu.clearScreen();

        colorln(DIVIDER, ANSI_BLUE);
        colorln("Available implementations:", ANSI_BLUE);
        colorln(DIVIDER, ANSI_BLUE);

        for (Group member: Group.values()) {
            list.add("ID="+member.getId()+" Name: "+member.getName()+" NikName: "+member.getGitHub());
        }
        for (String name: list) {
            System.out.println(name);
        }

        colorln(DIVIDER, ANSI_BLUE);
        colorln("0 - return to main manu", ANSI_YELLOW);
        colorln("ID from 1 to " + list.size() + " - select imlementation", ANSI_GREEN);

        int a = br.readInt();
        if (a > 0 && a <= Group.values().length) {
            SettingsMenu.setSetImplementation(a);
        } else {
            list.clear();
        }
    }
}
