package unit_test;

import com.org.ita.kata.Eight;
import org.testng.Assert;
import org.testng.annotations.*;

public class EigthImplTest extends BasicImplTest {

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
        return userImpl.combineEightWithTestData(baseTestData);
    }

    @Test(dataProvider = "amIWilsonTestData")
    public void amIWilsonTest(Eight impl, boolean expected, double number) {
        boolean actual = impl.amIWilson(number);
        Assert.assertEquals(actual, expected);
    }
}
