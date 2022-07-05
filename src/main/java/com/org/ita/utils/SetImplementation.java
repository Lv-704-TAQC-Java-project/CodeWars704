package com.org.ita.utils;

public class SetImplementation implements Runner {

    Buffer br = new Buffer();

    @Override
    public void run() {
        SettingsMenu.clearScreen();
        System.out.println("Choose number of implementation");
        int a = br.readInt();
        System.out.println();
        SettingsMenu.setSetImplementation(a);

    }
}
