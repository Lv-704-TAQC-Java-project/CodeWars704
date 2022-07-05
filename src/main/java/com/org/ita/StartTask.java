package com.org.ita;


import com.org.ita.kata.Eight;
import com.org.ita.kata.Seven;
import com.org.ita.kata.implementation.YaroslavTarasovych.EigthImpl;


public class StartTask implements Runner{
    @Override
    public void run() {
        list();
        int task = scanner.nextInt();
        Object num;
        switch (task){
            case 1:
                num = null;
                break;
            case 2:
                num = null;
                break;
            case 3:
                num = null;
                break;
            case 4:
                num = null;
                break;
            case 0:

        }
    }

    private void list(){
        System.out.println("1) Task Eight");
        System.out.println("2) Task Seven");
        System.out.println("3) Task Six");
        System.out.println("4) Task Five");
        System.out.println("0) Exit");
    }

//    private static Object taskEight(){
//        Eight num = null;
//        int implement = SettingsMenu.getSetImplementation();
//        switch (implement){
//            case 1: num = new com.org.ita.kata.implementation.avlrvn.EigthImpl(); break;
//            case 2: num = new com.org.ita.kata.implementation.clarmmym.EigthImpl(); break;
//            case 3: num = new com.org.ita.kata.implementation.dankomax.EigthImpl(); break;
//            case 4: num = new com.org.ita.kata.implementation.MyroslavaVynokur.EigthImpl(); break;
//            case 5: num = new com.org.ita.kata.implementation.nastiakomarenko.EigthImpl(); break;
//            case 6: num = new com.org.ita.kata.implementation.OlhaPivniuk.EigthImpl(); break;
//            case 7: num = new com.org.ita.kata.implementation.OliaZakharcuk.EigthImpl(); break;
//            case 8: num = new com.org.ita.kata.implementation.YaroslavTarasovych.EigthImpl(); break;
//            case 9: num = new com.org.ita.kata.implementation.ykireyeva.EigthImpl();
//        }
//        return num;
//    }
//
//    private static Object taskSeven(){
//        Eight num = null;
//        int implement = SettingsMenu.getSetImplementation();
//        switch (implement){
//            case 1: num = new com.org.ita.kata.implementation.avlrvn.EigthImpl(); break;
//            case 2: num = new com.org.ita.kata.implementation.clarmmym.EigthImpl(); break;
//            case 3: num = new com.org.ita.kata.implementation.dankomax.EigthImpl(); break;
//            case 4: num = new com.org.ita.kata.implementation.MyroslavaVynokur.EigthImpl(); break;
//            case 5: num = new com.org.ita.kata.implementation.nastiakomarenko.EigthImpl(); break;
//            case 6: num = new com.org.ita.kata.implementation.OlhaPivniuk.EigthImpl(); break;
//            case 7: num = new com.org.ita.kata.implementation.OliaZakharcuk.EigthImpl(); break;
//            case 8: num = new com.org.ita.kata.implementation.YaroslavTarasovych.EigthImpl(); break;
//            case 9: num = new com.org.ita.kata.implementation.ykireyeva.EigthImpl();
//        }
//        return num;
//    }
//
//    private static Object taskSix(){
//        Eight num = null;
//        int implement = SettingsMenu.getSetImplementation();
//        switch (implement){
//            case 1: num = new com.org.ita.kata.implementation.avlrvn.EigthImpl(); break;
//            case 2: num = new com.org.ita.kata.implementation.clarmmym.EigthImpl(); break;
//            case 3: num = new com.org.ita.kata.implementation.dankomax.EigthImpl(); break;
//            case 4: num = new com.org.ita.kata.implementation.MyroslavaVynokur.EigthImpl(); break;
//            case 5: num = new com.org.ita.kata.implementation.nastiakomarenko.EigthImpl(); break;
//            case 6: num = new com.org.ita.kata.implementation.OlhaPivniuk.EigthImpl(); break;
//            case 7: num = new com.org.ita.kata.implementation.OliaZakharcuk.EigthImpl(); break;
//            case 8: num = new com.org.ita.kata.implementation.YaroslavTarasovych.EigthImpl(); break;
//            case 9: num = new com.org.ita.kata.implementation.ykireyeva.EigthImpl();
//        }
//        return num;
//    }
//
//    private static Object taskFive(){
//        Eight num = null;
//        int implement = SettingsMenu.getSetImplementation();
//        switch (implement){
//            case 1: num = new com.org.ita.kata.implementation.avlrvn.EigthImpl(); break;
//            case 2: num = new com.org.ita.kata.implementation.clarmmym.EigthImpl(); break;
//            case 3: num = new com.org.ita.kata.implementation.dankomax.EigthImpl(); break;
//            case 4: num = new com.org.ita.kata.implementation.MyroslavaVynokur.EigthImpl(); break;
//            case 5: num = new com.org.ita.kata.implementation.nastiakomarenko.EigthImpl(); break;
//            case 6: num = new com.org.ita.kata.implementation.OlhaPivniuk.EigthImpl(); break;
//            case 7: num = new com.org.ita.kata.implementation.OliaZakharcuk.EigthImpl(); break;
//            case 8: num = new com.org.ita.kata.implementation.YaroslavTarasovych.EigthImpl(); break;
//            case 9: num = new com.org.ita.kata.implementation.ykireyeva.EigthImpl();
//        }
//        return num;
//    }
}
