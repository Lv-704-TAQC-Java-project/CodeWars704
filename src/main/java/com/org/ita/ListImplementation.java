package com.org.ita;

import java.util.ArrayList;
import java.util.List;


public class ListImplementation implements Runner{
   private static List<String> list = new ArrayList<>();

    @Override
    public void run() {
        SettingsMenu.clearScreen();
        list.add("avlrvn ");
        list.add("clarmmym ");
        list.add("dankomax ");
        list.add("MyroslavaVynokur ");
        list.add("nastiakomarenko ");
        list.add("OlhaPivniuk ");
        list.add("OliaZakharcuk ");
        list.add("YaroslavTarasovych ");
        list.add("ykireyeva ");
        for (String name: list) {
            System.out.println(name);
        }
        System.out.print("Please enter to return to the menu: ");
        String sc=scanner.nextLine();
    }
}
