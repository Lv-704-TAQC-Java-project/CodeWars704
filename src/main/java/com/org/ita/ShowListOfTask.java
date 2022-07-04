package com.org.ita;

import com.org.ita.utils.Tasks;

public class ShowListOfTask implements Runner{
    @Override
    public void run() {
        SettingsMenu.clearScreen();
        int count=0;
        for (Tasks task:Tasks.values()) {
            System.out.println(count++ +")"+task.getTaskName());
        }
        System.out.println("Please enter to return to the menu: ");
        String sc=scanner.nextLine();
    }
}
