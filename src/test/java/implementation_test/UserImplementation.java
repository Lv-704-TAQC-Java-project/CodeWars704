package implementation_test;

import com.org.ita.kata.Eight;
import com.org.ita.kata.Five;
import com.org.ita.kata.Seven;
import com.org.ita.kata.Six;
import org.apache.commons.lang3.SerializationUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserImplementation {

    public static final Eight[] EIGHT_IMPLEMENTATION = new Eight[]{
            new com.org.ita.kata.implementation.avlrvn.EigthImpl(),
            new com.org.ita.kata.implementation.clarmmym.EigthImpl(),
            new com.org.ita.kata.implementation.dankomax.EigthImpl(),
            new com.org.ita.kata.implementation.MyroslavaVynokur.EigthImpl(),
            new com.org.ita.kata.implementation.nastiakomarenko.EigthImpl(),
            new com.org.ita.kata.implementation.OliaZakharcuk.EigthImpl(),
            new com.org.ita.kata.implementation.YaroslavTarasovych.EigthImpl(),
            new com.org.ita.kata.implementation.ykireyeva.EigthImpl()

    };

    public static final Seven[] SEVEN_IMPLEMENTATION = new Seven[]{
            new com.org.ita.kata.implementation.avlrvn.SevenImpl(),
            new com.org.ita.kata.implementation.clarmmym.SevenImpl(),
            new com.org.ita.kata.implementation.dankomax.SevenImpl(),
            new com.org.ita.kata.implementation.MyroslavaVynokur.SevenImpl(),
            new com.org.ita.kata.implementation.nastiakomarenko.SevenImpl(),
            new com.org.ita.kata.implementation.OliaZakharcuk.SevenImpl(),
            new com.org.ita.kata.implementation.YaroslavTarasovych.SevenImpl(),
            new com.org.ita.kata.implementation.ykireyeva.SevenImpl()
    };

    public static final Six[] SIX_IMPLEMENTATION = new Six[]{
            new com.org.ita.kata.implementation.avlrvn.SIxImpl(),
            new com.org.ita.kata.implementation.clarmmym.SIxImpl(),
            new com.org.ita.kata.implementation.dankomax.SIxImpl(),
            new com.org.ita.kata.implementation.MyroslavaVynokur.SIxImpl(),
            new com.org.ita.kata.implementation.nastiakomarenko.SIxImpl(),
            new com.org.ita.kata.implementation.OliaZakharcuk.SIxImpl(),
            new com.org.ita.kata.implementation.YaroslavTarasovych.SIxImpl(),
            new com.org.ita.kata.implementation.ykireyeva.SIxImpl()
    };

    public static final Five[] FIVE_IMPLEMENTATION = new Five[]{
            new com.org.ita.kata.implementation.avlrvn.FiveImpl(),
            new com.org.ita.kata.implementation.clarmmym.FiveImpl(),          //100% processor load issue
            new com.org.ita.kata.implementation.dankomax.FiveImpl(),
            new com.org.ita.kata.implementation.MyroslavaVynokur.FiveImpl(),
            new com.org.ita.kata.implementation.nastiakomarenko.FiveImpl(),
            new com.org.ita.kata.implementation.OliaZakharcuk.FiveImpl(),
            new com.org.ita.kata.implementation.YaroslavTarasovych.FiveImpl(),
            new com.org.ita.kata.implementation.ykireyeva.FiveImpl()
    };

    public static Object[][] combineImplWithTests(Object[] implementations, Object[][] baseTestData) {
        int fullTestDataLength = implementations.length * baseTestData.length;
        Object[][] fullTestData = new Object[fullTestDataLength][baseTestData[0].length + 1];
        int count = 0;
        for (Object impl : implementations) {
            Object[][] baseTestDataCopy = SerializationUtils.clone(baseTestData);
            for (Object[] baseTest : baseTestDataCopy) {
                for (int i = 0; i < baseTest.length + 1; i++) {
                    fullTestData[count][i] = i == 0 ? impl : baseTest[i - 1];
                }
                count++;
            }
        }

        return fullTestData;
    }

//    public static Object[][] combineImplWithTests(Object[] impl, Object[][] _data) {
//        List<Object[]> listObjects = new ArrayList<>();
//        for (Object obj_impl : impl) {
//            Object[][] data = SerializationUtils.clone(_data);
//            for (Object[] obj_data : data) {
//                int totalLength = obj_data.length + 1;
//                Object[] objArr = new Object[totalLength];
//
//                Object[] objDataClone = Arrays.stream(obj_data).toArray();
//                System.arraycopy(new Object[]{obj_impl}, 0, objArr, 0, 1);
//                System.arraycopy(objDataClone, 0, objArr, 1, totalLength - 1);
//
//                listObjects.add(objArr);
//            }
//        }
//
//        return listObjects.toArray(new Object[0][0]);
//    }

    public static Object[][] combineEightWithTestData(Object[][] baseTestData) {
        return combineImplWithTests(EIGHT_IMPLEMENTATION, baseTestData);
    }

    public static Object[][] combineSevenWithTestData(Object[][] baseTestData) {
        return combineImplWithTests(SEVEN_IMPLEMENTATION, baseTestData);
    }

    public static Object[][] combineSixWithTestData(Object[][] baseTestData) {
        return combineImplWithTests(SIX_IMPLEMENTATION, baseTestData);
    }

    public static Object[][] combineFiveWithTestData(Object[][] baseTestData) {
        return combineImplWithTests(FIVE_IMPLEMENTATION, baseTestData);
    }
}
