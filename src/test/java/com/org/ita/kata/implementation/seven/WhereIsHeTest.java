package com.org.ita.kata.implementation.seven;
import com.org.ita.kata.Seven;
import com.org.ita.kata.implementation.DataProviderAll;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;


public class WhereIsHeTest extends DataProviderAll {
    @Test(dataProvider = "classSeven")
    public void Test1(Seven seven, String implementation){
        Seven work = seven;
        int[] input = new int[] {3, 1, 1};
        int expected = 2;
        Assert.assertEquals(work.whereIsHe(input[0], input[1], input[2]), expected, "Error test 1 "+implementation+" input="+ Arrays.toString(input));
    }
    @Test(dataProvider = "classSeven")
    public void Test2(Seven seven, String implementation){
        Seven work = seven;
        int[] input = new int[] {5, 2, 3};
        int expected = 3;
        Assert.assertEquals(work.whereIsHe(input[0], input[1], input[2]), expected, "Error test 2 "+implementation+" input="+Arrays.toString(input));
    }
    @Test(dataProvider = "classSeven")
    public void Test3(Seven seven, String implementation){
        Seven work = seven;
        int[] input = new int[] {6, 2, 3};
        int expected = 4;
        Assert.assertEquals(work.whereIsHe(input[0], input[1], input[2]), expected, "Error test 3 "+implementation+" input="+Arrays.toString(input));
    }
}
