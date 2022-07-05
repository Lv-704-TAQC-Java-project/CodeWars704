package com.org.ita.utils;

import com.org.ita.SettingsMenu;

import java.util.ArrayList;
import java.util.List;


public class ListImplementation implements Runner {
   private static List<String> list = new ArrayList<>();

    @Override
    public void run() {
        SettingsMenu.clearScreen();
        for (Group member: Group.values()) {
            list.add("ID="+member.getId()+" Name: "+member.getName()+" NikName: "+member.getGitHub());
        }
        for (String name: list) {
            System.out.println(name);
        }
        System.out.print("Please enter to return to the menu: ");
        String sc=scanner.nextLine();
        System.out.println();
    }
}
