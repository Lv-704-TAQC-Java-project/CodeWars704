package com.org.ita.utils;

public class ShowListOfTask implements Runner {

    Buffer br = new Buffer();

    @Override
    public void run() {
        SettingsMenu.clearScreen();
        Tasks.showAllTasks();
        System.out.println("Choose task number(1..24) or return to menu (-1): ");
        int number = br.readInt();
        System.out.println();
        if (number != -1) description(number);
    }

    private void description(int num) {
        System.out.println(num);
        System.out.println(Tasks.getTaskById(num));
        System.out.println(Tasks.getDescriptionById(num));
        System.out.println("Click enter to return: ");
        String sc = br.readString();
        sc = br.readString();
        System.out.println();
        new ShowListOfTask().run();
    }
}
