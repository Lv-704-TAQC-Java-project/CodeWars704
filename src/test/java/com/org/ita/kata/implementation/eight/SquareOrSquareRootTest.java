package com.org.ita.kata.implementation.eight;

import com.org.ita.kata.Eight;
import com.org.ita.kata.implementation.DataProviderAll;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;


public class SquareOrSquareRootTest extends DataProviderAll {
    @Test(dataProvider = "classEight")
    public void Test1(Eight eight, String implementation){
            Eight work = eight;
            int[] input = new int[] { 4, 3, 9, 7, 2, 1 };
            int[] expected = new int[] { 2, 9, 3, 49, 4, 1 };
            Assert.assertEquals(Arrays.toString(work.squareOrSquareRoot(input)), Arrays.toString(expected), "Error test 1 "+implementation+" input="+Arrays.toString(input));

    }
    @Test(dataProvider = "classEight")
    public void Test2(Eight eight, String implementation){
        Eight work = eight;

        int[] input = new int[] { 100, 101, 5, 5, 1, 1 };
        int[] expected = new int[] { 10, 10201, 25, 25, 1, 1 };
        Assert.assertEquals(Arrays.toString(work.squareOrSquareRoot(input)), Arrays.toString(expected), "Error test 2 "+implementation+" input="+Arrays.toString(input));

    }
    @Test(dataProvider = "classEight")
    public void Test3(Eight eight, String implementation){
        Eight work = eight;

        int[] input = new int[] { 1, 2, 3, 4, 5, 6 };
        int[] expected = new int[] { 1, 4, 9, 2, 25, 36 };
        Assert.assertEquals(Arrays.toString(work.squareOrSquareRoot(input)), Arrays.toString(expected), "Error test 3 "+implementation+" input="+Arrays.toString(input));
    }
}
