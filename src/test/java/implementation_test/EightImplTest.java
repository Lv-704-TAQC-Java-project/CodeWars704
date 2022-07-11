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
    
    @Test(dataProvider = "positive-data-Liters", dataProviderClass = EightData.class)
    public void positiveTestLiters(Eight eightImpl, double data, double expected) {
        double actual = eightImpl.liters(data);
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "negative-data-Liters", dataProviderClass = EightData.class)
    public void negativeTestLiters(Eight eightImpl, double data, double expected) {
        double actual = eightImpl.liters(data);
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "data-provider-countPositivesSumNegatives", dataProviderClass = EightData.class)
    public void testCountPositivesSumNegatives(Eight eightImpl, int[] numbers, int[] expected) {
        int[] actual = eightImpl.countPositivesSumNegatives(numbers);
    }

    @Test(dataProvider = "data-DivisibleBy", dataProviderClass = EightData.class)
    public void testDivisibleBy(Eight eightImpl, int[] numbers, int divider, int[] expected) {
        int[] actual = eightImpl.divisibleBy(numbers, divider);
        Assert.assertEquals(actual, expected);
    }

}
