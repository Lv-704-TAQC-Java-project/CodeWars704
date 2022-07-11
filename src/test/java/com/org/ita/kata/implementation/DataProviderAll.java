package com.org.ita.kata.implementation;

import org.testng.annotations.DataProvider;

public class DataProviderAll {
    @DataProvider(name = "classEight")
    public Object[][] dataProviderEight(){
        return new Object[][]{{ new com.org.ita.kata.implementation.avlrvn.EigthImpl(), "avlrvn"},
                {new com.org.ita.kata.implementation.clarmmym.EigthImpl(), "clarmmym"},
                {new com.org.ita.kata.implementation.dankomax.EigthImpl(), "dankomax"},
                {new com.org.ita.kata.implementation.MyroslavaVynokur.EigthImpl(), "MyroslavaVynokur"},
                {new com.org.ita.kata.implementation.nastiakomarenko.EigthImpl(), "nastiakomarenko"},
                {new com.org.ita.kata.implementation.OlhaPivniuk.EigthImpl(), "OlhaPivniuk"},
                {new com.org.ita.kata.implementation.OliaZakharcuk.EigthImpl(), "OliaZakharcuk"},
                {new com.org.ita.kata.implementation.YaroslavTarasovych.EigthImpl(), "YaroslavTarasovych"},
                {new com.org.ita.kata.implementation.ykireyeva.EigthImpl(), "ykireyeva"}};
    }
    @DataProvider(name = "classSeven")
    public Object[][] dataProviderSeven(){
        return new Object[][]{{ new com.org.ita.kata.implementation.avlrvn.SevenImpl(), "avlrvn"},
                {new com.org.ita.kata.implementation.clarmmym.SevenImpl(), "clarmmym"},
                {new com.org.ita.kata.implementation.dankomax.SevenImpl(), "dankomax"},
                {new com.org.ita.kata.implementation.MyroslavaVynokur.SevenImpl(), "MyroslavaVynokur"},
                {new com.org.ita.kata.implementation.nastiakomarenko.SevenImpl(), "nastiakomarenko"},
                {new com.org.ita.kata.implementation.OlhaPivniuk.SevenImpl(), "OlhaPivniuk"},
                {new com.org.ita.kata.implementation.OliaZakharcuk.SevenImpl(), "OliaZakharcuk"},
                {new com.org.ita.kata.implementation.YaroslavTarasovych.SevenImpl(), "YaroslavTarasovych"},
                {new com.org.ita.kata.implementation.ykireyeva.SevenImpl(), "ykireyeva"}};
    }
    @DataProvider(name = "classSix")
    public Object[][] dataProviderSix(){
        return new Object[][]{{ new com.org.ita.kata.implementation.avlrvn.SIxImpl(), "avlrvn"},
                {new com.org.ita.kata.implementation.clarmmym.SIxImpl(), "clarmmym"},
                {new com.org.ita.kata.implementation.dankomax.SIxImpl(), "dankomax"},
                {new com.org.ita.kata.implementation.MyroslavaVynokur.SIxImpl(), "MyroslavaVynokur"},
                {new com.org.ita.kata.implementation.nastiakomarenko.SIxImpl(), "nastiakomarenko"},
                {new com.org.ita.kata.implementation.OlhaPivniuk.SIxImpl(), "OlhaPivniuk"},
                {new com.org.ita.kata.implementation.OliaZakharcuk.SIxImpl(), "OliaZakharcuk"},
                {new com.org.ita.kata.implementation.YaroslavTarasovych.SIxImpl(), "YaroslavTarasovych"},
                {new com.org.ita.kata.implementation.ykireyeva.SIxImpl(), "ykireyeva"}};
    }
    @DataProvider(name = "classFive")
    public Object[][] dataProviderFive(){
        return new Object[][]{{ new com.org.ita.kata.implementation.avlrvn.FiveImpl(), "avlrvn"},
                {new com.org.ita.kata.implementation.clarmmym.FiveImpl(), "clarmmym"},
                {new com.org.ita.kata.implementation.dankomax.FiveImpl(), "dankomax"},
                {new com.org.ita.kata.implementation.MyroslavaVynokur.FiveImpl(), "MyroslavaVynokur"},
                {new com.org.ita.kata.implementation.nastiakomarenko.FiveImpl(), "nastiakomarenko"},
                {new com.org.ita.kata.implementation.OlhaPivniuk.FiveImpl(), "OlhaPivniuk"},
                {new com.org.ita.kata.implementation.OliaZakharcuk.FiveImpl(), "OliaZakharcuk"},
                {new com.org.ita.kata.implementation.YaroslavTarasovych.FiveImpl(), "YaroslavTarasovych"},
                {new com.org.ita.kata.implementation.ykireyeva.FiveImpl(), "ykireyeva"}};
    }
}
