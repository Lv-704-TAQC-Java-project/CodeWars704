package com.org.ita.test;

import com.org.ita.kata.Eight;
import com.org.ita.utils.info.GroupInfo;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class EightTest {

    //test Liters() only for one user:

    GroupInfo member;

    @DataProvider(name = "data-provider")
    public Object[][] testDataLiters() {
        return new Object[][]{
                {12, 6.0},
                {6, 3.0},
                {4, 2.0}
        };
    }

    //pass test data from data-provider.
    // 3 tests passes

//    @Test(dataProvider = "data-provider")
//    public void testLiters(double data, double expected) {
//        member = GroupInfo.getMemberById(4);
//        assert member != null;
//        double actual = member.getEight().liters(data);
//        Assert.assertEquals(actual, expected);
//    }

    //Array of Eight implemantations

    Object[][] EightImpl() {
        return new Object[][]{
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
    }

    // Array of test data for Liters()

    Object[][] testDataLiters = new Object[][]{
            {12, 6.0}, {6, 3.0}
    };

    // function which will merge test data and implementations into one array

    public Object[][] merge(Object[][] impl, Object[][] dataProvider) {
        int n = dataProvider.length;
        int m = impl.length;

        Object[][] merged = new Object[m * n][];
        int countLines = 0;

        for (Object[] objects : impl) {
            for (Object[] value : dataProvider) {

                int g = objects.length + value.length;

                List<Object> list = new ArrayList<>();

                for (int j = 0; j < objects.length; j++) {
                    list.add(objects[j]);
                }

                for (int k = 0; k < value.length; k++) {
                    list.add(value[k]);
                }
                merged[countLines] = list.toArray();

                countLines++;
                list.clear();
            }
        }
        return merged;
    }

    //data provider which passed implementations and test data

    @DataProvider(name = "data-provider2")
    public Object[][] testDataLiters2() {
        return merge(EightImpl(), testDataLiters);
    }

    // test which should run Liters() for each implementation

    @Test(dataProvider = "data-provider2")
    public void testLiters(Eight eightImpl, double data, double expected) {
        double actual = eightImpl.liters(data);
        Assert.assertEquals(actual, expected);
    }

}