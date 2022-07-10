package com.org.ita.test;

import com.org.ita.kata.Six;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SixTest {
    Object[][] sixImpl = new Object[][]
            {
                    {new com.org.ita.kata.implementation.avlrvn.SIxImpl()},
                    {new com.org.ita.kata.implementation.clarmmym.SIxImpl()},
                    {new com.org.ita.kata.implementation.dankomax.SIxImpl()},
                    {new com.org.ita.kata.implementation.MyroslavaVynokur.SIxImpl()},
                    {new com.org.ita.kata.implementation.nastiakomarenko.SIxImpl()},
                    {new com.org.ita.kata.implementation.OlhaPivniuk.SIxImpl()},
                    {new com.org.ita.kata.implementation.OliaZakharcuk.SIxImpl()},
                    {new com.org.ita.kata.implementation.YaroslavTarasovych.SIxImpl()},
                    {new com.org.ita.kata.implementation.ykireyeva.SIxImpl()}
            };

    Object[][] testFindNb = new Object[][]
            {
                    {24723578342962L, -1},
                    {135440716410000L, 4824},
                    {40539911473216L, 3568}
            };


    @DataProvider(name = "data-provider-findNb")
    public Object[][] dataProviderFindNb() {
        return Merge.merge(sixImpl, testFindNb);
    }


    @Test(dataProvider = "data-provider-findNb")
    public void testFindNb(Six sixImpl, long data, long expected) {
        long actual = sixImpl.findNb(data);
        Assert.assertEquals(actual, expected, "ERROR");
    }

}