package com.org.ita.test;

import com.org.ita.kata.Eight;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EightTest {
    Object[][] eightImpl = new Object[][]
            {
                    {new com.org.ita.kata.implementation.avlrvn.EigthImpl()},
                    {new com.org.ita.kata.implementation.clarmmym.EigthImpl()},
                    {new com.org.ita.kata.implementation.dankomax.EigthImpl()},
                    {new com.org.ita.kata.implementation.MyroslavaVynokur.EigthImpl()},
                    {new com.org.ita.kata.implementation.nastiakomarenko.EigthImpl()},
                    {new com.org.ita.kata.implementation.OlhaPivniuk.EigthImpl()},
                    {new com.org.ita.kata.implementation.OliaZakharcuk.EigthImpl()},
                    {new com.org.ita.kata.implementation.YaroslavTarasovych.EigthImpl()},
                    {new com.org.ita.kata.implementation.ykireyeva.EigthImpl()}
            };


    Object[][] testDivisibleBy = new Object[][]
            {
                    {new int[]{1, 2, 3, 4, 5, 6}, 2, new int[]{2, 4, 6}},
                    {new int[]{1,2,3,4,5,6}, 3, new int[]{3, 6}},
                    {new int[]{0,1,2,3,4,5,6}, 4, new int[]{0, 4}}
            };

    @DataProvider(name = "data-provider-divisibleBy")
    public Object[][] dataProviderDivisibleBy() {
        return Merge.merge(eightImpl, testDivisibleBy);
    }

    @Test(dataProvider = "data-provider-divisibleBy")
    public void testDivisibleBy(Eight eightImpl, int[] data, int divisor, int[] expected) {
        int[] actual = eightImpl.divisibleBy(data, divisor);
        Assert.assertEquals(actual, expected, "ERROR");
    }

}