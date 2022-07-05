package com.org.ita.utils;

import com.org.ita.kata.Eight;

public enum Group {

    //    MEMBER_1(1, "Nezhuvaka Anna"),
//    MEMBER_2(2, "Dashynych Olenka"),
//    MEMBER_3(3, "Danko Maksym"),
    MEMBER_4(4, "Myroslava Vynokur", "MyroslavaVynokur",
            new com.org.ita.kata.implementation.MyroslavaVynokur.EigthImpl());
//    MEMBER_5(5, "Komarenko Anastasiia"),
//    MEMBER_6(6, "Pivniuk Olha"),
//    MEMBER_7(7, "Zakharchuk Olia"),
//    MEMBER_8(8, "Tarasovich Yaroslav"),
//    MEMBER_9(9, "Kireieva Yaryna");

    private final int id;
    private final String Name;
    private final Eight eight;
    private final String gitHub;

    Group(int id, String name, String gitHub, Eight eight) {
        this.id = id;
        this.Name = name;
        this.gitHub = gitHub;
        this.eight = eight;
    }

    public static String getMemberNameById(int id) {
        for (Group member : values()) {
            if (member.id == id) {
                return member.getName();
            }
        }
        return null;
    }

    public static String getMemberGitHubById(int id) {
        for (Group member : values()) {
            if (member.id == id) {
                return member.getGitHub();
            }
        }
        return null;
    }

    public static Group getMemberById(int id) {
        for (Group member : values()) {
            if (member.id == id) {
                return member;
            }
        }
        return null;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public String getGitHub() {
        return gitHub;
    }

    public Eight getEight() {
        return eight;
    }
}
