package com.org.ita.kata.implementation.five;

import com.org.ita.kata.Five;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;

public class Gap {
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
    @Test(dataProvider = "classFive")
    public void Test1(Five five, String implementation){
        Five work = five;
        int[] input = new int[] { 2,100,110};
        String expected = "[101, 103]";
        Assert.assertEquals(Arrays.toString(work.gap(input[0], input[1], input[2])), expected, "Error test 1 "+implementation);
    }

    @Test(dataProvider = "classFive")
    public void Test2(Five five, String implementation){
        Five work = five;
        int[] input = new int[] {4,100,110};
        String expected = "[103, 107]";
        Assert.assertEquals(Arrays.toString(work.gap(input[0], input[1], input[2])), expected, "Error test 2 "+implementation);
    }

    @Test(dataProvider = "classFive")
    public void Test3(Five five, String implementation){
        Five work = five;
        int[] input = new int[] { 6,100,110};
//        String expected = null;
//        Assert.assertEquals(Arrays.toString(work.gap(input[0], input[1], input[2])), null, "Error test 3 "+implementation);
        Assert.assertNull(Arrays.toString(work.gap(input[0], input[1], input[2])),  "Error test 3 "+implementation);
    }
}
