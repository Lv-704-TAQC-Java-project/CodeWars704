package com.org.ita.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Merge {
    public static Object[][] merge(Object[][] impl, Object[][] dataProvider) {
        int n = dataProvider.length;
        int m = impl.length;

        Object[][] merged = new Object[m * n][];
        int countLines = 0;

        for (Object[] objects : impl) {
            for (Object[] value : dataProvider) {

                List<Object> list = new ArrayList<>();
                Collections.addAll(list, objects);
                Collections.addAll(list, value);
                merged[countLines] = list.toArray();
                countLines++;
                list.clear();
            }
        }
        return merged;
    }
}
