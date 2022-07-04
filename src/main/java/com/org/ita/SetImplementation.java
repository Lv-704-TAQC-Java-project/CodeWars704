package com.org.ita;

public class SetImplementation implements Runner{
    @Override
    public void run() {
        SettingsMenu.clearScreen();
        System.out.println("Choose number of implementation");
        int a = scanner.nextInt();
        SettingsMenu.setSetImplementation(a);
    }
}
