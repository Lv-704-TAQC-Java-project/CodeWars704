package com.org.ita.utils;

public enum Group {

    MEMBER_1(1, "Nezhuvaka Anna","avlrvn"),
    MEMBER_2(2, "Dashynych Olenka", "clarmmym"),
    MEMBER_3(3, "Danko Maksym", "dankomax"),
    MEMBER_4(4, "Myroslava Vynokur", "MyroslavaVynokur"),
    MEMBER_5(5, "Komarenko Anastasiia", "nastiakomarenko"),
    MEMBER_6(6, "Pivniuk Olha", "OlhaPivniuk"),
    MEMBER_7(7, "Zakharchuk Olia", "OliaZakharcuk"),
    MEMBER_8(8, "Tarasovich Yaroslav", "YaroslavTarasovych"),
    MEMBER_9(9, "Kireieva Yaryna", "ykireyeva");

    private final int id;
    private final String Name;
    private final String gitHub;

    Group(int id, String name, String gitHub) {
        this.id = id;
        this.Name = name;
        this.gitHub = gitHub;

    }

    public static String  getMemberNameById(int id) {
        for (Group member : values()) {
            if (member.id == id) {
                return member.getName();
            }
        }
        return null;
    }

    public static Group getMemberById (int id) {
        for (Group member : values()) {
            if (member.id == id) {
                return member;
            }
        }
        return null;
    }

    public static String  getMemberGitHubById(int id) {
        for (Group member : values()) {
            if (member.id == id) {
                return member.getGitHub();
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
}
