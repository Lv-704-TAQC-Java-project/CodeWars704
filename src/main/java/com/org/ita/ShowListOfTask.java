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
        System.out.println("Choose task number or return to menu (-1): ");
        int sc=scanner.nextInt();
        if (sc != -1) description(sc);
    }
    private void description(int num){
        System.out.println(num);
        for (Tasks task:Tasks.values()) {
            if (task.getId() == num){
                System.out.println(task.getDescription());
            }
        }
        System.out.println("Click enter to return: ");
        String sc=scanner.nextLine();
        sc=scanner.nextLine();
        new ShowListOfTask().run();
    }
}
