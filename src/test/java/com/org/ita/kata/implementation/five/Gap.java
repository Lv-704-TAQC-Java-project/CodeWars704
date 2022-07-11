package com.org.ita.kata.implementation.five;

import com.org.ita.kata.Five;
import com.org.ita.kata.implementation.DataProviderAll;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;

public class Gap extends DataProviderAll {
    @Test(dataProvider = "classFive")
    public void Test1(Five five, String implementation){
        Five work = five;
        int[] input = new int[] {2,100,110};
        String expected = "[101, 103]";
        Assert.assertEquals(Arrays.toString(work.gap(input[0], input[1], input[2])), expected, "Error test 1 "+implementation+" input="+Arrays.toString(input));
    }
    @Test(dataProvider = "classFive")
    public void Test2(Five five, String implementation){
        Five work = five;
        int[] input = new int[] {4,100,110};
        String expected = "[103, 107]";
        Assert.assertEquals(Arrays.toString(work.gap(input[0], input[1], input[2])), expected, "Error test 2 "+implementation+" input="+Arrays.toString(input));
    }
    @Test(dataProvider = "classFive")
    public void Test3(Five five, String implementation){
        Five work = five;
        int[] input = new int[] { 6,100,110};
        Assert.assertNull(work.gap(input[0], input[1], input[2]),  "Error test 3 "+implementation+" input="+Arrays.toString(input));
    }
}
