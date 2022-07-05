package com.org.ita;

import java.util.ArrayList;
import java.util.List;


public class ListImplementation implements Runner{
   private static List<String> list = new ArrayList<>();

    @Override
    public void run() {
        SettingsMenu.clearScreen();
        list.add("ID=1 Nezhuvaka Annaavlrvn avlrvn");
        list.add("ID=2 Dashynych Olenka clarmmym ");
        list.add("ID=3 Danko Maksym dankomax ");
        list.add("ID=4 Vynokur Myroslava MyroslavaVynokur ");
        list.add("ID=5 Komarenko Anastasiia nastiakomarenko ");
        list.add("ID=6 Pivniuk Olha OlhaPivniuk ");
        list.add("ID=7 Zakharchuk Olia OliaZakharcuk ");
        list.add("ID=8 Tarasovich Yaroslav YaroslavTarasovych ");
        list.add("ID=9 Kireieva Yaryna ykireyeva ");
        for (String name: list) {
            System.out.println(name);
        }
        System.out.print("Please enter to return to the menu: ");
        String sc=scanner.nextLine();
    }
}
