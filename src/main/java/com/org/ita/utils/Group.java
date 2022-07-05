package com.org.ita.utils;

public enum Group {

    MEMBER_1(1, "Nezhuvaka Anna"),
    MEMBER_2(2, "Dashynych Olenka"),
    MEMBER_3(3, "Danko Maksym"),
    MEMBER_4(4, "Myroslava Vynokur"),
    MEMBER_5(5, "Komarenko Anastasiia"),
    MEMBER_6(6, "Pivniuk Olha"),
    MEMBER_7(7, "Zakharchuk Olia"),
    MEMBER_8(8, "Tarasovich Yaroslav"),
    MEMBER_9(9, "Kireieva Yaryna");

    private final int id;
    private final String Name;

    Group(int id, String name) {
        this.id = id;
        this.Name = name;
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

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

}
