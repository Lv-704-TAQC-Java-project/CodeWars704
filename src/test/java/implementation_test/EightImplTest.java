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

    @Test(dataProvider = "positiveDataLiters", dataProviderClass = EightData.class)
    public void testLitersPositive(Eight eightImpl, double data, double expected) {
        double actual = eightImpl.liters(data);
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "negativeDataLiters", dataProviderClass = EightData.class)
    public void testLitersnegative(Eight eightImpl, double data, double expected) {
        double actual = eightImpl.liters(data);
        Assert.assertEquals(actual, expected);
    }


}
