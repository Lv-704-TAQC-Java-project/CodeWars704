package com.org.ita.utils;

import com.org.ita.SettingsMenu;

public class ShowListOfTask implements Runner {
    @Override
    public void run() {
        SettingsMenu.clearScreen();
        int count=0;
        for (Tasks task:Tasks.values()) {
            System.out.println(count++ +")"+task.getTaskName());
        }
        System.out.println("Choose task number(0..23) or return to menu (-1): ");
        int sc=scanner.nextInt();
        System.out.println();
        if (sc != -1) description(sc);
    }
    private void description(int num){
        System.out.println(num);
        System.out.println(Tasks.getTaskById(num));
        System.out.println(Tasks.getDescriptionById(num));
        System.out.println("Click enter to return: ");
        String sc=scanner.nextLine();
        sc=scanner.nextLine();
        System.out.println();
        new ShowListOfTask().run();
    }
}
