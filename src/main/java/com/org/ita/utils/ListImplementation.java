package com.org.ita.utils;

import java.util.ArrayList;
import java.util.List;

public class ListImplementation implements Runner{

    private static List<String> list = new ArrayList<>();
    Buffer br = new Buffer();

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
        int sc=br.readInt();
        System.out.println();
    }
}
