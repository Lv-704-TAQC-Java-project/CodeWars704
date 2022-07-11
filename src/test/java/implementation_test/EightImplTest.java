package implementation_test;

import com.org.ita.kata.Eight;
import org.testng.Assert;
import org.testng.annotations.*;
import implementation_test.data_provider.EightData;

public class EightImplTest {

    @DataProvider(name = "amIWilsonTestData")
    public Object[][] amIWilsonTestData() {
        return EightData.amIWilsonTestData();
    }

    @Test(dataProvider = "amIWilsonTestData")
    public void amIWilsonTest(Eight impl, boolean expected, double number) {
        boolean actual = impl.amIWilson(number);
        Assert.assertEquals(actual, expected);
    }
}
