package implementation_test;

import com.org.ita.kata.Eight;
import com.org.ita.kata.Five;
import com.org.ita.kata.Seven;
import com.org.ita.kata.Six;
import org.apache.commons.lang3.SerializationUtils;

public class UserImplementation {

    private static final Eight[] EIGHT_IMPLEMENTATION = new Eight[]{
            new com.org.ita.kata.implementation.avlrvn.EightImpl(),
            new com.org.ita.kata.implementation.clarmmym.EightImpl(),
            new com.org.ita.kata.implementation.dankomax.EightImpl(),
            new com.org.ita.kata.implementation.MyroslavaVynokur.EightImpl(),
            new com.org.ita.kata.implementation.nastiakomarenko.EightImpl(),
            new com.org.ita.kata.implementation.OliaZakharcuk.EightImpl(),
            new com.org.ita.kata.implementation.YaroslavTarasovych.EightImpl(),
            new com.org.ita.kata.implementation.ykireyeva.EightImpl()

    };

    private static final Seven[] SEVEN_IMPLEMENTATION = new Seven[]{
            new com.org.ita.kata.implementation.avlrvn.SevenImpl(),
            new com.org.ita.kata.implementation.clarmmym.SevenImpl(),
            new com.org.ita.kata.implementation.dankomax.SevenImpl(),
            new com.org.ita.kata.implementation.MyroslavaVynokur.SevenImpl(),
            new com.org.ita.kata.implementation.nastiakomarenko.SevenImpl(),
            new com.org.ita.kata.implementation.OliaZakharcuk.SevenImpl(),
            new com.org.ita.kata.implementation.YaroslavTarasovych.SevenImpl(),
            new com.org.ita.kata.implementation.ykireyeva.SevenImpl()
    };

    private static final Six[] SIX_IMPLEMENTATION = new Six[]{
            new com.org.ita.kata.implementation.avlrvn.SIxImpl(),
            new com.org.ita.kata.implementation.clarmmym.SIxImpl(),
            new com.org.ita.kata.implementation.dankomax.SIxImpl(),
            new com.org.ita.kata.implementation.MyroslavaVynokur.SIxImpl(),
            new com.org.ita.kata.implementation.nastiakomarenko.SIxImpl(),
            new com.org.ita.kata.implementation.OliaZakharcuk.SIxImpl(),
            new com.org.ita.kata.implementation.YaroslavTarasovych.SIxImpl(),
            new com.org.ita.kata.implementation.ykireyeva.SIxImpl()
    };

    private static final Five[] FIVE_IMPLEMENTATION = new Five[]{
            new com.org.ita.kata.implementation.avlrvn.FiveImpl(),
            new com.org.ita.kata.implementation.clarmmym.FiveImpl(),
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
