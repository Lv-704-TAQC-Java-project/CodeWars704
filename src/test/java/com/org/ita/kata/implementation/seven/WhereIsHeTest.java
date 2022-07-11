package com.org.ita.kata.implementation.seven;
import com.org.ita.kata.Seven;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class WhereIsHeTest {
    @DataProvider(name = "classSeven")
    public Object[][] dataProviderFunc(){
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

    @Test(dataProvider = "classSeven")
    public void Test1(Seven seven, String implementation){
        Seven work = seven;
        int[] input = new int[] { 3, 1, 1};
        int expected = 2;
        Assert.assertEquals(work.whereIsHe(input[0], input[1], input[2]), expected, "Error test 1 "+implementation);
    }

    @Test(dataProvider = "classSeven")
    public void Test2(Seven seven, String implementation){
        Seven work = seven;
        int[] input = new int[] { 5, 2, 3};
        int expected = 3;
        Assert.assertEquals(work.whereIsHe(input[0], input[1], input[2]), expected, "Error test 2 "+implementation);
    }

    @Test(dataProvider = "classSeven")
    public void Test3(Seven seven, String implementation){
        Seven work = seven;
        int[] input = new int[] { 6, 2, 3};
        int expected = 4;
        Assert.assertEquals(work.whereIsHe(input[0], input[1], input[2]), expected, "Error test 3 "+implementation);

    }
}
