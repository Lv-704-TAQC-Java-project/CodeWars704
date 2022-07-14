package com.org.ita.utils.info;

import com.org.ita.kata.Eight;
import com.org.ita.kata.Five;
import com.org.ita.kata.Seven;
import com.org.ita.kata.Six;

public enum GroupInfo {

    MEMBER_AnnaNezhuvaka(1, "Anna Nezhuvaka", "avlrvn",
            new com.org.ita.kata.implementation.avlrvn.EigthImpl(),
            new com.org.ita.kata.implementation.avlrvn.SevenImpl(),
            new com.org.ita.kata.implementation.avlrvn.SIxImpl(),
            new com.org.ita.kata.implementation.avlrvn.FiveImpl()),
    MEMBER_OlenkaDashynych(2, "Dashynych Olenka", "clarmmym",
            new com.org.ita.kata.implementation.clarmmym.EigthImpl(),
            new com.org.ita.kata.implementation.clarmmym.SevenImpl(),
            new com.org.ita.kata.implementation.clarmmym.SIxImpl(),
            new com.org.ita.kata.implementation.clarmmym.FiveImpl()),
    MEMBER_MaksymDanko(3, "Danko Maksym", "dankomax",
            new com.org.ita.kata.implementation.dankomax.EigthImpl(),
            new com.org.ita.kata.implementation.dankomax.SevenImpl(),
            new com.org.ita.kata.implementation.dankomax.SIxImpl(),
            new com.org.ita.kata.implementation.dankomax.FiveImpl()),
    MEMBER_MyroslavaVynokur(4, "Myroslava Vynokur", "MyroslavaVynokur",
            new com.org.ita.kata.implementation.MyroslavaVynokur.EigthImpl(),
            new com.org.ita.kata.implementation.MyroslavaVynokur.SevenImpl(),
            new com.org.ita.kata.implementation.MyroslavaVynokur.SIxImpl(),
            new com.org.ita.kata.implementation.MyroslavaVynokur.FiveImpl()),
    MEMBER_AnastasiiaKomarenko(5, "Komarenko Anastasiia", "nastiakomarenko",
            new com.org.ita.kata.implementation.nastiakomarenko.EigthImpl(),
            new com.org.ita.kata.implementation.nastiakomarenko.SevenImpl(),
            new com.org.ita.kata.implementation.nastiakomarenko.SIxImpl(),
            new com.org.ita.kata.implementation.nastiakomarenko.FiveImpl()),
    MEMBER_OliaZakharchuk(6, "Zakharchuk Olia", "OliaZakharchuk",
            new com.org.ita.kata.implementation.OliaZakharcuk.EigthImpl(),
            new com.org.ita.kata.implementation.OliaZakharcuk.SevenImpl(),
            new com.org.ita.kata.implementation.OliaZakharcuk.SIxImpl(),
            new com.org.ita.kata.implementation.OliaZakharcuk.FiveImpl()),
    MEMBER_YaroslavTarasovich(7, "Tarasovich Yaroslav", "YaroslavTarasovych",
            new com.org.ita.kata.implementation.YaroslavTarasovych.EigthImpl(),
            new com.org.ita.kata.implementation.YaroslavTarasovych.SevenImpl(),
            new com.org.ita.kata.implementation.YaroslavTarasovych.SIxImpl(),
            new com.org.ita.kata.implementation.YaroslavTarasovych.FiveImpl()),
    MEMBER_YarynaKireieva(8, "Kireieva Yaryna", "ykireyeva",
            new com.org.ita.kata.implementation.ykireyeva.EigthImpl(),
            new com.org.ita.kata.implementation.ykireyeva.SevenImpl(),
            new com.org.ita.kata.implementation.ykireyeva.SIxImpl(),
            new com.org.ita.kata.implementation.ykireyeva.FiveImpl());

    private final int id;
    private final String Name;
    private final String gitHub;
    private final Eight eight;
    private final Seven seven;
    private final Six six;
    private final Five five;

    GroupInfo(int id, String name, String gitHub, Eight eight, Seven seven, Six six, Five five) {
        this.id = id;
        this.Name = name;
        this.gitHub = gitHub;
        this.eight = eight;
        this.seven = seven;
        this.six = six;
        this.five = five;
    }

    public static String getMemberNameById(int id) {
        for (GroupInfo member : values()) {
            if (member.id == id) {
                return member.getName();
            }
        }
        return null;
    }

    public static String getMemberGitHubById(int id) {
        for (GroupInfo member : values()) {
            if (member.id == id) {
                return member.getGitHub();
            }
        }
        return null;
    }

    public static GroupInfo getMemberById(int id) {
        for (GroupInfo member : values()) {
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

    public Seven getSeven() {
        return seven;
    }

    public Six getSix() {
        return six;
    }

    public Five getFive() {
        return five;
    }
}
