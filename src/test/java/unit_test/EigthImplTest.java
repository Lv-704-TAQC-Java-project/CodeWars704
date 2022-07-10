package unit_test;

import com.org.ita.kata.Eight;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EigthImplTest {
    public Eight[] IMPLEMENTATIONS = new Eight[]{
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

    @DataProvider(name = "amIWilsonTestData")
    public Object[][] amIWilsonTestData() {

        Object[][] baseTestData = new Object[][]{
                {true, 5.0},
                {true, 13.0},
                {true, 563.0},
                {false, 50},
                {false, 120},
                {false, 217},
                {false, 524},
                {false, 453},
                {false, 295},
                {false, 316},
                {false, 529},
                {false, 586},
                {false, 7},
                {false, 214},
                {false, 246},
                {false, 369},
                {false, 530},
                {false, 384},
        };

        int fullTestDataLength = IMPLEMENTATIONS.length * baseTestData.length;
        Object[][] fullTestData = new Object[fullTestDataLength][3];

        int count = 0;
        for (Eight implementation : IMPLEMENTATIONS) {
            for (Object[] baseTest : baseTestData) {
                fullTestData[count] = new Object[]{implementation, baseTest[0], baseTest[1]};
                count++;
            }
        }

        return fullTestData;
    }

    @Test(dataProvider = "amIWilsonTestData")
    public void amIWilsonTest(Eight impl, boolean result, double number) {
        Assert.assertEquals(impl.amIWilson(number), result);
    }
}
