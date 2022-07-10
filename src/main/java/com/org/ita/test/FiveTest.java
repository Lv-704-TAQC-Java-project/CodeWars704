package com.org.ita.test;

import com.org.ita.kata.Five;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FiveTest {
    Object[][] fiveImpl = new Object[][]
            {
                    {new com.org.ita.kata.implementation.avlrvn.FiveImpl()},
                    {new com.org.ita.kata.implementation.clarmmym.FiveImpl()},
                    {new com.org.ita.kata.implementation.dankomax.FiveImpl()},
                    {new com.org.ita.kata.implementation.MyroslavaVynokur.FiveImpl()},
                    {new com.org.ita.kata.implementation.nastiakomarenko.FiveImpl()},
                    {new com.org.ita.kata.implementation.OlhaPivniuk.FiveImpl()},
                    {new com.org.ita.kata.implementation.OliaZakharcuk.FiveImpl()},
                    {new com.org.ita.kata.implementation.YaroslavTarasovych.FiveImpl()},
                    {new com.org.ita.kata.implementation.ykireyeva.FiveImpl()}
            };

    Object[][] testZeros = new Object[][]
            {
                    {6, 1},
                    {14, 2},
                    {0, 0}
            };


    @DataProvider(name = "data-provider-zeros")
    public Object[][] dataProviderFindNb() {
        return Merge.merge(fiveImpl, testZeros);
    }


    @Test(dataProvider = "data-provider-zeros")
    public void testFindNb(Five fiveImpl, int data, int expected) {
        int actual = fiveImpl.zeros(data);
        Assert.assertEquals(actual, expected, "ERROR");
    }
}