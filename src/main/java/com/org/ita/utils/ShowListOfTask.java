package com.org.ita.utils;

public class ShowListOfTask implements Runner {

    Buffer br = new Buffer();

    @Override
    public void run() {
        SettingsMenu.clearScreen();
        int count = 0;
        for (Tasks task : Tasks.values()) {
            System.out.println(count++ + ")" + task.getTaskName());
        }
        System.out.println("Choose task number(0..23) or return to menu (-1): ");
        int sc = br.readInt();
        System.out.println();
        if (sc != -1) description(sc);
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
