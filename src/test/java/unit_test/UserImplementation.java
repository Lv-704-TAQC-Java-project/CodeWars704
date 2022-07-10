package unit_test;

import com.org.ita.kata.Eight;
import com.org.ita.kata.Five;
import com.org.ita.kata.Seven;
import com.org.ita.kata.Six;

public class UserImplementation {

    private final Eight[] EIGHT_IMPLEMENTATION = new Eight[]{
            new com.org.ita.kata.implementation.avlrvn.EigthImpl(),
            new com.org.ita.kata.implementation.clarmmym.EigthImpl(),
            new com.org.ita.kata.implementation.dankomax.EigthImpl(),
            new com.org.ita.kata.implementation.MyroslavaVynokur.EigthImpl(),
            new com.org.ita.kata.implementation.nastiakomarenko.EigthImpl(),
            new com.org.ita.kata.implementation.OlhaPivniuk.EigthImpl(),
            new com.org.ita.kata.implementation.OliaZakharcuk.EigthImpl(),
            new com.org.ita.kata.implementation.YaroslavTarasovych.EigthImpl(),
            new com.org.ita.kata.implementation.ykireyeva.EigthImpl()
    };

    private final Seven[] SEVEN_IMPLEMENTATION = new Seven[]{
            new com.org.ita.kata.implementation.avlrvn.SevenImpl(),
            new com.org.ita.kata.implementation.clarmmym.SevenImpl(),
            new com.org.ita.kata.implementation.dankomax.SevenImpl(),
            new com.org.ita.kata.implementation.MyroslavaVynokur.SevenImpl(),
            new com.org.ita.kata.implementation.nastiakomarenko.SevenImpl(),
            new com.org.ita.kata.implementation.OlhaPivniuk.SevenImpl(),
            new com.org.ita.kata.implementation.OliaZakharcuk.SevenImpl(),
            new com.org.ita.kata.implementation.YaroslavTarasovych.SevenImpl(),
            new com.org.ita.kata.implementation.ykireyeva.SevenImpl()
    };

    private final Six[] SIX_IMPLEMENTATION = new Six[]{
            new com.org.ita.kata.implementation.avlrvn.SIxImpl(),
            new com.org.ita.kata.implementation.clarmmym.SIxImpl(),
            new com.org.ita.kata.implementation.dankomax.SIxImpl(),
            new com.org.ita.kata.implementation.MyroslavaVynokur.SIxImpl(),
            new com.org.ita.kata.implementation.nastiakomarenko.SIxImpl(),
            new com.org.ita.kata.implementation.OlhaPivniuk.SIxImpl(),
            new com.org.ita.kata.implementation.OliaZakharcuk.SIxImpl(),
            new com.org.ita.kata.implementation.YaroslavTarasovych.SIxImpl(),
            new com.org.ita.kata.implementation.ykireyeva.SIxImpl()
    };

    private final Five[] FIVE_IMPLEMENTATION = new Five[]{
            new com.org.ita.kata.implementation.avlrvn.FiveImpl(),
//            new com.org.ita.kata.implementation.clarmmym.FiveImpl(),          //100% processor load issue
            new com.org.ita.kata.implementation.dankomax.FiveImpl(),
            new com.org.ita.kata.implementation.MyroslavaVynokur.FiveImpl(),
            new com.org.ita.kata.implementation.nastiakomarenko.FiveImpl(),
            new com.org.ita.kata.implementation.OlhaPivniuk.FiveImpl(),
            new com.org.ita.kata.implementation.OliaZakharcuk.FiveImpl(),
            new com.org.ita.kata.implementation.YaroslavTarasovych.FiveImpl(),
            new com.org.ita.kata.implementation.ykireyeva.FiveImpl()
    };

    public Object[][] combineImplWithTests(Object[] implementations, Object[][] baseTestData) {
        int fullTestDataLength = implementations.length * baseTestData.length;
        Object[][] fullTestData = new Object[fullTestDataLength][baseTestData[0].length + 1];

        int count = 0;
        for (Object impl : implementations) {
            for (Object[] baseTest : baseTestData) {
                for (int i = 0; i < baseTest.length + 1; i++) {
                    fullTestData[count][i] = i == 0 ? impl : baseTest[i - 1];
                }
                count++;
            }
        }

        return fullTestData;
    }

    public Object[][] combineEightWithTestData(Object[][] baseTestData) {
        return combineImplWithTests(EIGHT_IMPLEMENTATION, baseTestData);
    }

    public Object[][] combineSevenWithTestData(Object[][] baseTestData) {
        return combineImplWithTests(SEVEN_IMPLEMENTATION, baseTestData);
    }

    public Object[][] combineSixWithTestData(Object[][] baseTestData) {
        return combineImplWithTests(SIX_IMPLEMENTATION, baseTestData);
    }

    public Object[][] combineFiveWithTestData(Object[][] baseTestData) {
        return combineImplWithTests(FIVE_IMPLEMENTATION, baseTestData);
    }
}
