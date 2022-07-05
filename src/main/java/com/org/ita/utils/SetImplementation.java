package com.org.ita.utils;

import com.org.ita.SettingsMenu;

public class SetImplementation implements Runner {
    @Override
    public void run() {
        SettingsMenu.clearScreen();
        System.out.println("Choose number of implementation");
        int a = scanner.nextInt();
        System.out.println();
        SettingsMenu.setSetImplementation(a);
    }
}
