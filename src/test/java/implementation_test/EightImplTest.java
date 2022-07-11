package implementation_test;

import com.org.ita.kata.Eight;
import org.testng.Assert;
import org.testng.annotations.*;
import implementation_test.data_provider.EightData;

public class EightImplTest {

    @Test(dataProvider = "amIWilsonTestData", dataProviderClass = EightData.class)
    public void amIWilsonTest(Eight impl, boolean expected, double number) {
        boolean actual = impl.amIWilson(number);
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "data-provider-divisibleBy", dataProviderClass = EightData.class)
    public void testDivisibleBy(Eight impl, int[] data, int divisor, int[] expected) {
        int[] actual = impl.divisibleBy(data, divisor);
        Assert.assertEquals(actual, expected);
    }
}
